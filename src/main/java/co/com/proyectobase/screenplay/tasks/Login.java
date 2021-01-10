package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PageLoginPhpTravels;
import static co.com.proyectobase.screenplay.util.Constantes.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    public static Performable onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USER).into(PageLoginPhpTravels.USER_TXT),
                Enter.theValue(PASSWORD).into(PageLoginPhpTravels.PASSWORD_TXT),
                Click.on(PageLoginPhpTravels.SUBMIT_BUTTON));
    }
}
