package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class Seleniumscripts {
   String url= "https://www.selenium.dev/";
    WebDriver driver;
    public static void main(String[] args) {
      Seleniumscripts seleniumscripts = new Seleniumscripts();
      seleniumscripts.launchBrowser("chrome");
      seleniumscripts.navigationCommands();
      seleniumscripts.teardown();

    }

    public void launchBrowser(String browser){
        switch (browser.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println(browser+" Browser not supported");
        }

        driver.manage().window().maximize();

    }

    public void navigationCommands(){
        // to launch the application
        driver.navigate().to(url);
        //get current url
        String c_url=  driver.getCurrentUrl();
        System.out.println(c_url);
        //get page title
        String pageTitle= driver.getTitle();
        System.out.println("Page Title: "+pageTitle);
        //return tab id
        String tabId= driver.getWindowHandle();
        System.out.println("Tab id:"+ tabId);
        //open new tab
     //   driver.switchTo().newWindow(WindowType.TAB);
        //return tab ids of all the open tabs on a browser
    //     Set<String> allid= driver.getWindowHandles();
    //     System.out.println(allid);
        driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
        System.out.println("Page Title: "+driver.getTitle()); //Downloads

        //click on back navigation button
        driver.navigate().back();
        System.out.println("Page Title: "+driver.getTitle()); //selenium

        driver.navigate().forward(); //Download
        System.out.println("Page Title: "+driver.getTitle());

        driver.navigate().refresh();

    }

    public void teardown(){
        driver.quit();
    }
}
