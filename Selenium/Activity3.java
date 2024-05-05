import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");

        //printing head title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title is :" + pageTitle);

        //printing 3rd header
        String headerXpath = "//*[@id=\"third-header\"]";
        String headerText = driver.findElement(By.xpath(headerXpath)).getText();
        System.out.println("Header Text is:" + headerText);

        //printing 5th header color
        WebElement color = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        String cssValue = color.getCssValue("color");
        System.out.println("Color is" + cssValue);

        //find violet and print it's class
        WebElement getClass = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[2]"));
        String attribute = getClass.getAttribute("ui violet button");
        System.out.println("Classes of this button are:" + attribute);

        // Find grey button and print it's text
        WebElement Text = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        String text = Text.getText();
        System.out.println("The text is : " +text);
        driver.quit();
    }
}