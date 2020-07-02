package Pages;

import Helpers.TechHelp;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;

import static io.appium.java_client.touch.offset.PointOption.point;

public class MobileScreenPage extends TechHelp {

    public MobileScreenPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Chrome")
    private WebElement chromeIcon;

    @AndroidFindBy(accessibility = "Messages")
    private WebElement messagesIcon;

    public void closeApplication() {
        returnAppiumDriver().closeApp();
    }

    public void moveChromeToMessages() {
        //new TouchActions(returnAppiumDriver()).longPress(chromeIcon).moveToElement(messagesIcon).release().perform(); // для веб прилодений
        new TouchAction(returnAppiumDriver()).longPress(point(element(chromeIcon).getLocation().getX(), element(chromeIcon).getLocation().getY()))
                .moveTo(point(element(messagesIcon).getLocation().getX()+10, element(messagesIcon).getLocation().getY()+10))
                // Если не добавлять веитер и смену координат, то иконка сместится вверх
                // Если сместить координаты (приплюсовать допы к координатам меседжа) создастся фолдер
                // Если добавить веитер то иконки поменяются местами
                //.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .release().perform();
    }



}
