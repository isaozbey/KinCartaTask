package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class amazonMainPage {

    public amazonMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='a-text-center']/ul/li[3]")
    public WebElement secondPage;

    @FindBy(xpath = "(//img[@class='s-image'])[3]")
    public WebElement thirdItem;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToChartButton;

    @FindBy(id = "huc-v2-order-row-confirm-text")
    public WebElement getAddToChartText;
}
