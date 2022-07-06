package com.centrilli.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", // saves the failed tests to specified file, to be run in FailedTestRunner class.
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "com/centrilli/step_defs",
        dryRun = false, // when true, just compiles Step Definition and Feature files to verify the compilation errors
        tags = "@CNTR-345",
        publish = false
)

public class CukesRunner {
}