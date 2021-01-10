package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.model.DataBase;
import static co.com.proyectobase.screenplay.userinterface.PaginaDeRegistroDatosBasicos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static co.com.proyectobase.screenplay.userinterface.PaginaDeRegistroDireccion.*;

import static co.com.proyectobase.screenplay.userinterface.PaginaUltimoPasoRegistro.*;

import static co.com.proyectobase.screenplay.userinterface.PaginaDeRegistroDatosDispositivos.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.opencv.imgproc.CLAHE;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

public class AddCategories implements Task {

    private List<String> datos;

    public AddCategories(List<String> datos) {
        this.datos = datos;
    }

    public static AddCategories inThePagePhpTravels(List<String> datos) {
        return Tasks.instrumented(AddCategories.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BLOG),
                Click.on(BLOG_CATEGORY),
                WaitUntil.the(ADD, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ADD),

                Enter.theValue(datos.get(0)).into(CATEGORY_NAME),
                WaitUntil.the(STATUS, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(STATUS),
                WaitUntil.the(STATUS_ENABLE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(STATUS_ENABLE),
                Enter.theValue(datos.get(1)).into(NAME_VIETNAMESE),
                Enter.theValue(datos.get(2)).into(NAME_RUSSIAN),
                Enter.theValue(datos.get(3)).into(NAME_FARSI),
                Enter.theValue(datos.get(4)).into(NAME_ARABIC),
                Enter.theValue(datos.get(5)).into(NAME_TURKISH),
                Enter.theValue(datos.get(6)).into(NAME_FRENCH),
                Enter.theValue(datos.get(7)).into(NAME_SPANISH),
                Enter.theValue(datos.get(8)).into(NAME_GERMAN),
                Click.on(ADD_CATEGORY));


    }
}
