import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
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
        WebElement checkBox = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));

        //Check if selected
        if(checkBox.isSelected()) System.out.println("Selected");
        else System.out.println("Not Selected");

        //toggle
        checkBox.click();

        // exit browser
        driver.close();
    }
}