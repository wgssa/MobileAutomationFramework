package Pages;

import Helpers.TechHelp;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends TechHelp {

    @AndroidFindBy(id = "by.onliner.catalog:id/nextContainer")
    private WebElement nextButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNextButton() {
        for (int i = 0; i < 5; i++)
            element(nextButton).click();
    }
}
