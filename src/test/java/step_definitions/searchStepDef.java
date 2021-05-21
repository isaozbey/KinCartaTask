package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.amazonMainPage;
import utilities.Driver;
import utilities.configurationReader;

import java.util.concurrent.TimeUnit;

public class searchStepDef {

    WebDriver driver= Driver.getDriver();
    pages.amazonMainPage amazonMainPage=new amazonMainPage();
    String url= configurationReader.getProperty("url");
    WebDriverWait wait=new WebDriverWait(driver,20);

     JavascriptExecutor js=(JavascriptExecutor) driver;



    @Given("the user navigates to Amazon website")
    public void the_user_navigates_to_amazon_website() {
     driver.get(url);
     wait.until(ExpectedConditions.visibilityOf(amazonMainPage.searchBox));
    }


    @Given("searches {string}")
    public void searches(String string) {
     amazonMainPage.searchBox.sendKeys(string, Keys.ENTER);
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
    @Given("navigates to the second page")
    public void navigates_to_the_second_page() {
     js.executeScript("arguments[0].scrollIntoView(true)",amazonMainPage.secondPage);
     wait.until(ExpectedConditions.visibilityOf(amazonMainPage.secondPage));
     amazonMainPage.secondPage.click();

    }
    @Given("selects the third item")
    public void selects_the_third_item() {
        wait.until(ExpectedConditions.visibilityOf(amazonMainPage.thirdItem));
        amazonMainPage.thirdItem.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        amazonMainPage.addToChartButton.click();

    }
    @Then("item in the chart")
    public void item_in_the_chart() {
          wait.until(ExpectedConditions.visibilityOf(amazonMainPage.getAddToChartText));
        String expectedText="Added to Cart";
        String actualText=amazonMainPage.getAddToChartText.getText();

        Assert.assertEquals(expectedText,actualText);

    }





}
