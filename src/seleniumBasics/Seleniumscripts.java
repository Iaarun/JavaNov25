package seleniumBasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
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
    String url = "https://www.selenium.dev/";
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        Seleniumscripts seleniumscripts = new Seleniumscripts();
        seleniumscripts.launchBrowser("chrome");
        seleniumscripts.handleframes();
        seleniumscripts.teardown();

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

    public void navigationCommands() {
        // to launch the application
        driver.navigate().to(url);
        //get current url
        String c_url = driver.getCurrentUrl();
        System.out.println(c_url);
        //get page title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        //return tab id
        String tabId = driver.getWindowHandle();
        System.out.println("Tab id:" + tabId);
        //open new tab
        //   driver.switchTo().newWindow(WindowType.TAB);
        //return tab ids of all the open tabs on a browser
        Set<String> allid = driver.getWindowHandles();
        System.out.println(allid);
        driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
        System.out.println("Page Title: " + driver.getTitle()); //Downloads

        //click on back navigation button
        driver.navigate().back();
        System.out.println("Page Title: " + driver.getTitle()); //selenium

        driver.navigate().forward(); //Download
        System.out.println("Page Title: " + driver.getTitle());

        driver.navigate().refresh();

    }

    public void handleframes() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/frames.html");
        driver.switchTo().frame("frame-header");
        WebElement frameText = driver.findElement(By.xpath("//h1[@class='display-6']"));
        System.out.println("FrameText: " + frameText.getText());

        driver.switchTo().defaultContent(); //exit from the frame
    }

    public void handleModalWindow() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //locate the open modal button
        WebElement openmodal = driver.findElement(By.id("my-modal"));
        openmodal.click();
        //locate the modal window
        WebElement modalwindow = driver.findElement(By.className("modal-content"));
        String modaltext = modalwindow.getText();
        System.out.println("Modal window text: " + modaltext);
        //locate the close button
        WebElement closebtn = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
        closebtn.click();
        String modalText = driver.findElement(By.id("modal-text")).getText();
        System.out.println("Modal window response text: " + modalText);
    }

    public void handleAlerts() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
        // informative alert
        WebElement info_alert = driver.findElement(By.id("my-alert"));

        info_alert.click();
        //switch the focus to alert
        Alert alert = driver.switchTo().alert();
        //fetch the text of the alert
        String alerttext = alert.getText();
        System.out.println("Alert text: " + alerttext);
        //click on ok button
        alert.accept();

        //confirmation alert
        WebElement confirm_alert = driver.findElement(By.id("my-confirm"));
        confirm_alert.click();
        Alert confirm = driver.switchTo().alert();
        //fetch the text of the alert
        String confirmtext = confirm.getText();
        System.out.println("Confirmation alert text: " + confirmtext);
        //click on cancel button
        //  confirm.dismiss();
        confirm.accept();
        String confirmText = driver.findElement(By.id("confirm-text")).getText();
        System.out.println("Confirmation alert response text: " + confirmText);

        //prompt alert
        WebElement prompt_alert = driver.findElement(By.id("my-prompt"));
        prompt_alert.click();
        Alert prompt = driver.switchTo().alert();
        //fetch the text of the alert
        String prompttext = prompt.getText();
        System.out.println("Prompt alert text: " + prompttext);
        //enter the data into the prompt alert input box
        prompt.sendKeys("Selenium Prompt Alert");
        //click on ok button
        prompt.accept();
        String promptResponse = driver.findElement(By.id("prompt-text")).getText();
        System.out.println("Prompt alert response text: " + promptResponse);

    }

    public void handleDropDown() throws InterruptedException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        //locate the drop down
        WebElement dropdown = driver.findElement(By.name("my-select"));
        //Select class is used to handle drop down
        Select select = new Select(dropdown);
        // get the deafault select option
        WebElement selectedoption = select.getFirstSelectedOption();
        System.out.println("Default selected option: " + selectedoption.getText());
        //get all the options of the drop down
        List<WebElement> allopt = select.getOptions();
        allopt.forEach(x -> System.out.println(x.getText()));
        //select by visible text
        select.selectByVisibleText("Two");
        Thread.sleep(2000);
        //select by value
        select.selectByValue("3");
        Thread.sleep(2000);
        //select by index
        select.selectByIndex(1);

        System.out.println("Is my dropdown supporting multi selection:" + select.isMultiple());
    }

    public void ClickOnButton() {
        driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        // click on the submitt button
        WebElement submit_btn = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submit_btn.click();
        //   submit_btn.submit(); // works only on form type of elements
        //fetch the success message after form submission
        WebElement message = driver.findElement(By.xpath("//main[@class='flex-shrink-2']/div[1]/div[3]/div[1]/h1"));
        //getText() method to fetch the text of the web element
        String msg = message.getText();
        System.out.println("Form submission message: " + msg);
    }

    public void senddatatoInputbox() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        //enter data into input box first locate the input box
        WebElement input = driver.findElement(By.id("my-text-id"));
        //check whether the input box is enabled or not
        boolean status = input.isEnabled();
        System.out.println("Input box enabled status: " + status);
        // isDisplayed method to check whether the input box is visible or not
        boolean isdisplayed = input.isDisplayed();
        System.out.println("Input box visible status: " + isdisplayed);

        input.clear(); //clear any pre populated data

        //use sendkeys method to enter data
        input.sendKeys("Selenium Practice");

        WebElement disabled = driver.findElement(By.name("my-disabled"));
        status = disabled.isEnabled();
        System.out.println("Disabled input box enabled status: " + status);

        isdisplayed = disabled.isDisplayed();
        System.out.println("Disabled input box visible status: " + isdisplayed);
        //   disabled.sendKeys("Trying to enter data");
    }

    public void handleChekbox() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        WebElement defaultCheckBox = driver.findElement(By.id("my-check-2"));
        boolean status = defaultCheckBox.isSelected();
        System.out.println("Checkbox selected status before click: " + status);
        if (status == false) {
            defaultCheckBox.click();
        }
        status = defaultCheckBox.isSelected();
        System.out.println("Checkbox selected status before click: " + status);

        WebElement radio2 = driver.findElement(By.id("my-radio-2"));
        status = radio2.isSelected();
        System.out.println("Radio button 2 selected status before click: " + status);
        if (status == false) {
            radio2.click();
        }
        status = radio2.isSelected();
        System.out.println("Radio button 2 selected status before click: " + status);

    }

    public void teardown() {
        driver.quit();
    }
}
