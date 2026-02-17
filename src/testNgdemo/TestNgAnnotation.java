package testNgdemo;

import org.testng.annotations.*;

/*
@Before* Annotation - The annotated method will be run before the first test method in the current class is invoked.
@After* Annotation - The annotated method will be run after all the test methods in the current class.

 */
public class TestNgAnnotation {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This is before suite annotation");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("This is after suite annotation");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("This is before test annotation");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("This is after test annotation");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("This is before class annotation");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("This is after class annotation");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is before method annotation");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("This is after method annotation");
    }
    @Test
    public void test1() {
        System.out.println("This is test1 annotation");
    }
    @Test
    public void test2() {
        System.out.println("This is test2 annotation");
    }
}
