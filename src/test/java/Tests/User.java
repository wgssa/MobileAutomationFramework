package Tests;


import Steps.CatalogSteps.CompAndNetworksSteps.KeyboardsSteps;
import Steps.CatalogSteps.ComputersAndNetworksSteps;
import Steps.FilterSteps.KeyTypeSteps;
import Steps.FilterSteps.SortByPriceSteps;
import Steps.FilterSteps.SortBySteps;
import Steps.MainSteps;
import Steps.CatalogSteps.CatalogSteps;
import Steps.FilterSteps.FilterSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class User extends ScenarioSteps {

    @Steps
    public MainSteps atMainPage;

    @Steps
    public CatalogSteps atCatalogPage;

    @Steps
    public ComputersAndNetworksSteps atComputersAndNetworksPage;

    @Steps
    public KeyboardsSteps atKeyboardsPage;

    @Steps
    public FilterSteps atFiltersPage;

    @Steps
    public KeyTypeSteps atKeyTypePage;

    @Steps
    public SortByPriceSteps atSortByPricePage;

    @Steps
    public SortBySteps atSortByPage;
}
