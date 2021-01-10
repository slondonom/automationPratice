package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeRegistroDireccion {

    public static final Target CIUDAD = Target.the("").located(By.xpath("//*[@id=\"city\"]"));
    public static final Target CODIGO_POSTAL = Target.the("").located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target PAIS = Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target NEXT_DEVICES = Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
