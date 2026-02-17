package testNgdemo;

import org.testng.annotations.*;

/*
@Before* Annotation - The annotated method will be run before the first test method in the current class is invoked.
@After* Annotation - The annotated method will be run after all the test methods in the current class.

 */
public class TestNgAnnotation2 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This is before suite annotation from TestNgAnnotation2 class");
    }
    @AfterSuite
    public void afterSuite() {

        System.out.println("This is after suite annotation from TestNgAnnotation2 class");
    }
    @BeforeTest
    public void beforeTest() {

        System.out.println("This is before test annotation from TestNgAnnotation2 class ");
    }
    @AfterTest
    public void afterTest() {

        System.out.println("This is after test annotation from TestNgAnnotation2 class");
    }
    @BeforeClass
    public void beforeClass() {

        System.out.println("This is before class annotation from TestNgAnnotation2 class");
    }
    @AfterClass
    public void afterClass() {

        System.out.println("This is after class annotation from TestNgAnnotation2 class");
    }
    @BeforeMethod
    public void beforeMethod() {

        System.out.println("This is before method annotation from TestNgAnnotation2 class");
    }
    @AfterMethod
    public void afterMethod() {

        System.out.println("This is after method annotation from TestNgAnnotation2 class");
    }
    @Test
    public void test1() {

        System.out.println("This is test1 annotation  from TestNgAnnotation2 class");
    }
    @Test
    public void test2() {
        System.out.println("This is test2 annotation from TestNgAnnotation2 class");
    }
}
