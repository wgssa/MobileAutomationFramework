package Pages.CatalogPages;

import Helpers.TechHelp;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputersAndNetworksPage extends TechHelp {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Клавиатуры']")
    private WebElement keyboardsButton;

    public ComputersAndNetworksPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnKeyboardsButton() {
        universalVerticalSwipeDown(keyboardsButton);
        element(keyboardsButton).click();
    }

}

