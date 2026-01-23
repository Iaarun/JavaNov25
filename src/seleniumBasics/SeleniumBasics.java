package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

    public static void main(String[] args) {
            SeleniumBasics seleniumBasics = new SeleniumBasics();
            seleniumBasics.launchBrowser();
    }

    public void launchBrowser(){
        // Systems.setProperty("browserKey, "Absolutepath/to/chromedriver");
   //     System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\cd140\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //launch the url
        driver.get("https://www.selenium.dev/");

        driver.close();
        driver.quit();
    }
}
