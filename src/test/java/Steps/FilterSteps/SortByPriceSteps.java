package Steps.FilterSteps;

import Pages.FilterPages.SortByPricePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SortByPriceSteps extends ScenarioSteps {

    SortByPricePage onPage;

    @Step
    public void fillMinPriceField(String minPrice) {
        onPage.fillMinPriceField(minPrice);
    }

    @Step
    public void fillMaxPriceField(String maxPrice) {
        onPage.fillMaxPriceField(maxPrice);
    }
}
