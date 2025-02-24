package StepDefinitions;

import PageObjects.CareersPage;
import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractionSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchStepsDef extends UIInteractionSteps {
    HomePage homePage = new HomePage();
    CareersPage careersPage = new CareersPage();

    @Given("User opens the home page")
    public void user_opens_the_home_page() {
        homePage.open();
    }

    @When("User click About Us menu link")
    public void user_click_about_us_menu_link() {
        homePage.acceptCookies();
        homePage.clickAboutUs();
    }

    @When("User click Career menu link")
    public void user_click_career_menu_link() {
        homePage.clickCareerLink();
    }

    @When("User click Search all jobs button")
    public void user_click_search_all_jobs_button() {
        careersPage.clickSearchAllButton();
    }

    @When("User search for keyword {string}")
    public void user_search_for_keyword(String value) {
      careersPage.searchKeyword(value);
    }

    @Then("User checks the search results is returned")
    public void user_checks_the_search_results_is_returned() {
        var result = careersPage.verifySearchResult();
        assertThat(result.size() > 0);
    }
}