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
import java.util.List;

public class Activity13 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Actions action = new Actions(driver);
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/tables");

        // get the title of the page
        System.out.println(driver.getTitle());

        Actions action = new Actions(driver);

        //Find the table rows
        List<WebElement> num_rows = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        System.out.println(num_rows.size());

        //Find the table columns
        List<WebElement> num_columns = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
        System.out.println(num_columns.size());

        //Find and print all the cell values in the third row
        List<WebElement> num_rows3 = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]"));
        for(WebElement e: num_rows3){
            System.out.println(e.getText());
        }

        //Find and print all the cell values in the second row and second column
        List<WebElement> num_rows2 = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        for(WebElement e: num_rows2){
            System.out.println(e.getText());
        }

        // exit browser
        driver.close();
    }
}