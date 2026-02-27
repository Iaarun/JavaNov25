package testNgdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

/*
@Groups Annotation - The @Groups annotation is used to group test methods together. This allows you to run specific groups of tests based on your testing needs. You can assign one or more groups to a test method using the groups attribute of the @Test annotation. For example, you can group tests as "smoke", "regression", "sanity", etc., and then run only the tests that belong to a specific group when needed.
 @dependsOnGroups - The dependsOnGroups attribute is used to specify that a test method depends on the successful execution
 @dependsOnMethods - The dependsOnMethods attribute is used to specify that a test method depends on the successful execution of one or more other test methods. This allows you to create dependencies between test methods, ensuring that certain tests are executed only if the specified methods have passed. For example, if you have a test method that verifies user login functionality, you can use dependsOnMethods to ensure that it runs only after the test method that sets up the user account has successfully executed.
 @alwaysRun - The alwaysRun attribute is used to specify that a test method should always be executed, regardless of the success or failure of the methods it depends on. This is particularly useful when you want to ensure that certain cleanup or teardown actions are performed even if the dependent tests fail. For example, if you have a test method that cleans up test data after a series of tests, you can set alwaysRun to true to ensure that it runs even if some of the tests it depends on fail.
 @timeout - The timeOut attribute is used to specify the maximum time (in milliseconds) that a test method should be allowed to run before it is considered to have failed. If the test method takes longer than the specified time to execute, it will be marked as failed. This is useful for identifying tests that may be taking too long to execute and can help improve the overall efficiency of your test suite. For example, if you have a test method that interacts with a web service, you can set a timeout to ensure that it does not hang indefinitely if the service is unresponsive.
 
 */
public class ParameterizationDemo {
    WebDriver driver;
    @Parameters("browser")
    @BeforeMethod
    public void launchBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println(browser + " Browser not supported");
        }
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void assignment4(){
        driver.get("https://live.techpanda.org/index.php/");
        //print thread id
        System.out.println("Thread id: "+Thread.currentThread().getId());
        System.out.println();
        String pg_title= driver.findElement(By.xpath("//div[@class='page-title']/h2")).getText();
        System.out.println("Home page title: "+pg_title);
        //click on mobile menu
        driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
        // get mobile page title
        String mobilepg_title= driver.findElement(By.xpath("//h1[normalize-space()='Mobile']")).getText();
        System.out.println("Mobile page title: "+mobilepg_title);
        //Sort by dropdown
        WebElement sortby= driver.findElement(By.xpath("//select[@title='Sort By']"));
        Select select = new Select(sortby);
        select.selectByVisibleText("Name");
        List<WebElement> allPhones= driver.findElements(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li/div/h2/a"));
        List<String> phonenames= new ArrayList<>();

        for(WebElement phone:allPhones){
            phonenames.add(phone.getText().trim());
        }

        System.out.println("Phone names: "+phonenames);
    }


}
