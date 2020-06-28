package Pages.FilterPages;

import Helpers.TechHelp;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyTypePage extends TechHelp {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'механическая']")
    private WebElement mechanicButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.CheckBox")
    private WebElement mechanicCheckbox;
    public KeyTypePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMechanicButton() {
        element(mechanicButton).click();
    }

    public void clickOnMechanicCheckbox() {
        element(mechanicCheckbox).click();
    }

    public void verifyMechanicCheckboxIsChecked() {
        Assert.assertEquals(element(mechanicCheckbox).getAttribute("checked"), "true");
    }

}
