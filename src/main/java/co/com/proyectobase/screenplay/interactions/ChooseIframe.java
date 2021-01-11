package co.com.proyectobase.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ChooseIframe implements Interaction {

    public static ChooseIframe cambiar() {
        return new ChooseIframe();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        getDriver().switchTo().frame(2);
        getDriver().findElement(By.xpath("//span[text()='Editor toolbars']//ancestor::div[@id='GENERAL']//div[@id='cke_1_contents']//iframe[1]")).click();
    }

}
