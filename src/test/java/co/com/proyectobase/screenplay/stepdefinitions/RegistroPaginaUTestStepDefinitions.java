package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.model.DataBase;
import co.com.proyectobase.screenplay.questions.Verificar;
import co.com.proyectobase.screenplay.tasks.AddCategories;
import co.com.proyectobase.screenplay.tasks.OpenPageHome;

import static co.com.proyectobase.screenplay.util.Constantes.CERO;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroPaginaUTestStepDefinitions {

    @Dado("^que (.*) ingresa a la pagina de Utest$")
    public void queJesusIngresaALaPaginaDeUtest(String jesus) {
        theActorCalled(jesus).wasAbleTo(OpenPageHome.laPaginaDeUTest());
    }


    @Cuando("^diligencia el formulario de registro con sus datos$")
    public void diligenciaElFormularioDeRegistroConSusDatos(List<DataBase> datos)  {
        //theActorInTheSpotlight().attemptsTo(AddCategories.inThePagePhpTravels(datos.get(CERO)));
    }

    @Entonces("^verifica que el registro sea (.*)$")
    public void verificaQueElRegistroSeaExitoso(String mensaje){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.elRegistroConEl(mensaje)));
    }
}
