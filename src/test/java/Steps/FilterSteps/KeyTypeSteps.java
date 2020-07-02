package Steps.FilterSteps;

import Pages.FilterPages.KeyTypePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class KeyTypeSteps extends ScenarioSteps {

    KeyTypePage onPage;

    @Step
    public void clickOnMechanicCheckbox() {
        onPage.clickOnMechanicCheckbox();
    }

    @Step
    public void clickOnMechanicButton() {
        onPage.clickOnMechanicButton();
    }

    @Step
    public void verifyMechanicCheckboxIsChecked() {
        onPage.verifyMechanicCheckboxIsChecked();
    }
}
