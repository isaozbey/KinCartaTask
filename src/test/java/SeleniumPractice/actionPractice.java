package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionPractice {

    @Test
    public void test1() throws Exception{
        System.setProperty("WebDriver.chromeDriver.driver",System.getProperty("user.dir")+"chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/drag_and_drop");

        Actions actions=new Actions(driver);
        WebElement squareA=driver.findElement(By.id("column-a"));
        WebElement squareB=driver.findElement(By.id("column-b"));

        Thread.sleep(2000);

        actions.clickAndHold().build();
        actions.moveToElement(squareB).perform();

        Thread.sleep(2000);

    }
}
