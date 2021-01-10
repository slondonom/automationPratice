package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.PaginaUltimoPasoRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question<Boolean> {

    private String mensaje;

    public Verificar(String mensaje) {
        this.mensaje = mensaje;
    }

    public static Verificar elRegistroConEl(String mensaje) {
        return new Verificar(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String mensajeEsperado = Text.of(PaginaUltimoPasoRegistro.MENSAJE_ESPERADO).viewedBy(actor).asString();
        return mensaje.equals(mensajeEsperado);
    }
}
