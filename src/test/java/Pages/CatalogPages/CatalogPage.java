package Pages.CatalogPages;

import Helpers.TechHelp;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CatalogPage extends TechHelp {

    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement navigateUpButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Еда']")
    private WebElement foodCatalogButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Компьютеры и сети']")
    private WebElement computersAndNetworksButton;


    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNavigateUpButton() {
        element(navigateUpButton).click();
    }

    public void closeNavigationMenu() {
        new TouchAction(returnAppiumDriver()).tap(PointOption.point(900,1000)).release().perform();
    }

    public void clickOnFoodCatalogButton() {
        universalVerticalSwipeDown(foodCatalogButton);
        element(foodCatalogButton).click();
    }

    public void verifyScrollableOnFoodCatalogButton() {
        universalVerticalSwipeDown(foodCatalogButton);
        Assert.assertEquals("true", element(foodCatalogButton).getAttribute("scrollable"));
    }

    public void clickOnComputersAndNetworksButton() {
        universalVerticalSwipeDown(computersAndNetworksButton);
        element(computersAndNetworksButton).click();
    }
}
