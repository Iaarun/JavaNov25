package testNgdemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
Assertions in TestNG are used to validate the expected results of a test case against the actual results. They help ensure that the application under test behaves as expected and that any discrepancies are identified and reported.
 TestNG provides various assertion methods that can be used to perform different types of validations, such as checking for equality, verifying conditions, and validating exceptions.
 Two type os assertion
    1. Hard Assertion - A hard assertion is a type of assertion that immediately fails the test case if the assertion condition is not met. When a hard assertion fails, the test execution stops, and the remaining code in the test method is not executed. This means that if a hard assertion fails, any subsequent assertions or code will not be executed, and the test case will be marked as failed.
    2. Soft Assertion - A soft assertion is a type of assertion that allows the test case to continue executing even if the assertion condition is not met. When a soft assertion fails, it does not immediately fail the test case; instead, it records the failure and continues executing the remaining code in the test method. At the end of the test method, you can call a method to check if any soft assertions failed and report them accordingly. This allows you to gather multiple assertion failures in a single test case without stopping the execution prematurely.
    Assert and SoftAssert are the classes used for assertions in TestNG. The Assert class is used for hard assertions, while the SoftAssert class is used for soft assertions. Both classes provide various assertion methods to validate different conditions and compare expected and actual values.
    Differences between Assert and SoftAssert:
    1. Assert (Hard Assertion):
    - If an assertion fails, the test case is immediately marked as failed, and the remaining code in the test method is not executed.
    - It is used when you want to ensure that a specific condition is met before proceeding with the rest of the test case.
    - Example: Assert.assertEquals(actualValue, expectedValue);
    2. SoftAssert (Soft Assertion):
    - If an assertion fails, the test case continues to execute, and the failure is recorded without immediately marking the test case as failed.
    - It is used when you want to gather multiple assertion failures in a single test case without stopping the execution prematurely.
    - Example: SoftAssert softAssert = new SoftAssert();
               softAssert.assertEquals(actualValue, expectedValue);
               softAssert.assertAll(); // This will check for all soft assertion failures and report them.

Retry Mechanism: Retry mechanism in TestNG allows you to automatically re-run failed test cases a specified number of times.
This is useful for handling intermittent issues or flaky tests that may fail due to temporary conditions, such as network instability or timing issues. By implementing a retry mechanism, you can increase the reliability of your test suite and reduce the chances of false negatives caused by transient failures.
 */

@Listeners(ListenersTestNg.class)
public class AssertionDemo {

    @Test(retryAnalyzer = RetryFailed.class)
 public void hasrdAssertdemo(){
     System.out.println("Asserting values using hard assertions");
     int a = 10;
     int b = 20;

     int sum = a + b;
     int multiply = a * b;
     Assert.assertEquals(sum,300,"Sum is not correct");
     Assert.assertEquals(multiply,200,"Multiplication is not correct");

     System.out.println("Arithmetic operations performed successfully");

 }

 @Test (retryAnalyzer = RetryFailed.class)
    public void softAssertdemo(){
     SoftAssert softAssert = new SoftAssert();
        System.out.println("Asserting values using hard assertions");
        int a = 10;
        int b = 20;

        int sum = a + b;
        int multiply = a * b;
     softAssert.assertEquals(sum,30,"Sum is not correct");
     softAssert.assertEquals(multiply,200,"Multiplication is not correct");
        System.out.println("Arithmetic operations performed successfully");
        softAssert.assertAll();

    }

}
