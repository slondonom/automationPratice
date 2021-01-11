package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageLastStepVerifyMessage {
  public static final Target MESSAGEVERIFY = Target.the("").located(By.xpath("(//td[text()='1']//ancestor::tr//a)[1]"));
}
