package testNgdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNg implements ITestListener {
    /*
    Listeners in TestNG are used to perform specific actions or operations at various stages of the test execution process. They allow you to customize the behavior of your tests and provide additional functionality, such as logging, reporting, and handling test events.
    TestNG provides several built-in listeners that you can implement to enhance your test automation framework. Some commonly used listeners include:
    1. ITestListener: This listener allows you to listen to events related to individual test methods, such as when a test starts, finishes, fails, or is skipped. You can override methods like onTestStart(), onTestSuccess(), onTestFailure(), and onTestSkipped() to perform specific actions based on the test outcome.
    2. ISuiteListener: This listener allows you to listen to events related to the entire test suite, such as when a suite starts or finishes. You can override methods like onStart() and onFinish() to perform actions at the suite level.
    3. IInvokedMethodListener: This listener allows you to listen to events related to method invocation, such as before and after a method is invoked. You can override methods like beforeInvocation() and afterInvocation() to perform actions before or after a method is executed.
    4. IAnnotationTransformer: This listener allows you to modify the annotations of test methods at runtime. You can override the transform() method to change the behavior of test methods based on certain conditions.
    To use listeners in TestNG, you need to implement the desired listener interface(s) and then register them in your test class using the @Listeners annotation or by specifying them in the testng.xml configuration file.
     */

    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test suite started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test suite finished: " + context.getName());
    }
}
