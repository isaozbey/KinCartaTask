package SeleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutor {

    @Test
    public void test1() throws  Exception{

        System.setProperty("webDriver.chromeDriver.driver",System.getProperty("user.dir")+"chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        WebElement link=driver.findElement(By.linkText("Cybertek School"));

        JavascriptExecutor js= (JavascriptExecutor)driver;
        Thread.sleep(2000);

        js.executeScript("arguments[0].scrollIntoView(true)",link);

    }
}
