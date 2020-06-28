package Tests;

import org.junit.Test;

public class FourClickOnNextButtonTest extends SampleTest {

    @Test
    public void fourClickOnNextButtonTest() {
        user.atMainPage.clickOnNextButton();
        user.atCatalogPage.verifyScrollableOnFoodCatalogButton();
        user.atCatalogPage.clickOnFoodCatalogButton();
    }
}
