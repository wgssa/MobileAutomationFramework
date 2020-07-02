package Pages.FilterPages;

import Helpers.TechHelp;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortByPricePage extends TechHelp {

    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    private WebElement minPriceField;
    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
    private WebElement maxPriceField;
    public SortByPricePage(WebDriver driver) {
        super(driver);
    }

    public void fillMinPriceField(String minPrice) {
        element(minPriceField).sendKeys(minPrice);
    }

    public void fillMaxPriceField(String maxPrice) {
        element(maxPriceField).sendKeys(maxPrice);
    }
}
