package runner;


import base.BaseClass;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/Create.feature",glue={"stepdef","hooks"},monochrome=true,publish=true,dryRun=false)

public class RunnerClass extends BaseClass{

}
