package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(   
		features = {"C:\\Users\\shiva\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\Cucumber_project\\src\\test\\resources\\Forms\\form.feature"},
		glue= {"steps"}
		)
public class Loginrunner {

}
