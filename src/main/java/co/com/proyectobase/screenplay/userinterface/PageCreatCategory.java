package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageCreatCategory {

    public static final Target BLOG = Target.the("").located(By.xpath("//a[text()='Blog']"));
    public static final Target BLOG_CATEGORY = Target.the("").located(By.xpath("//a[text()='Blog Categories']"));
    public static final Target BLOG_POST_CATEGORY = Target.the("").located(By.xpath("//a[text()='Posts']"));

    public static final Target ADD = Target.the("").located(By.xpath("//div[@class='add_button_modal']//button[@type='button']"));
    public static final Target ADD_POST_CATEGORY = Target.the("").located(By.xpath("//button[text()=' Add']"));


    public static final Target CATEGORY_NAME = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()='Category Name']//ancestor::div[@class='row form-group']//input"));
    public static final Target STATUS = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()='Status']//ancestor::div[@class='row form-group']//select"));
    public static final Target STATUS_ENABLE = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()='Status']//ancestor::div[@class='row form-group']//select//option[text()='Enable']"));


    public static final Target NAME_VIETNAMESE = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()=' Name in ']//ancestor::div[@class='row form-group']//input[@name='translated[vi][name]']"));
    public static final Target NAME_RUSSIAN = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()=' Name in ']//ancestor::div[@class='row form-group']//input[@name='translated[ru][name]']"));
    public static final Target NAME_ARABIC = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()=' Name in ']//ancestor::div[@class='row form-group']//input[@name='translated[ar][name]']"));
    public static final Target NAME_FARSI = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()=' Name in ']//ancestor::div[@class='row form-group']//input[@name='translated[fa][name]']"));
    public static final Target NAME_TURKISH = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()=' Name in ']//ancestor::div[@class='row form-group']//input[@name='translated[tr][name]']"));
    public static final Target NAME_FRENCH = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()=' Name in ']//ancestor::div[@class='row form-group']//input[@name='translated[fr][name]']"));
    public static final Target NAME_SPANISH = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()=' Name in ']//ancestor::div[@class='row form-group']//input[@name='translated[es][name]']"));
    public static final Target NAME_GERMAN = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-body form-horizontal']//label[text()=' Name in ']//ancestor::div[@class='row form-group']//input[@name='translated[de][name]']"));

    public static final Target ADD_CATEGORY = Target.the("").located(By.xpath("//h4[text()='Add Blog Category Type']//ancestor::form//div[@class='modal-footer']//button[text()='Add']"));


    public static final Target POST_TITTLE = Target.the("").located(By.xpath("//div[@id='GENERAL']//input[@placeholder='Post Title']"));
     public static final Target CHOOSE_OPTION_CATEGORY = Target.the("").located(By.xpath("//select[@name='category']"));
    public static final Target WRITE_TEXT = Target.the("").located(By.xpath("//span[text()='Editor toolbars']//ancestor::div[@id='GENERAL']//div[@id='cke_1_contents']//iframe"));
    public static final Target PRUEBA = Target.the("").located(By.xpath("//a[@id='cke_46']"));
    public static final Target PRUEBATXT = Target.the("").located(By.xpath("//textarea[@class='cke_source cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr']"));
    public static final Target SUBMIT_POST = Target.the("").located(By.xpath("//button[text()='Submit']"));
    public static final Target SEARCH_POST = Target.the("").located(By.xpath("//*[@id='content']/div[2]/div[2]/div/div/div[1]/div[3]/a"));
    public static final Target FIELD_SEARCH_POST = Target.the("").located(By.xpath("//*[@id='content']/div[2]/div[2]/div/div/div[1]/div[3]/span[1]/input"));
}
