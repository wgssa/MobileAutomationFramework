package Pages.FilterPages;

import Helpers.TechHelp;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortByPage extends TechHelp {

    public SortByPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RadioButton")
    private WebElement cheapFirstRadioButton;

    public void clickOnCheapFirstRadioButton() {
        element(cheapFirstRadioButton).click();
    }

    public void verifyOnCheapFirstRadioButtonIsChecked() {
        Assert.assertEquals(element(cheapFirstRadioButton).getAttribute("checked"), "true");
    }
}
