package PageObjects;
import freemarker.template.utility.NullArgumentException;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CareersPage extends PageObject {

    HomePage homePage = new HomePage();
    public static final By SearchAllJobs_Button = By.xpath("//div[@class='score-center']/a[.='Search all jobs']");
    public static final By SEARCHInput_FIELD = By.cssSelector("[placeholder=Search]");
    public static final By SEARCH_Result = By.cssSelector("[class=search-results-item]");

    public void clickSearchAllButton(){
        if (getDriver() == null){
           throw new NullArgumentException();
        }
        homePage.SwitchToSecondPage(1);
        withTimeoutOf(Duration.ofSeconds(1))
                .waitFor(presenceOfElementLocated(SearchAllJobs_Button));
        find(SearchAllJobs_Button).click();
    }

    public void searchKeyword(String value){
        withTimeoutOf(Duration.ofSeconds(1))
                .waitFor(presenceOfElementLocated(SEARCHInput_FIELD));
        find(SEARCHInput_FIELD).typeAndEnter(value);
    }

    public List<String> verifySearchResult(){
        return findAll(SEARCH_Result).texts();
    }
}