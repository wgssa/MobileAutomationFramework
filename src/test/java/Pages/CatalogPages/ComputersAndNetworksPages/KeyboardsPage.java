package Pages.CatalogPages.ComputersAndNetworksPages;

import Helpers.TechHelp;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyboardsPage extends TechHelp {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Фильтр']")
    private WebElement filterButton;

    public KeyboardsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFilterButton() {
        element(filterButton).click();
    }


}
