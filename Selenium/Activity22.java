import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity22 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/popups");

        //wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions action = new Actions(driver);

        // get the title of the page and print it
        System.out.println(driver.getTitle());

        //signin button, hover over it and print the tooltip message.
        WebElement signIn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/button"));
        action.moveToElement(signIn).build().perform();
        String tooltipMsg = signIn.getAttribute("data-tooltip");
        System.out.println(tooltipMsg);

        //click the signin button
        signIn.click();

        //switch to popup
        driver.switchTo().window(driver.getWindowHandle());

        //enter username
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("admin");

        //enter pwd
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("password");

        //login and click
        WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/button"));
        login.click();

        //print the Message after login
        WebElement textconfirm = driver.findElement(By.id("action-confirmation"));
        System.out.println(textconfirm.getText());

        // exit browser
        driver.quit();
    }
}