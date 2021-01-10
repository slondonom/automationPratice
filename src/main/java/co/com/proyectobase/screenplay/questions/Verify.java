package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.model.DataBase;
import co.com.proyectobase.screenplay.model.DataBasePost;
import co.com.proyectobase.screenplay.userinterface.PaginaUltimoPasoRegistro;
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

        String mensajeEsperado = Text.of(PaginaUltimoPasoRegistro.MENSAJE_ESPERADO).viewedBy(actor).asString();
        return datos.get(0).equals(mensajeEsperado);
    }
}
