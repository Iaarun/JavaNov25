package testNgdemo;

import org.testng.annotations.*;

/*
@Before* Annotation - The annotated method will be run before the first test method in the current class is invoked.
@After* Annotation - The annotated method will be run after all the test methods in the current class.

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
}
