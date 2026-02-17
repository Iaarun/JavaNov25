package testNgdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstTestNg {
    WebDriver driver;
@BeforeMethod
public void launchBrowser(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void assignment4(){
        driver.get("https://live.techpanda.org/index.php/");
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
