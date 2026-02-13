package seleniumBasics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
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
    String filePath = "E:\\JavaAug25Session\\MavenProjectAug25\\src\\test\\resources\\testdata\\testImg.jpeg";
   String filepath1="E:\\screenshot\\test1.txt";
    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
        Seleniumscripts seleniumscripts = new Seleniumscripts();
      //  seleniumscripts.launchBrowser("chrome");
        seleniumscripts.usingChromeOptions();
   //   seleniumscripts.getDayfromDate();

        //   seleniumscripts.teardown();

    }

    public void usingChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--headless=new");
      //  options.addEncodedExtensions("")
        options.addArguments("--disable-infobars");
        options.setAcceptInsecureCerts(true);
        WebDriver    driver = new ChromeDriver(options);
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
        System.out.println(driver.getTitle());
        driver.quit();

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--private");
        firefoxOptions.addArguments("--disable-notifications");
        firefoxOptions.addArguments("--start-maximized");
        firefoxOptions.addArguments("--disable-popup-blocking");
        firefoxOptions.addArguments("--headless");
        firefoxOptions.setAcceptInsecureCerts(true);
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

     //   driver.manage().window().maximize();

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

    public void getDayfromDate(){
      LocalDate date=   LocalDate.now();
        System.out.println("Current date: "+date);
        System.out.println("Current day: "+date.getDayOfWeek());
        System.out.println(date.getDayOfMonth()+1);
      //  System.out.println("Tomorrow "+ Integer.parseInt(date.getDayOfMonth()+"")+1);

    //   LocalDate currentdate= LocalDate.parse(LocalDate.now().toString());
    }

    public void handleWebTales(){
        driver.get("https://www.dezlearn.com/webtable-example/");

       List<WebElement> cols=  driver.findElements(By.xpath("//table[@class='tg']/tbody/tr[1]/th"));
        System.out.println("Number of columns: "+cols.size());
        List<WebElement> rows=  driver.findElements(By.xpath("//table[@class='tg']/tbody/tr"));
        System.out.println("Number of rows: "+rows.size());
       // complete table data
       for (int i=2; i<=rows.size(); i++){
           for (int j=1; j<=2; j++){
               WebElement cellData= driver.findElement(By.xpath("//table[@class='tg']/tbody/tr["+i+"]/td["+j+"]"));
               System.out.print(cellData.getText()+" ");
           }
           System.out.println();
       }


    }

    public void seleniumwaits3(){
        /*3-    Fluent wait: it is a conditional wait and it will be applied to a specific web element, it will wait for the element to be present in the DOM and visible on the web page for the specified time duration,
                 it also allows to specify the polling time and ignore specific exceptions
         */
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Done!')]")));
        WebElement hiddenEle= driver.findElement(By.xpath("//p[contains(text(),'Done!')]"));
        System.out.println(hiddenEle.isDisplayed());
    }

    public void seleniumwaits2(){
           /*
              2-  explicit wait: it is a conditional wait and it will be applied to a specific web element, it will wait for the element to be present in the DOM and visible on the web page for the specified time duration,
                 if the element is not found within the specified time duration then it will throw TimeoutException
         */
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Done!')]")));
        WebElement hiddenEle= driver.findElement(By.xpath("//p[contains(text(),'Done!')]"));
        System.out.println(hiddenEle.isDisplayed());

    }

    public void seleniumwaits1(){
        /*
            1- implicit wait: it is a global wait and it will be applied to all the web elements in the script, it will wait for the element to be present in the DOM for the specified time duration,
             if the element is not found within the specified time duration then it will throw NoSuchElementException
         */
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement hiddenEle= driver.findElement(By.xpath("//p[contains(text(),'Done!')]"));
        System.out.println(hiddenEle.isDisplayed());
    }

    public void handleCalender() throws InterruptedException {
        //expected date 30 March2027
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.findElement(By.name("my-date")).click();
        String caldata=   driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]")).getText();
        System.out.println("calender data: "+caldata);
        System.out.println(Arrays.toString(caldata.split(" ")));
        String month=  caldata.split(" ")[0].trim();
        String year=  caldata.split(" ")[1].trim();
        System.out.println("Start Month: "+month+" Year: "+year);

        while (!(month.equals("March") && year.equals("2027"))){
          WebElement nextbutn=  driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']"));
          nextbutn.click();
          caldata=   driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]")).getText();
            month=  caldata.split(" ")[0].trim();
            year=  caldata.split(" ")[1].trim();
            System.out.println("Month: "+month+" Year: "+year);
        }

         driver.findElement(By.xpath("//td[normalize-space()='30']")).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath("//h1")).click(); //click outside the calendar

    }

    public void handletooltip(){
        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(0);
       WebElement age= driver.findElement(By.id("age"));
      WebElement yourage= driver.findElement(By.xpath("//label[@for='age']"));
       //tooltip
        Actions actions = new Actions(driver);
        actions.moveToElement(age).perform();
        actions.moveToElement(yourage).perform();
        WebElement tooltip = driver.findElement(By.id("age"));
        String tooltiptext=   tooltip.getDomAttribute("title");
        System.out.println("Tooltip text: "+tooltiptext);

    }
   public void fileUploadUsingRobotClass() throws AWTException, InterruptedException {
        /*
        Steps to handle file upload using Robot class
        1. Click on the file upload button to open the file upload window
        2. Use StringSelection class to copy the file path to clipboard
        3. Use Robot class to paste the file path in the file upload window and press enter key
        */
       driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
       WebElement myFile = driver.findElement(By.xpath("//input[@name='my-file']"));
     //  myFile.click(); // this action is throwing invalid argument exception because the file upload window is a OS level window and not a part of the web page
        Actions action = new Actions(driver);
        action.moveToElement(myFile).click().build().perform();
        Thread.sleep(200);
       StringSelection stringSelection = new StringSelection(filePath);
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
         Robot robot = new Robot();
         robot.delay(2000); //delay to allow the file upload window to open
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_V);
   }
    public void fileUpload() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement myFile = driver.findElement(By.name("my-file"));
        myFile.sendKeys(filePath);

    }

    public void handleMorethantwoWindow() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/index.html");
        WebElement webform = driver.findElement(By.xpath("//a[normalize-space()='Web form']"));
        WebElement dropdownpage = driver.findElement(By.xpath("//a[normalize-space()='Dropdown menu']"));
        Actions action = new Actions(driver);
        action.moveToElement(webform).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        action.moveToElement(dropdownpage).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Set<String> allTabs = driver.getWindowHandles();
        Iterator<String> it = allTabs.iterator();
        String ifrsttab = it.next();
        System.out.println("First tab id: " + ifrsttab + " URL: " + driver.getCurrentUrl());
        String secondtab = it.next();
        driver.switchTo().window(secondtab);
        System.out.println("Second tab id: " + secondtab + " URL: " + driver.getCurrentUrl());
        String thirdtab = it.next();
        driver.switchTo().window(thirdtab);
        System.out.println("Third tab id: " + thirdtab + " URL: " + driver.getCurrentUrl());

        driver.switchTo().window(ifrsttab);
        System.out.println("First tab id: " + ifrsttab + " URL: " + driver.getCurrentUrl());


    }

    public void handlemultipleWindows() throws InterruptedException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/index.html");
        //works when you have two tabs opened and you want to switch to the other tab and perform some actions and then switch back to the first tab
        String firstTab = driver.getWindowHandle();
        System.out.println("First tab id: " + firstTab);
        System.out.println(driver.getTitle());
        WebElement webform = driver.findElement(By.xpath("//a[normalize-space()='Web form']"));
        Actions action = new Actions(driver);
        action.moveToElement(webform).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Set<String> allTabs = driver.getWindowHandles();

        for (String tab : allTabs) {
            if (!tab.equals(firstTab)) {
                driver.switchTo().window(tab);
                System.out.println("Current tab title: " + driver.getTitle());
                Thread.sleep(2000);
                driver.close();
            }
        }
        driver.switchTo().window(firstTab);
    }

    public void captureScreehots() throws IOException {
        driver.get("https://jqueryui.com/slider/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        // complete webpage screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("E:\\screenshot\\fullpage" + System.currentTimeMillis() + ".jpg"));
        System.out.println("Full page screenshot captured successfully");
        // capture screenshot of a specific element
        js.executeScript("window.scrollTo(0,0)");
        file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("E:\\screenshot\\fulltoppage" + System.currentTimeMillis() + ".jpg"));
    }

    public void handlescroll() {
        //JavaScript executor
        driver.get("https://jqueryui.com/slider/");
        // random scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //   js.executeScript("window.scrollBy(0,500)"); //scroll down by 500 pixels
        // scroll till the specific element is visible
        WebElement tggleclass = driver.findElement(By.xpath("//a[contains(text(),'Toggle Class')]"));
        //  js.executeScript("arguments[0].scrollIntoView(true);",tggleclass);
        //scroll till the end of the page

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("window.scrollTo(0,0)"); //scroll to the top of the page

    }

    public void typeCharatcerInInputBox() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        WebElement inputbox = driver.findElement(By.name("my-text"));
        Actions action = new Actions(driver);
        action.moveToElement(inputbox).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello selenium").keyUp(Keys.LEFT_SHIFT).build().perform();
      /*
       Navigate to application
       Mousehover on submit button
       Print the background color of the button after mouse hover
       */

    }

    public void handleSlider() throws InterruptedException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        WebElement slider = driver.findElement(By.xpath("//input[@name='my-range']"));
        Actions action = new Actions(driver);
        //move the slider to right by 30 units
        action.clickAndHold(slider).moveByOffset(150, 0).release().build().perform();
        Thread.sleep(2000);
        action.clickAndHold(slider).moveByOffset(-250, 0).release().build().perform();
        //  action.dragAndDropBy(slider,100,0).perform();
    }

    public void dragAndDrop() {
        driver.get("https://jqueryui.com/droppable/");
        //switch to frame
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement tgt = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        //drag and drop using actions class
        //  action.dragAndDrop(src,tgt).perform();
        //chain of actions
        action.clickAndHold(src).moveToElement(tgt).release().build().perform();


    }

    public void framePractie() {
        driver.get("https://jqueryui.com/droppable/");
        //switch to frame
        driver.switchTo().frame(0); //index starts from 0
        //  WebElement frme = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        //  driver.switchTo().frame(frme);
        WebElement dragg = driver.findElement(By.id("draggable"));
        System.out.println(dragg.isDisplayed());
        driver.switchTo().defaultContent(); //exit from the frame
        WebElement titleImg = driver.findElement(By.xpath("//a[@title='jQuery UI']"));
        System.out.println(titleImg.isDisplayed());
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
        //   openmodal.click();
        //click using javascript executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", openmodal);

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
        //  input.sendKeys("Selenium Practice");
        //send data using javascript executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='JavaScript entered data';", input);

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
