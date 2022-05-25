package org.CBSpom;



import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.CBSbaseImagenotavailable.BaseclassImagenotavailable;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CBSPomimage extends BaseclassImagenotavailable  {
	public CBSPomimage() {
	
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"home-header fixed-nav\"]/div/div[2]/a/div[2]/span[1]")
	private WebElement Domainname;
	@FindBy(id="idEmail")
	private WebElement username;
	@FindBy(id="password")
	private WebElement Password;
	@FindBy(xpath="(//*[@value='Login'])[2]")
	private WebElement Submit;
	
	@FindBy(xpath="/html/body/div[2]/a")
	private WebElement Photoskippage;
	@FindBy(xpath="//*[@id=\"conform\"]/div/div/div/a[1]")
	private WebElement Photoskippage1;
	@FindBy(xpath="//*[@id=\"reason3\"]")
	private WebElement Photoskippage2;
	@FindBy(xpath="//*[@id=\"skipphotoclick\"]")
	private WebElement Photoskippage3;
	@FindBy(xpath="//a[contains(text(),'Skip to Daily Matches >>')]")
	private WebElement Intermediatepage;
	@FindBy(xpath="//a[contains(text(),'Skip to My Matrimony >>  ')]")
	private WebElement Intermediatepage5;
	@FindBy(xpath="/html/body/div[1]/div[2]/a")
	private WebElement Intermediatepage1;
	@FindBy(xpath="/html/body/div[1]/div/div[4]/a")
	private WebElement Intermediatepage2;
	@FindBy(xpath="//*[@id=\"conform\"]/div/div/div/a[1]")
	private WebElement Intermediatepage3;
	@FindBy(xpath="/html/body/div[1]/div[1]/a")
	private WebElement Intermediatepage4;
	@FindBy(xpath="//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")
	private WebElement Skipaddpage;
	@FindBy(xpath="(//*[@class='fleft posrelative'])[2]/a")
	private WebElement Matches;
	@FindBy(xpath="//*[@class=\"btn btn-matches-normal ml-3\"]")
	private WebElement Allmatches;
	@FindBy(xpath="//*[@id=\"gridtab\"]")
	private WebElement Grid;
	@FindBy(xpath="//*[@id=\"top-profile-cotain-count\"]")
	private WebElement Scroll;
	@FindBy(xpath="//*[@id=\"resultsperpage\"]")
	private WebElement result;
	@FindBy(xpath="(//*[@class=\"fleft posrelative\"])[1]")
	private WebElement Home;
	@FindBy(xpath="(//*[@class=\"fleft posrelative\"])[4]")
	private WebElement search;
	@FindBy(xpath="(//*[@class=\"clr9\"])[1]")
	private WebElement Viewnotcontacted;
	@FindBy(xpath="(//*[@class=\"clr9\"])[2]")
	private WebElement ProfilesShortlistedme;
	@FindBy(xpath="(//*[@class=\"clr9\"])[3]")
	private WebElement Mobilenoviwedbyme;
	@FindBy(xpath="(//*[@class=\"clr9\"])[4]")
	private WebElement Profileihaveignored;
	@FindBy(xpath="(//*[@class=\"clr9\"])[5]")
	private WebElement WhoviewedProfile;
	@FindBy(xpath="(//*[@class=\"clr9\"])[6]")
	private WebElement Whoshortlistme;
	@FindBy(xpath="(//*[@class=\"clr9\"])[7]")
	private WebElement Whoviewedmobno;
	@FindBy(xpath="(//*[@class=\"clr9\"])[8]")
	private WebElement interestirecieved;
	@FindBy(xpath="(//*[@class=\"clr9\"])[9]")
	private WebElement yettobeviwed;
	@FindBy(xpath="(//*[@class=\"clr9\"])[10]")
	private WebElement latestmatches;
	@FindBy(xpath="(//*[@class=\"clr9\"])[11]")
	private WebElement memberswhomightlikeyou;
	@FindBy(xpath="(//*[@class=\"clr9\"])[12]")
	private WebElement Mutualmatches;
	@FindBy(xpath="(//*[@class=\"clr9\"])[13]")
	private WebElement premiummembers;
	@FindBy(xpath="(//*[@class=\"clr9\"])[14]")
	private WebElement inboxmsginbox;
	@FindBy(xpath="(//*[@class=\"clr9\"])[15]")
	private WebElement inboxmsgsent;
	@FindBy(xpath="(//*[@class=\"clr9\"])[16]")
	private WebElement inboxreqrec;
	@FindBy(xpath="(//*[@class=\"clr9\"])[17]")
	private WebElement inboxreqsent;
	@FindBy(xpath="//*[text()='Regular Search']")
	private WebElement regularsearch;
	@FindBy(xpath="//*[@value=\"Search\"]")
	private WebElement searchbutton;
	@FindBy(xpath="//*[@class=\"vp-shortlistIcon\"]")
	private WebElement shortlist;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[3]/div[4]/div/div/div[2]/div[1]/img")
	private WebElement shortlistclose;
	@FindBy(xpath="//*[text()='Advanced Search']")
	private WebElement advancedsearch;
	@FindBy(xpath="//*[text()='Keyword Search']")
	private WebElement keywordsearch;
	@FindBy(xpath="//*[@id=\"keywordTxt\"]")
	private WebElement keywordtxt;
	@FindBy(xpath="//*[text()='View more']")
	private WebElement viewmore;
	@FindBy(xpath="//*[text()='Brides']")
	private WebElement brides;
	@FindBy(xpath="//*[text()='Grooms']")
	private WebElement grooms;
	
	
	public WebElement getBrides() {
		return brides;
	}

	public WebElement getGrooms() {
		return grooms;
	}

	public WebElement getViewmore() {
		return viewmore;
	}

	public WebElement getDomainname() {
		return Domainname;
	}

	public WebElement getProfilesShortlistedme() {
		return ProfilesShortlistedme;
	}

	public WebElement getMobilenoviwedbyme() {
		return Mobilenoviwedbyme;
	}

	public WebElement getProfileihaveignored() {
		return Profileihaveignored;
	}

	public WebElement getWhoviewedProfile() {
		return WhoviewedProfile;
	}

	public WebElement getWhoshortlistme() {
		return Whoshortlistme;
	}

	public WebElement getWhoviewedmobno() {
		return Whoviewedmobno;
	}

	public WebElement getInterestirecieved() {
		return interestirecieved;
	}

	public WebElement getYettobeviwed() {
		return yettobeviwed;
	}

	public WebElement getLatestmatches() {
		return latestmatches;
	}

	public WebElement getMemberswhomightlikeyou() {
		return memberswhomightlikeyou;
	}

	public WebElement getMutualmatches() {
		return Mutualmatches;
	}

	public WebElement getPremiummembers() {
		return premiummembers;
	}

	public WebElement getInboxmsginbox() {
		return inboxmsginbox;
	}

	public WebElement getInboxmsgsent() {
		return inboxmsgsent;
	}

	public WebElement getInboxreqrec() {
		return inboxreqrec;
	}

	public WebElement getInboxreqsent() {
		return inboxreqsent;
	}

	public WebElement getAdvancedsearch() {
		return advancedsearch;
	}

	public WebElement getKeywordsearch() {
		return keywordsearch;
	}

	public WebElement getKeywordtxt() {
		return keywordtxt;
	}

	public WebElement getShortlistclose() {
		return shortlistclose;
	}

	public WebElement getShortlist() {
		return shortlist;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRegularsearch() {
		return regularsearch;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getusername() {
		return username;
	}
	
	public WebElement getHome() {
		return Home;
	}

	public WebElement getViewnotcontacted() {
		return Viewnotcontacted;
	}

	public WebElement getResult() {
		return result;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	
	public WebElement getIntermediatepage5() {
		return Intermediatepage5;
	}
	public WebElement getIntermediatepage() {
		return Intermediatepage;
	}
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPhotoskippage() {
		return Photoskippage;
	}
	public WebElement getPhotoskippage1() {
		return Photoskippage1;
	}
	public WebElement getPhotoskippage2() {
		return Photoskippage2;
	}
	public WebElement getPhotoskippage3() {
		return Photoskippage3;
	}
	public WebElement getIntermediatepage1() {
		return Intermediatepage1;
	}
	public WebElement getIntermediatepage2() {
		return Intermediatepage2;
	}
	public WebElement getIntermediatepage3() {
		return Intermediatepage3;
	}
	public WebElement getIntermediatepage4() {
		return Intermediatepage4;
	}
	public WebElement getSkipaddpage() {
		return Skipaddpage;
	}
	public WebElement getMatches() {
		return Matches;
	}
	public WebElement getAllmatches() {
		return Allmatches;
	}
	public WebElement getGrid() {
		return Grid;
	}
	public WebElement getScroll() {
		return Scroll;
	}
	
	
	
	}

	
	

	

	

