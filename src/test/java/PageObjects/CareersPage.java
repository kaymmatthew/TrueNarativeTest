package PageObjects;
import freemarker.template.utility.NullArgumentException;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CareersPage extends PageObject {

    HomePage homePage = new HomePage();
    public static final By searchJobs_Button = By.xpath("//a[@class='score-button btn-red'][.='Search jobs']");
    public static final By SEARCHInput_FIELD = By.xpath("//input[@placeholder='Search for jobs or keywords']");
    public static final By SEARCH_Result = By.cssSelector("[class=search-results-item]");

    public void clickSearchJobsButton(){
        if (getDriver() == null){
            throw new NullArgumentException();
        }
        homePage.SwitchToSecondPage(1);
        withTimeoutOf(Duration.ofSeconds(1))
                .waitFor(presenceOfElementLocated(searchJobs_Button));
        find(searchJobs_Button).click();
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