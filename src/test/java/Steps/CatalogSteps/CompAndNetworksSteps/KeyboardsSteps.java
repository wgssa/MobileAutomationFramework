package Steps.CatalogSteps.CompAndNetworksSteps;

import Pages.CatalogPages.ComputersAndNetworksPages.KeyboardsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class KeyboardsSteps extends ScenarioSteps {

    KeyboardsPage onPage;

    @Step
    public void clickOnFilterButton() {
        onPage.clickOnFilterButton();
    }
}
