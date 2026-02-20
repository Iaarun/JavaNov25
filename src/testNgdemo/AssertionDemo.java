package testNgdemo;
/*
Assertions in TestNG are used to validate the expected results of a test case against the actual results. They help ensure that the application under test behaves as expected and that any discrepancies are identified and reported.
 TestNG provides various assertion methods that can be used to perform different types of validations, such as checking for equality, verifying conditions, and validating exceptions.
 Two type os assertion
    1. Hard Assertion - A hard assertion is a type of assertion that immediately fails the test case if the assertion condition is not met. When a hard assertion fails, the test execution stops, and the remaining code in the test method is not executed. This means that if a hard assertion fails, any subsequent assertions or code will not be executed, and the test case will be marked as failed.
    2. Soft Assertion - A soft assertion is a type of assertion that allows the test case to continue executing even if the assertion condition is not met. When a soft assertion fails, it does not immediately fail the test case; instead, it records the failure and continues executing the remaining code in the test method. At the end of the test method, you can call a method to check if any soft assertions failed and report them accordingly. This allows you to gather multiple assertion failures in a single test case without stopping the execution prematurely.
    Assert and SoftAssert

 */
public class AssertionDemo {

}
