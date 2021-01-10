package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.Verify;
import co.com.proyectobase.screenplay.tasks.AddCategories;
import co.com.proyectobase.screenplay.tasks.AddPostCategories;
import co.com.proyectobase.screenplay.tasks.Login;
import co.com.proyectobase.screenplay.tasks.OpenPageHome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PruebaTecnicaStepDefinitions {

    @Given("^The (.*) login in the page$")
    public void the_user_login_in_the_page(String sebas ) {
        theActorCalled(sebas).wasAbleTo(OpenPageHome.laPaginaDeUTest(),(Login.onThePage()));
    }

    @When("^creating the blog category$")
    public void creating_the_blog_category(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(AddCategories.inThePagePhpTravels(datos));

    }

    @When("^creat Post with category created$")
    public void creat_Post_with_category_created(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(AddPostCategories.inThePagePostPhpTravels(datos));
    }

    @Then("^verify category$")
    public void verify_Category(List<String> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verify.theCreatPostWithCategory(datos)));
    }
}
