package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.Ingreso;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AcademyChoucairStepDefinitions {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }

    @Given("^than estiven wants to learn automation at the academy Choucair$")
    public void thanEstivenWantsToLearnAutomationAtTheAcademyChoucair(List<Ingreso> data)  {
        theActorCalled("estiven").wasAbleTo(OpenUp.thepage(), (Login.onThePage(data)));
    }

    @When("^he search for the course  automatizacion on the choucair academy plataform$")
    public void heSearchForTheCourseAutomatizacionOnTheChoucairAcademyPlataform(List<Ingreso> data) {
        theActorInTheSpotlight().attemptsTo(Search.thecourse(data));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResources(List<Ingreso> data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data.get(0).getCurso())));

    }


}
