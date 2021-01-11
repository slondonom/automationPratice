package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.proyectobase.screenplay.userinterface.PageCreatedCategoryWithPost.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddPostCategories implements Task {

    private List<String> datos;


    public AddPostCategories(List<String> datos) {
        this.datos = datos;
    }

    public static AddPostCategories inThePagePostPhpTravels(List<String> datos) {
        return Tasks.instrumented(AddPostCategories.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BLOG, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BLOG),
                WaitUntil.the(BLOG_POST_CATEGORY, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BLOG_POST_CATEGORY),
                WaitUntil.the(ADD_POST_CATEGORY, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ADD_POST_CATEGORY),
                Enter.theValue(datos.get(0)).into(POST_TITTLE),
                SelectFromOptions.byVisibleText(datos.get(2)).from(CHOOSE_OPTION_CATEGORY),
                Click.on(PRUEBA),
                Enter.theValue(datos.get(1)).into(PRUEBATXT),
                Click.on(SUBMIT_POST),
                WaitUntil.the(BLOG, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BLOG),
                WaitUntil.the(BLOG_POST_CATEGORY, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BLOG_POST_CATEGORY),
                WaitUntil.the(SEARCH_POST,isVisible() ).forNoMoreThan(10).seconds(),
                Click.on(SEARCH_POST),
                Enter.theValue(datos.get(2)).into(FIELD_SEARCH_POST)


        );

    }
}
