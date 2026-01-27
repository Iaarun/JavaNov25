package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
/*
  isSelected() method is used to check whether a checkbox or radio button is selected or not
  isEnabled() method is used to check whether an input box or button is enabled or disabled
  isDisplayed() method is used to check whether an element is visible on the web page or not
  locators: id and name
  sendKeys() method is used to enter data into input box
  clear() method is used to clear any pre populated data in the input box
  click() method is used to click on a checkbox, radio button or button
  findElement() method is used to locate a web element on the web page and returns a WebElement
 */
public class Seleniumscripts {
   String url= "https://www.selenium.dev/";
    WebDriver driver;
    public static void main(String[] args) {
      Seleniumscripts seleniumscripts = new Seleniumscripts();
      seleniumscripts.launchBrowser("chrome");
      seleniumscripts.handleChekbox();
     // seleniumscripts.teardown();

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
         Set<String> allid= driver.getWindowHandles();
        System.out.println(allid);
        driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
        System.out.println("Page Title: "+driver.getTitle()); //Downloads

        //click on back navigation button
        driver.navigate().back();
        System.out.println("Page Title: "+driver.getTitle()); //selenium

        driver.navigate().forward(); //Download
        System.out.println("Page Title: "+driver.getTitle());

        driver.navigate().refresh();

    }

    public void senddatatoInputbox(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        //enter data into input box first locate the input box
      WebElement input= driver.findElement(By.id("my-text-id"));
      //check whether the input box is enabled or not
        boolean status= input.isEnabled();
        System.out.println("Input box enabled status: "+status);
        // isDisplayed method to check whether the input box is visible or not
      boolean isdisplayed=  input.isDisplayed();
        System.out.println("Input box visible status: "+isdisplayed);

        input.clear(); //clear any pre populated data

      //use sendkeys method to enter data
      input.sendKeys("Selenium Practice");

    WebElement disabled=  driver.findElement(By.name("my-disabled"));
        status= disabled.isEnabled();
        System.out.println("Disabled input box enabled status: "+status);

        isdisplayed=  disabled.isDisplayed();
        System.out.println("Disabled input box visible status: "+isdisplayed);
 //   disabled.sendKeys("Trying to enter data");
    }

    public void handleChekbox(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
     WebElement defaultCheckBox=   driver.findElement(By.id("my-check-2"));
     boolean status= defaultCheckBox.isSelected();
        System.out.println("Checkbox selected status before click: "+status);
     if (status==false){
         defaultCheckBox.click();
     }
        status= defaultCheckBox.isSelected();
        System.out.println("Checkbox selected status before click: "+status);

    WebElement radio2= driver.findElement(By.id("my-radio-2"));
        status= radio2.isSelected();
        System.out.println("Radio button 2 selected status before click: "+status);
        if (status==false){
            radio2.click();
        }
        status= radio2.isSelected();
        System.out.println("Radio button 2 selected status before click: "+status);

    }
    public void teardown(){
        driver.quit();
    }
}
