package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;




public class PageLoginPhpTravels extends PageObject {
    public static final Target USER_TXT=Target.the("where do you can write your user ").located(By.xpath("//label//input[@name='email']"));
    public static final Target PASSWORD_TXT=Target.the("where do you can write your password").located(By.xpath("//label//input[@name='password']"));
    public static final Target SUBMIT_BUTTON=Target.the("button to confirm login").located(By.xpath("//span[text()='Login']//ancestor::button"));

}
