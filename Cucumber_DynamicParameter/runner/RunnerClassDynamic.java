package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/CucumberDynamicparamter.feature",glue={"stepDefintion"},monochrome=true,publish=true,dryRun=false)

public class RunnerClassDynamic extends AbstractTestNGCucumberTests{

}
