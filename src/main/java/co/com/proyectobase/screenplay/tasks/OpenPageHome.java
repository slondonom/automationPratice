package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PageHomePhpTravels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPageHome implements Task {

    private PageHomePhpTravels pageHomePhpTravels;

    public static OpenPageHome laPaginaDeUTest() {
        return Tasks.instrumented(OpenPageHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageHomePhpTravels));
    }
}
