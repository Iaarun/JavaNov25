package testNgdemo;

import org.testng.annotations.*;

/*
@Before* Annotation - The annotated method will be run before the first test method in the current class is invoked.
@After* Annotation - The annotated method will be run after all the test methods in the current class.

priority - The priority attribute is used to specify the order of execution of test methods. The lower the priority number, the earlier the test method will be executed. If no priority is specified, the default priority is 0. Test methods with the same priority will be executed in an arbitrary order.
invocationCount - The invocationCount attribute is used to specify the number of times a test method should be executed. By default, it is set to 1, meaning the test method will be executed once. If you set invocationCount to a value greater than 1, the test method will be executed that many times.
 */
public class PriorityDemo {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is before method annotation from TestNgAnnotation2 class");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("This is after method annotation from TestNgAnnotation2 class");
    }
    @Test(priority = 3)
    public void atest1() {
        System.out.println("This is test1 annotation  from TestNgAnnotation2 class");
    }
    @Test (priority = 1)
    public void btest2() {
        System.out.println("This is test2 annotation from TestNgAnnotation2 class");
    }
    @Test (priority = 4)
    public void test3() {
        System.out.println("This is test3 annotation from TestNgAnnotation2 class");
    }
    @Test (priority = 2)
    public void test4() {
        System.out.println("This is test4 annotation from TestNgAnnotation2 class");
    }
    @Test(enabled = false)
    public void test5() {
        System.out.println("This is test5 annotation from TestNgAnnotation2 class");
    }
    @Test(priority = -1 , invocationCount = 1)
    public void test6() {
        System.out.println("This is test6 annotation from TestNgAnnotation2 class");
    }
}
