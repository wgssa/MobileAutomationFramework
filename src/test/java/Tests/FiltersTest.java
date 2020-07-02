package Tests;

import org.junit.Test;

public class FiltersTest extends SampleTest {

    @Test
    public void FiltersTest(){
        user.atMainPage.clickOnNextButton();
        user.atCatalogPage.clickOnComputersAndNetworksButton();
        user.atComputersAndNetworksPage.clickOnKeyboardsButton();
        user.atKeyboardsPage.clickOnFilterButton();
        user.atFiltersPage.clickOnKeyTypeButton();
        user.atKeyTypePage.clickOnMechanicCheckbox();
        user.atKeyTypePage.verifyMechanicCheckboxIsChecked();
        user.atCatalogPage.clickOnNavigateUpButton();
        user.atFiltersPage.clickOnMinimalPriceButton();
        user.atSortByPricePage.fillMinPriceField("150");
        user.atSortByPricePage.fillMaxPriceField("250");
        user.atCatalogPage.clickOnNavigateUpButton();
        user.atFiltersPage.clickOnSortByButton();
        user.atSortByPage.clickOnCheapFirstRadioButton();
        user.atSortByPage.verifyOnCheapFirstRadioButtonIsChecked();
        user.atFiltersPage.clickOnShowFilteredProductsButton();
        user.atFiltersPage.clickOnProductName("Клавиатура Razer Blackwidow Essential");
    }
}
