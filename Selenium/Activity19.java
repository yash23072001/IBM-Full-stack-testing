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

public class Activity19 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        //wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions action = new Actions(driver);

        // get the title of the page
        System.out.println(driver.getTitle());

        //Find confirm and click it
        WebElement confirm = driver.findElement(By.id("confirm"));
        confirm.click();

        //wait until alert is present
        wait.until(ExpectedConditions.alertIsPresent());

        //Switch the focus to alert and print text in it
        Alert alert = driver.switchTo().alert();

        //print alert text
        String alertText = alert.getText();
        System.out.println(alertText);

        //close the alert with ok
        alert.accept();

        //close the alert with cancel
        //alert.dismiss();

        // exit browser
        driver.close();
    }
}