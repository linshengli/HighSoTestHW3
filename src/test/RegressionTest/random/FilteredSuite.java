package test.RegressionTest.random;

import org.junit.experimental.categories.Categories;
import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;


public class FilteredSuite extends Categories {

    private static String[] TEST_METHODS_TO_RUN = {""};  // default behavior is to run all methods 

    public FilteredSuite(Class<?> arg0, RunnerBuilder arg1) throws InitializationError {
        super(extractMethodNamesFromAnnotation(arg0), arg1);
    }

    private static Class<?> extractMethodNamesFromAnnotation(Class<?> clazz) {
        SuiteMethods methodsAnnotation = clazz.getAnnotation(SuiteMethods.class);
        if (methodsAnnotation != null) {
            // if our MethodsAnnotation was specified, use it's value as our methods filter
            TEST_METHODS_TO_RUN = methodsAnnotation.value();
        }
        return clazz;
    }

    public static Filter getCustomFilter() {
        Filter f = new Filter() {
            @Override
            public boolean shouldRun(Description desc) {
                String methodName = desc.getMethodName();
                for (String subString : TEST_METHODS_TO_RUN) {
                    double rand = Double.valueOf(subString);
                    if (Math.random() < rand) {
                        return true;
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }

            @Override
            public String describe() {
                return null;
            }
        };
        return f;
    }

    @Override
    public void filter(Filter arg0) throws NoTestsRemainException {
        // At test suite startup, JUnit framework calls this method to install CategoryFilter.
        // Throw away the given filter and install our own method name filter 
        super.filter(getCustomFilter());
    }
}