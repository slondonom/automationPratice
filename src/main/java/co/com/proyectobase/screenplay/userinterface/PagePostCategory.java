package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagePostCategory {
  public static final Target MENSAJE_ESPERADO = Target.the("").located(By.xpath("(//td[text()='1']//ancestor::tr//a)[1]"));
}
