import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Actions action = new Actions(driver);
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        // get the title of the page
        System.out.println(driver.getTitle());

        Actions action = new Actions(driver);

        //Find the checkbox
        WebElement toggleCheckbox = driver.findElement(By.id("toggleCheckbox"));

        //toggle
        toggleCheckbox.click();

        //Wait for checkbox
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        //toggle again
        toggleCheckbox.click();

        //Wait for checkbox
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        //Click the button
        WebElement checkBox = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
        checkBox.click();

        // exit browser
        driver.close();
    }
}