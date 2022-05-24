package org.CBSstepdefinitionImageNotavailable;

import java.awt.AWTException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.CBSbaseImagenotavailable.BaseclassImagenotavailable;
import org.CBSpom.CBSPomimage;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CBSStepDefinitionImage extends BaseclassImagenotavailable {
	
	
	@Given("open chrome browser and Maximize the window")
	public void open_chrome_browser_and_Maximize_the_window() {
		openChromeBrowser();
		launchUrl("https://www.communitymatrimony.com/login/");
		toMaximizeWindow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		b = new CBSPomimage();
	}
	
	@When("Login with  valid matri id and Valid password {string}")
	public void login_with_valid_matri_id_and_Valid_password(String username) throws Throwable {
	waitingWeb();	
		toInput(b.getusername(), username);
		toFillTextBox(b.getPassword(), readFromExcel("Sheet2", 2, 2));
	}
	

	@When("Click the login button")
	public void click_the_login_button() throws Throwable {
	waitingWeb();	
		toClickButton(b.getSubmit());
	}

	@When("Click Skip to my Home and Close the image option")
	public void click_Skip_to_my_Home_and_Close_the_image_option() throws Throwable {
waitingWeb();
try {
	
	if (b.getPhotoskippage().isDisplayed()) {
		toClickButton(b.getPhotoskippage());
		toClickButton(b.getPhotoskippage1());
		toClickButton(b.getPhotoskippage2());
		toClickButton(b.getPhotoskippage3());

	}

} catch (Exception e) {
	System.out.println("Photo Page Skipped");
}

try {
	if (b.getIntermediatepage().isDisplayed()) {
		toClickButton(b.getIntermediatepage());

	}
} catch (Exception e) {
	System.out.println("Intermediate pages handled");
}
try {
	if (b.getIntermediatepage5().isDisplayed()) {
		toClickButton(b.getIntermediatepage5());

	}
} catch (Exception e) {
	System.out.println("Intermediate pages handled");
}

try {
	if (b.getIntermediatepage1().isDisplayed()) {
		toClickButton(b.getIntermediatepage1());
		
	}
} catch (Exception e) {
	System.out.println("Intermediate pages handled");
}

try {
	if (b.getIntermediatepage2().isDisplayed()) {
		toClickButton(b.getIntermediatepage2());

	}
} catch (Exception e) {
	System.out.println("Intermediate pages handled");
}

try {
	toClickButton(b.getIntermediatepage3());
} catch (Exception e) {
	System.out.println("No Intermediate pages");
}
try {
	toClickButton(b.getIntermediatepage4());
} catch (Exception e5) {
}
try {
	Thread.sleep(6000);
	alertAccept1();
	toClickButton(b.getSkipaddpage());
	
} catch (Exception e) {
	System.out.println("ADs Closed Successfully");
}


	}
	@When("Click search Option In regular search Page")
	public void click_search_Option_In_regular_search_Page() throws Throwable {
//		waitingWeb();
//		System.out.println("Search module");
//		btnClick(b.getHome());
//		Thread.sleep(5000);
//		toMove(b.getSearch());
//		//toMove(b.getRegularsearch());
//		btnClick(b.getRegularsearch());
//		downScroll(b.getSearchbutton());
//		toMove(b.getSearchbutton());
//		btnClick(b.getSearchbutton());
//		toMove(b.getResult());
//		downScroll(b.getResult());
//		Thread.sleep(5000);
//		selectValue(b.getResult(), "50");
//		btnClick(b.getGrid());
//		upScroll(b.getGrid());
//		for (int i = 0; i < 100; i++) {
//			
//			broken();
//		}	
			}
	
	@When("Click Matches Option In yet to be viwed Page")
	public void click_Matches_Option_In_yet_to_be_viwed_Page() throws Throwable {
//		waitingWeb();
//		System.out.println("Matches module");
//		btnClick(b.getMatches());		
//		toMove(b.getResult());
//		downScroll(b.getResult());
//		Thread.sleep(5000);
//		selectValue(b.getResult(), "50");
//		btnClick(b.getGrid());
//		upScroll(b.getGrid());
//		for (int i = 0; i < 100; i++) {
//			broken();
//		}	
	}

@When("Click Home Option In view not contacted page")
public void click_Home_Option_In_view_not_contacted_page() throws Throwable {
	waitingWeb();
	System.out.println("Home module");
	btnClick(b.getHome());
	Thread.sleep(5000);
	//brokendashboard();
	Thread.sleep(5000);
	toMove(b.getHome());
	Thread.sleep(5000);
	toClickButton(b.getViewnotcontacted());
	toMove(b.getResult());
	downScroll(b.getResult());
	Thread.sleep(5000);
	selectValue(b.getResult(), "50");
	btnClick(b.getGrid());
	upScroll(b.getGrid());
	for (int i = 0; i < 6; i++) {

		brokenviewnotcontacted();
	}
}
@Given("user have to enter matrimony domain all name {string}")
public void user_have_to_enter_matrimony_domain_all_name(String Domainname) throws Throwable {
	launchBrowser();
	loadUrl(Domainname);
	Thread.sleep(5000);
	String s1 = b.getDomainname().getText();
	//System.out.print(s1);
	currentUrl();
	toGetTitle();
	System.out.println("Home");
	brokenhome();
//	btnClick(b.getViewmore());
//	btnClick(b.getBrides());
//	System.out.println("Brides");
//	for (int i = 0; i < 100; i++) {
//		brokenhomesearch();
//	}
//	btnClick(b.getGrooms());
//	System.out.println("Grooms");
//	for (int i = 0; i < 100; i++) {
//		brokenhomesearch();
//	}
	screenshot(s1);
	driver.close();


}
}