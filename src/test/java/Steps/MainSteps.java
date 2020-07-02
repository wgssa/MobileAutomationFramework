package Steps;

import Pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MainSteps extends ScenarioSteps {

    MainPage onPage;

    @Step
    public void clickOnNextButton() {
        onPage.clickOnNextButton();
    }

    @Step
    public void clickOnGoToCatalogButton() {
        onPage.clickOnGoToCatalogButton();
    }


}
