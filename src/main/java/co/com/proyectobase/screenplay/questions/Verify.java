package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.PageLastStepVerifyMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Verify implements Question<Boolean> {

    private List<String> datos;

    public Verify(List<String> datos) {
        this.datos = datos;
    }

    public static Verify theCreatPostWithCategory(List<String> datos) {
        return new Verify(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String mensajeEsperado = Text.of(PageLastStepVerifyMessage.MESSAGEVERIFY).viewedBy(actor).asString();
        return datos.get(0).equals(mensajeEsperado);
    }
}
