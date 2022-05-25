package org.CBSImageNotavailablerun;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.CBSjvmrepImagenotavailable.CBSJVMreportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(plugin = {
        "html:C:\\Users\\Aravindthanika-54029\\eclipse-workspace\\CommunityMatrimonyLogIn\\Report\\HtmlReport",
        "junit:C:\\Users\\Aravindthanika-54029\\eclipse-workspace\\CommunityMatrimonyLogIn\\Report\\junit\\matri.xml",
        "json:C:\\Users\\Aravindthanika-54029\\eclipse-workspace\\CommunityMatrimonyLogIn\\Report\\cucumber.json"},
features= "src\\test\\resources\\MatrimonyFeaturefiles\\Homepage.feature", 
glue="org.CBSstepdefinitionImageNotavailable", dryRun=false, strict=true)





public class Imagenotavailablerunnerclass { 
	@AfterClass
	public static void generateAll() throws FileNotFoundException {
		CBSJVMreportGeneration.Jvmreport("C:\\Users\\Aravindthanika-54029\\eclipse-workspace\\CommunityMatrimonyLogIn\\Report\\cucumber.json");
	}
}
