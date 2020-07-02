package Steps;

import Pages.MobileScreenPage;
import io.appium.java_client.TouchAction;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static io.appium.java_client.touch.offset.PointOption.point;

public class MobileScreenSteps extends ScenarioSteps {

    MobileScreenPage onPage;

    @Step
    public void closeApplication() {
        onPage.closeApplication();
    }

    @Step
    public void moveChromeToMessages() {
        onPage.moveChromeToMessages();
    }
}
