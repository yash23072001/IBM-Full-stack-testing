import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity18 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Actions action = new Actions(driver);
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/selects");

        // get the title of the page
        System.out.println(driver.getTitle());

        WebElement dropdownElement = driver.findElement(By.id("multi-select"));

        // Create a Select object
        Select dropdown = new Select(dropdownElement);

        // Select the second option by visible text
        dropdown.selectByVisibleText("Javascript");

        //Select the 4th, 5th and 6th options using the index.
        dropdown.selectByIndex(3); // Index starts from 0
        dropdown.selectByIndex(4);
        dropdown.selectByIndex(5);

        //Select the Nodejs using the value



    }
}
