import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        // get the title of the page
        System.out.println(driver.getTitle());

        Actions action = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Find the checkbox
        WebElement toggleCheckbox = driver.findElement(By.id("toggleCheckbox"));
        WebElement checkBox = driver.findElement(By.id("dynamicCheckbox"));

        //toggle
        toggleCheckbox.click();

        //Wait for checkbox
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(toggleCheckbox.isDisplayed());

        //toggle again
//        toggleCheckbox.click();

        //Wait for checkbox
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
//        System.out.println(checkBox.isDisplayed());

        //Condition
        if(checkBox.isDisplayed()) System.out.println("Visible");
        else System.out.println("Not Visible");

        // exit browser
        driver.close();
    }
}