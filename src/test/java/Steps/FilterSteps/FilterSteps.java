package Steps.FilterSteps;

import Pages.FilterPages.FilterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class FilterSteps extends ScenarioSteps {

    FilterPage onPage;

    @Step
    public void clickOnKeyTypeButton() {
        onPage.clickOnKeyTypeButton();
    }


    @Step
    public void clickOnNavigateUpButton() {
        onPage.clickOnNavigateUpButton();
    }

    @Step
    public void clickOnMinimalPriceButton() {
        onPage.clickOnMinimalPriceButton();
    }

    @Step
    public void clickOnSortByButton() {
        onPage.clickOnSortByButton();
    }

    @Step
    public void clickOnShowFilteredProductsButton() {
        onPage.clickOnShowFilteredProductsButton();
    }

    @Step
    public void clickOnProductName(String productName) {
        onPage.clickOnProductName(productName);
    }

}
