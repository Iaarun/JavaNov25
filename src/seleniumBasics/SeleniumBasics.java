package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {

    public static void main(String[] args) {
            SeleniumBasics seleniumBasics = new SeleniumBasics();
            seleniumBasics.launchFirefox();
    }

    public void launchChromeBrowser(){
        // Systems.setProperty("browserKey, "Absolutepath/to/chromedriver");
   //     System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\cd140\\chromedriver.exe");
        //WebDriver driver = new WebDriver()  not allowed because interface cannot be instantiated
       // ChromeDriver driver1 = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        driver.manage().window().minimize();
      //  driver.manage().window().fullscreen();
        //launch the url
        driver.get("https://www.selenium.dev/");

        driver.close();
        driver.quit();
    }

    public void launchFirefox(){
     //   System.setProperty("webdriver.gecko.driver","pathtogeckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        driver.quit();
    }

}
