package testNgdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    WebDriver driver;
    @BeforeMethod
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test(dataProvider = "loginData", dataProviderClass = TestData.class)
    public void login(String username, String password) throws InterruptedException {
        driver.get("https://live.techpanda.org/index.php/customer/account/login/");
        // driver.findElement(By.xpath("//a[normalize-space()='My Account']")).click();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.id("send2")).click();
    }

}
