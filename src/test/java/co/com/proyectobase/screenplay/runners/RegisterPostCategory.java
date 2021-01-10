package co.com.proyectobase.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		tags = "@tag2",
		glue={"co.com.proyectobase.screenplay.stepdefinitions", "co.com.proyectobase.screenplay.util"},
		snippets=SnippetType.CAMELCASE		)
public class RegisterPostCategory {

}
