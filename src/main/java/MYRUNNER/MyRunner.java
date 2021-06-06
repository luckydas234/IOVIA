package MYRUNNER;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/sulagnajee/api-workspace/IOVIOFW/src/main/java/Features/login.feature",
		
		glue= {"/Users/sulagnajee/api-workspace/IOVIOFW/src/main/java/StepDefination/LoginStepDefination.java"} //to generate different types of reporting
		)
 
public class MyRunner {
 
}

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest