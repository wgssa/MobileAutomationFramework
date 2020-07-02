package Pages.FilterPages;

import Helpers.TechHelp;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterPage extends TechHelp {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Технология переключателя']")
    private WebElement KeyTypeButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]")
    private WebElement showFilteredProductsButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Минимальная цена в предложениях магазинов']")
    private WebElement minimalPriceButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Сначала']")
    private WebElement sortByButton;

    public FilterPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnKeyTypeButton() {
        universalVerticalSwipeDown(KeyTypeButton);
        element(KeyTypeButton).click();
    }

    public void clickOnMinimalPriceButton() {
        element(minimalPriceButton).click();
    }

    public void clickOnSortByButton() {
        universalVerticalSwipeUp(sortByButton);
        element(sortByButton).click();
    }

    public void clickOnShowFilteredProductsButton() {
        element(showFilteredProductsButton).click();
    }

    public void clickOnProductName(String Name) {
        universalVerticalSwipeDown(find(By.xpath("//android.widget.TextView[contains(@text, '" + Name + "')]")));
        find(By.xpath("//android.widget.TextView[contains(@text, '" + Name + "')]")).click();
    }


}
