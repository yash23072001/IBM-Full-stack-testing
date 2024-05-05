import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/selects");

        Actions action = new Actions(driver);

        // get the title of the page
        System.out.println(driver.getTitle());

        //Select second option using visible text
        WebElement dropdown = driver.findElement(By.tagName("select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");

        //Select second option using value
        select.selectByValue("4");

        //Select second option using index
        select.selectByIndex(5);

        //Get selected options
        System.out.println(select.getAllSelectedOptions().get(0).getText());

        //get all the options and print them
        for(WebElement e: select.getOptions()){
            System.out.println(e.getText());
        }

        // exit browser
        driver.close();
    }
}