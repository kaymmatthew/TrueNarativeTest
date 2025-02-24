package PageObjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.WhenPageOpens;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

@DefaultUrl("https://risk.lexisnexis.co.uk/")

public class HomePage extends PageObject {
    WebDriver driver = null;

    public static final By AboutUs_Menu_Link = By.linkText("About Us");
    public static final By Cookies_Button = By.cssSelector("#onetrust-accept-btn-handler");
    public static final By Career_Menu_Link = By.xpath("//div[@class='caption']/h4[.='Careers']//parent::div");

    public void acceptCookies(){
        find(Cookies_Button).click();
    }

    public void clickAboutUs(){
        find(AboutUs_Menu_Link).click();
    }

    public void clickCareerLink(){
        withTimeoutOf(Duration.ofSeconds(1))
                .waitFor(presenceOfElementLocated(Career_Menu_Link));
        find(Career_Menu_Link).click();
    }

    public void SwitchToSecondPage(int index){
        driver = getDriver();
        driver.switchTo().window(String.valueOf(driver.getWindowHandles().stream().toArray()[index]));
    }

    @WhenPageOpens
    public void maximiseScreen() {
        getDriver().manage().window().maximize();
    }
}