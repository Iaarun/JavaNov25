package assignementSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AssignmentSolutions {
    WebDriver driver;
    public static void main(String[] args) {
        AssignmentSolutions obj = new AssignmentSolutions();
        obj.launchBrowser("chrome");
        obj.assignment4();
         obj.teardown();
    }

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
           driver.manage().window().maximize();
    }
    public void teardown() {
        driver.quit();
    }

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
