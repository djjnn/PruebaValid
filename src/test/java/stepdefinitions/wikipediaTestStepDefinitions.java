package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import questions.ValidateElementVisible;
import questions.ValidatePopUpCaptcha;
import questions.ValidateTextField;
import tasks.*;
import userinterfaces.CreateAccount;
import userinterfaces.MainPage;
import userinterfaces.ViewHistory;
import utils.Constanst;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.StringContains.containsString;

public class wikipediaTestStepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("the platform wikipedia the website is entered")
    public void thePlatformWikipediaWeEnterYourWebsite() {
        theActorCalled(Constanst.ACTOR_NAME).wasAbleTo(Open.browserOn(new MainPage()));
    }

    @When("searching for the text {string}")
    public void searchingForTheText(String text) {
        theActorInTheSpotlight().attemptsTo(Search.ofText(text));
    }

    @When("you enter the link to create an account")
    public void youEnterTheLinkToCreateAnAccount() {
        theActorInTheSpotlight().attemptsTo(LinkCreateUser.enter());
    }

    @When("you enter the link mobile version")
    public void youEnterTheLinkMobileVersion() {
        theActorInTheSpotlight().attemptsTo(LinkMobileVersion.enter());
    }

    @When("you enter the link view history")
    public void youEnterTheLinkViewHistory() {
        theActorInTheSpotlight().attemptsTo(LinkViewHistory.enter());
    }

    @And("enter the username {string}, password {string} and email {string}")
    public void enterTheUsernamePasswordAndEmail(String username, String password, String email){
        theActorInTheSpotlight().attemptsTo(RegisterUser.fillFields(username, password, email));
    }

    @And("Select two revisions")
    public void selectTwoRevisions(){
    theActorInTheSpotlight().attemptsTo(SelectTwoRevisions.select());
    }

    @Then("the title is validated Welcome to wikipedia")
    public void theTitleIsValidatedWelcomeToWikipedia() {
       theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(MainPage.WelcomeWikipediaTitle), containsString("Bienvenidos a Wikipedia,")));
    }

    @Then("the searched title {string} is validated")
    public void theSearchedTitleIsValidated(String textTitleSearched) {
        theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(MainPage.searchHeading), containsString(textTitleSearched)));
    }
    @Then("the title {string} is validated in the searched text")
    public void theTitleIsValidatedInTheSearchedText(String textSearched) {
        String textSearch=String.format("//*[@class='mw-headline' and contains(text(), '%s')]",textSearched);
        theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(Target.the("").located(By.xpath(textSearch))), containsString(textSearched)));
    }

    @Then("Validate the text 'completa este campo' of the captcha")
    public void validateTheTextOfTheCaptcha() {
        theActorInTheSpotlight().should(seeThat(ValidatePopUpCaptcha.isVisible(CreateAccount.popUpCaptcha), containsString("Completa este campo")));
    }

    @Then("Validate link 'Escritorio'")
    public void validateLink() {
        theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(MainPage.versionDesk), containsString("Escritorio")));
    }

    @Then("Compared selected reviews")
    public void comparedSelectedReviews() {
        theActorInTheSpotlight().should(seeThat(ValidateElementVisible.isVisible(ViewHistory.ReviewOne)));
        theActorInTheSpotlight().should(seeThat(ValidateElementVisible.isVisible(ViewHistory.ReviewTwo)));
    }


}
