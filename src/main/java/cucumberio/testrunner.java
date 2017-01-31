package cucumberio;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//@RunWith(Cucumber.Class) specifies that you intend to use Cucumber to run this script
@RunWith(Cucumber.class) 
//@CucumberOptions will locate where the folder you created your scenarios are 
//glue will copy the path of the steps of your selenium code 
@CucumberOptions(features = "features",glue={"stepdefinitions"})
public class testrunner {

}
