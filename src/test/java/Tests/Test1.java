package Tests;

import org.junit.Test;

public class Test1 extends SampleTest {

    @Test
    public void Test1() {
        user.atMainPage.clickOnGoToCatalogButton();
        user.atCatalogPage.clickOnNavigateUpButton();
        user.atCatalogPage.closeNavigationMenu();
    }
}
