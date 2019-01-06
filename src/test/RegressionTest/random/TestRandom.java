package test.RegressionTest.random;

import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import test.EqualClassTest.ConvertPressureTest;
import test.EqualClassTest.ConvertTemperatureTest;
import test.EqualClassTest.ConverterServiceTest;

import java.lang.reflect.Method;
import java.util.LinkedList;

public class TestRandom {
    public static void main(String[] args) {
        JUnitCore junitRunner = new JUnitCore();
        LinkedList<Class> randomTestClasses = new LinkedList<>();
        randomTestClasses.add(ConvertTemperatureTest.class);
        randomTestClasses.add(ConvertPressureTest.class);
        randomTestClasses.add(ConverterServiceTest.class);
        int successNum = 0;
        int totalTestCase = 0;
        int total = 0;
        for (Class testClass : randomTestClasses) {
            Method[] methods = testClass.getMethods();
            for (Method method : methods) {
                total += 1;
                if (Math.random() < 0.5) {
                    totalTestCase += 1;
                    if (method.isAnnotationPresent(org.junit.Test.class)) {
                        Request request = Request.method(testClass, method.getName());
                        Result result = junitRunner.run(request);
                        System.out.println(result.wasSuccessful());
                        if (result.wasSuccessful()) {
                            successNum += 1;
                        }
                    }
                }
            }
        }
        System.out.println("Total test case:" + Integer.toString(total));
        System.out.println("Total running test case:" + Integer.toString(totalTestCase));
        System.out.println("Total success test case:" + Integer.toString(successNum));
    }
}
