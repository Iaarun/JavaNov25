package testNgdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
@Groups Annotation - The @Groups annotation is used to group test methods together. This allows you to run specific groups of tests based on your testing needs. You can assign one or more groups to a test method using the groups attribute of the @Test annotation. For example, you can group tests as "smoke", "regression", "sanity", etc., and then run only the tests that belong to a specific group when needed.
 @dependsOnGroups - The dependsOnGroups attribute is used to specify that a test method depends on the successful execution
 @dependsOnMethods - The dependsOnMethods attribute is used to specify that a test method depends on the successful execution of one or more other test methods. This allows you to create dependencies between test methods, ensuring that certain tests are executed only if the specified methods have passed. For example, if you have a test method that verifies user login functionality, you can use dependsOnMethods to ensure that it runs only after the test method that sets up the user account has successfully executed.
 @alwaysRun - The alwaysRun attribute is used to specify that a test method should always be executed, regardless of the success or failure of the methods it depends on. This is particularly useful when you want to ensure that certain cleanup or teardown actions are performed even if the dependent tests fail. For example, if you have a test method that cleans up test data after a series of tests, you can set alwaysRun to true to ensure that it runs even if some of the tests it depends on fail.
 @timeout - The timeOut attribute is used to specify the maximum time (in milliseconds) that a test method should be allowed to run before it is considered to have failed. If the test method takes longer than the specified time to execute, it will be marked as failed. This is useful for identifying tests that may be taking too long to execute and can help improve the overall efficiency of your test suite. For example, if you have a test method that interacts with a web service, you can set a timeout to ensure that it does not hang indefinitely if the service is unresponsive.
 
 */
public class GroupDemo {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is before method annotation from TestNgAnnotation2 class");
    }
    @AfterMethod
    public void afterMethod() {

        System.out.println("This is after method annotation from TestNgAnnotation2 class");
    }
    @Test (groups = "smoke")
    public void atest1() {
        System.out.println("This is test1 annotation  from TestNgAnnotation2 class");
    }
    @Test (groups = "smoke", timeOut = 3000)
    public void btest2() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("This is test2 annotation from TestNgAnnotation2 class");

    }
    @Test (groups = "regression",dependsOnGroups = "smoke", alwaysRun = true)
    public void test3() {
        System.out.println("This is test3 annotation from TestNgAnnotation2 class");
    }
    @Test (groups = "regression",dependsOnGroups = "smoke")
    public void test4() {
        System.out.println("This is test4 annotation from TestNgAnnotation2 class");
    }
    @Test (groups = {"sanity", "regression"}, dependsOnGroups = "smoke")
    public void test5() {
        System.out.println("This is test5 annotation from TestNgAnnotation2 class");
    }
    @Test (groups = {"sanity" , "regression"}, dependsOnGroups = "smoke")
    public void test6() {
        System.out.println("This is test6 annotation from TestNgAnnotation2 class");
    }

    @Test (dependsOnMethods = { "atest1"}, groups = "smoke")
    public void test7() {
        System.out.println("This is test7 annotation from TestNgAnnotation2 class");
    }
}
