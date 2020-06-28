package Steps.FilterSteps;

import Pages.FilterPages.SortByPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SortBySteps extends ScenarioSteps {

    SortByPage onPage;

    @Step
    public void clickOnCheapFirstRadioButton() {
        onPage.clickOnCheapFirstRadioButton();
    }

    @Step
    public void verifyOnCheapFirstRadioButtonIsChecked() {
        onPage.verifyOnCheapFirstRadioButtonIsChecked();
    }
}
