package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.parallelDriver;

public class dataProviderPractice {



    @Test(description ="Verify page title",dataProvider = "testData")
    public void test1(String url,String title){

        WebDriver driver= parallelDriver.getDriver();
        driver.get(url);
        String expected= driver.getTitle();

        Assert.assertEquals(expected,title);
    }

    @DataProvider(name = "testData")
    public Object[][] testData(){
        return  new Object[][] {{"http://google.com","Google"},{"http://facebook.com","Facebook"}};
    }


    @Test(description ="Verify page title",dataProvider = "testData2")
    public void test2(String url,String title){
        WebDriver driver= parallelDriver.getDriver();

        driver.get(url);
        String expected= driver.getTitle();

        Assert.assertEquals(expected,title);
    }

    @DataProvider(name = "testData2")
    public Object[][] testData2(){
        return  new Object[][] {{"http://amazon.com","Amazon"},{"http://etsy.com","Etsy"}};
    }

}
