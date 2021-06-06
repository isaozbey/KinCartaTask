package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.parallelDriver;

public class dataProviderPractice_2 {

    @Test(description ="Verify page title",dataProvider = "testData")
    public void test1(String url,String title){
        WebDriver driver= parallelDriver.getDriver();

        driver.get(url);
        String expected= driver.getTitle();

        Assert.assertEquals(expected,title);
    }

    @DataProvider(name = "testData")
    public Object[][] testData(){
        return  new Object[][] {{"http://amazon.com","Amazon"},{"http://etsy.com","Etsy"}};
    }

}
