import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Actions action = new Actions(driver);
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        // get the title of the page
        System.out.println(driver.getTitle());

        Actions action = new Actions(driver);

        //Find the ball, destination1 and destination2
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));

        //drag and drop
        action.dragAndDrop(ball, drop1).build().perform();
        action.dragAndDrop(ball, drop2).build().perform();

        //verify drop1
        WebElement dropverify1 = driver.findElement(By.id("droppable"));
        System.out.println(dropverify1.getText());

        //verify drop2
        WebElement dropverify2 = driver.findElement(By.id("dropzone2"));
        System.out.println(dropverify2.getText());


        // exit browser
        driver.close();
    }
}






