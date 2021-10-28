package co.com.choucair.certification.proyectoreto.stepdefinitions;

import co.com.choucair.certificaction.proyectoreto.model.ChallengerChoucairData;
import co.com.choucair.certificaction.proyectoreto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairChallengerStepDefinitions {
    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^that sebas know wants to register on the Utest site$")
    public void thatSebasKnowWantsToRegisterOnTheUtestSite(List<ChallengerChoucairData> challengerChoucairData) throws Exception {
        OnStage.theActorCalled("Omar").wasAbleTo(OpenUp.thePage());
    }

    @When("^he find where is the registration form in Utest$")
    public void heFindWhereIsTheRegistrationFormInUtest(List<ChallengerChoucairData> challengerChoucairData) throws Exception {

    }

    @Then("^user registers$")
    public void userRegisters(List<ChallengerChoucairData> challengerChoucairData) throws Exception{

    }

}
