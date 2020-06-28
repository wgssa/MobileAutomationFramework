package Helpers;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.temporal.ChronoUnit;

public class TechHelp extends BasePage {

    public TechHelp(WebDriver driver) {
        super(driver);
    }

    public AppiumDriver returnAppiumDriver() {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        return (AppiumDriver) webDriver;
    }

    public void swipeVertical(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage) {

        Dimension size = driver.manage().window().getSize();
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        int anchor = (int) (size.width * anchorPercentage);

        new TouchAction(driver).longPress(PointOption.point(anchor, startPoint)).moveTo(PointOption.point(anchor, endPoint)).release().perform();
    }

    public void universalVerticalSwipeDown(WebElement element) {
        int count = 0;

        setImplicitTimeout(1, ChronoUnit.SECONDS);
        while (!(isElementDisplayed(element)) && count < 10) {
            swipeVertical(returnAppiumDriver(), 0.8, 0.2, 0.5);
            count++;
        }
    }

    public void universalVerticalSwipeUp(WebElement element) {
        int count = 0;

        setImplicitTimeout(1, ChronoUnit.SECONDS);
        while (!(isElementDisplayed(element)) && count < 10) {
            swipeVertical(returnAppiumDriver(), 0.2, 0.8, 0.5);
            count++;
        }
    }

    public void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage) {

        Dimension size = driver.manage().window().getSize();
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        int anchor = (int) (size.height * anchorPercentage);

        new TouchAction(driver).longPress(PointOption.point(startPoint, anchor)).moveTo(PointOption.point(endPoint, anchor)).release().perform();
    }

    public void universalHorizontalSwipe(WebElement element) {
        int count = 0;

        setImplicitTimeout(1, ChronoUnit.SECONDS);
        while (!(isElementDisplayed(element)) && count < 10) {
            swipeHorizontal(returnAppiumDriver(), 0.8, 0.2, 0.5);
            count++;
        }
    }

    public void swipeHorizontalWithinElement(AppiumDriver driver, double startPercentage, double finalPercentage, int y) {

        Dimension size = driver.manage().window().getSize();
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);

        new TouchAction(driver).longPress(PointOption.point(startPoint, y)).moveTo(PointOption.point(endPoint, y)).release().perform();
    }

    public void universalHorizontalSwipeWithinElement(WebElement element) {
        int elemetAnchor = element.getLocation().getY();
        setImplicitTimeout(1, ChronoUnit.SECONDS);
        swipeHorizontalWithinElement(returnAppiumDriver(), 0.8, 0.2, elemetAnchor);
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
