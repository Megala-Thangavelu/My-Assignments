package runner;


import base.BaseClass;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/Delete.feature",glue={"stepdefinit","hooks"},monochrome=true,publish=true,dryRun=false)

public class RunnerClass extends BaseClass{

}
