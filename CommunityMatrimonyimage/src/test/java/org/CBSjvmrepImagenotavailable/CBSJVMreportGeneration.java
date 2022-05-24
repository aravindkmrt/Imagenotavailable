package org.CBSjvmrepImagenotavailable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CBSJVMreportGeneration {

	public static void Jvmreport(String json) {
		File f = new File(System.getProperty("user.dir")+"\\Report");
		
		Configuration c = new Configuration(f, "CBSimagenotavailable");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Version", "10");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Driver Version", "90");
		
		List<String> list = new ArrayList<String>();
		
	list.add(json);
	
		ReportBuilder r = new ReportBuilder(list, c);
		r.generateReports();
	}
}
