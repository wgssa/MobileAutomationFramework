package Pages;

import com.google.common.base.Predicate;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.temporal.ChronoUnit;

public abstract class BasePage extends PageObject {

    public BasePage(final WebDriver driver) {
        super(driver, new Predicate<PageObject>() {
            @Override
            public boolean apply(PageObject page) {
                PageFactory.initElements(new AppiumFieldDecorator(((WebDriverFacade) page.getDriver()).getProxiedDriver(),
                        page.getImplicitWaitTimeout()), page);
                return true;
            }
        });
        setImplicitTimeout(30000, ChronoUnit.MILLIS);
    }
}
