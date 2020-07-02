package Steps.CatalogSteps;

import Pages.CatalogPages.CatalogPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CatalogSteps extends ScenarioSteps {

    CatalogPage onPage;

    @Step
    public void clickOnNavigateUpButton() {
        onPage.clickOnNavigateUpButton();
    }

    @Step
    public void clickOnFoodCatalogButton() {
        onPage.clickOnFoodCatalogButton();
    }

    @Step
    public void closeNavigationMenu() {
        onPage.closeNavigationMenu();
    }

    @Step
    public void verifyScrollableOnFoodCatalogButton() {
        onPage.verifyScrollableOnFoodCatalogButton();
    }

    @Step
    public void clickOnComputersAndNetworksButton() {
        onPage.clickOnComputersAndNetworksButton();
    }

}
