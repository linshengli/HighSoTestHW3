package test.RegressionTest.random;

import org.junit.experimental.categories.Categories;
import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;


public class FilteredSuite extends Categories {

    private static double TEST_METHODS_RANDOM = 1.0;  // default behavior is to run all methods

    public FilteredSuite(Class<?> arg0, RunnerBuilder arg1) throws InitializationError {
        super(extractMethodNamesFromAnnotation(arg0), arg1);
    }

    private static Class<?> extractMethodNamesFromAnnotation(Class<?> clazz) {
        SuiteMethods methodsAnnotation = clazz.getAnnotation(SuiteMethods.class);
        if (methodsAnnotation != null) {
            // if our MethodsAnnotation was specified, use it's value as our methods filter
            TEST_METHODS_RANDOM = methodsAnnotation.value();
        }
        return clazz;
    }

    public static Filter getCustomFilter() {
        Filter filter = new Filter() {
            @Override
            public boolean shouldRun(Description desc) {
                double rand = TEST_METHODS_RANDOM;
                double mr = Math.random();
                if (desc.getMethodName() == null) {
                    return true;
                }
                return mr < rand;
            }

            @Override
            public String describe() {
                return null;
            }
        };
        return filter;
    }

    @Override
    public void filter(Filter arg0) throws NoTestsRemainException {
        // At test suite startup, JUnit framework calls this method to install CategoryFilter.
        // Throw away the given filter and install our own method name filter 
        super.filter(getCustomFilter());
    }
}