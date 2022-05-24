package org.CBSbaseImagenotavailable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.CBSpom.CBSPomimage;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import groovyjarjarpicocli.CommandLine.Help.Ansi.Style;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassImagenotavailable {
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Alert al;
	public static TakesScreenshot s;
	public static Select se;
	
	public static Actions ac;
	public static ArrayList<String> am;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	
	
	public static Row row;
	public static Sheet sheet;
	Cell cell;
	
	    public static ExtentReports extent;
	    public static ExtentTest test;
	   public static CBSPomimage b;
	  
	    public static String domain;
	    public static String error;
	    public static String expt,ex,exp,e,expti,exptio,status;

	    public static void launchfirefox() {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		public static void loadUrl(String url) {
			driver.get(url);
			 b = new CBSPomimage();
			driver.manage().window().maximize();
		}

		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			

		}
		

		
		
		public static String currentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			return currentUrl;

		}

		public static String enteredTxt(WebElement element) {
			String attribute = element.getAttribute("value");
			System.out.println(" : "+attribute);
			return attribute;

		}
		public static String Txt(WebElement element) {
			String s1 = element.getText();
			System.out.print(s1);
			return s1;

		}
		
		public static void toClick(WebElement element) {
			element.click();
		}

		

		public static void toContext(WebElement element) {
			ac = new Actions(driver);
			ac.contextClick(element).perform();

		}

		public static void toDrop(WebElement src, WebElement dest) {
			ac = new Actions(driver);
			ac.dragAndDrop(src, dest).perform();

		}
		public static void enable(WebElement element) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		}
		public static void display(WebElement element) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		}
		public static void select(WebElement element) {
			boolean select = element.isSelected();
			System.out.println(select);
		}


		public static void alertAccept() {
			al = driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
			driver.switchTo().defaultContent();

		}

		public static void alertDismiss() {
			al = driver.switchTo().alert();
			System.out.println(al.getText());
			al.dismiss();
			driver.switchTo().defaultContent();

		}

		public static void alertType(String value) {
			al = driver.switchTo().alert();
			al.sendKeys(value);

		}

		public static void alertGetTxt() {
			al = driver.switchTo().alert();
			al.getText();

		}

		public static void screenshot(String value) throws IOException {
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			ts = (TakesScreenshot) driver;
			String destination = System.getProperty("user.dir")+"\\screenshot" + value+ ".png";
			File dest = new File(destination);
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, dest);

		}

		public static void frameName(String name) {
			driver.switchTo().frame(name);

		}

		public static void frameIndex(int i) {
			driver.switchTo().frame(i);

		}

		public static void frameWebElement(WebElement element) {
			driver.switchTo().frame(element);
		}

		public static void frameParent() {
			driver.switchTo().parentFrame();

		}

		public static void framedefault() {
			driver.switchTo().defaultContent();

		}

		

		public static void allSelectedOption(List<WebElement> element) {
			for(int i = 0; i<element.size(); i++){
				
				 
			    String s3 = element.get(i).getText();
					

			}
		}
		public static void broken3() {
			int invalidImageCount = 0; 

					
					List<WebElement> imagesList = driver.findElements(By.tagName("img")); 
					System.out.println("Total no. of images are " + imagesList.size()); 

					for (WebElement imgElement : imagesList) { 
					 if (imgElement != null) { 
					  try { 
					   HttpClient client = HttpClientBuilder.create().build(); 
					   HttpGet request = new HttpGet(imgElement.getAttribute("src")); 
					   HttpResponse response = client.execute(request); 

					   // verifying response code he HttpStatus should be 200 if not, 
					   // increment as invalid images count 
			System.out.println("print http response" + response.getStatusLine().getStatusCode());
					 //  if (response.getStatusLine().getStatusCode() != 200) 
					     invalidImageCount++; 
					   if (imagesList.get(invalidImageCount).getAttribute("naturalWidth").equals("0")) {
						System.out.println(imagesList.get(invalidImageCount).getAttribute("src") + " is broken");
					} else {
						System.out.println(imagesList.get(invalidImageCount).getAttribute("src") + " is not broken");
					}
					   } catch (Exception e) { 
					     e.printStackTrace(); 
					   }
					  } 
					 }
				}
			public static void clickall(List<WebElement> element1) {
				for (WebElement maritalStatus: element1 ) {
					maritalStatus.click();
					 String list = maritalStatus.getAttribute("value");
					 System.out.println(list);
					 }

				}

			
	public static void ctu() throws AWTException {
				
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_U);
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.keyRelease(KeyEvent.VK_ENTER);
			}
	public static void upload(String value) throws AWTException {
		
		Robot robot = new Robot();
	    
			StringSelection file1 = new StringSelection(value);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file1, null);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
	}
			
		public String getValueFromDropDown(WebElement element, String compareText) {
			List<WebElement> options = new Select(element).getAllSelectedOptions();
			for (WebElement option : options) {
				if (option.getText().equals(compareText)) {
					return option.getText();
				}
			}
			return null;
		}

		// public static void firstSelected1(WebElement element, boolean text , String
		// value ) {
		// boolean b1 = element.isSelected();
		// if (b==true) {
		// String s1 = element.getAttribute(value);
		// System.out.println(s1);
		// }
		// else {
		// System.out.println("unselected");
		// }
		//// s = new Select(element);
		//// WebElement firstSelected = s.getFirstSelectedOption();
		//// System.out.println(firstSelected);
		//// String firstSelected1 = s.getFirstSelectedOption().getText();
		//// System.out.println(firstSelected1);
		//
		// }

		

		public static void windowsId() {
			Set<String> windowsId = driver.getWindowHandles();
			System.out.println(windowsId);

		}

		public static void windowId() {
			String windowId = driver.getWindowHandle();
			System.out.println(windowId);
		}
	public static void alertAccept2() throws AWTException {
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	public static void switchtab() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	public static void switchtab1() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	public static void launchedge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	public static void newtab() {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public static void downedu() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	

	public static void back() {
		driver.navigate().back();
			}
	public static void Refresh() {
		driver.navigate().refresh();
			}
	    public static void openChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		
	}
	public static void selectValue(WebElement element, String value) {
		se = new Select(element);
		se.selectByVisibleText(value);
	}
	public static void broken() throws MalformedURLException, AWTException, Exception {		
		
		int i = 1;		
		List<WebElement> imagelist = driver.findElements(By.xpath("//*[@class=\"cbslike-content cbslikeadded\"]"));
		for (int j = 1; j < imagelist.size(); j++) {
			WebElement imgElement = driver.findElement(By.xpath("(//*[@class=\"cbslike-content cbslikeadded\"])["+j+"]"));
				  try { 
				   HttpClient client = HttpClientBuilder.create().build(); 
				   HttpGet request = new HttpGet(imgElement.getAttribute("src")); 
				   HttpResponse response = client.execute(request); 
				     URLConnection urlConnection = new URL(imgElement.getAttribute("src")).openConnection();
					int length = urlConnection.getContentLength();
				   if (length == 11929) {			   
					   i++;
					   System.out.println("print http response" + response.getStatusLine().getStatusCode());
					   System.out.println(length);
					System.out.println(imgElement.getAttribute("src") + " is broken");
		try { 
				
					btnClick(imgElement);
					
					ArrayList<String> tabs5=new ArrayList<String>(driver.getWindowHandles());
					//System.out.println(tabs5.size());
				      driver.switchTo().window(tabs5.get(tabs5.size()-1));    	      
				      WebElement viewimagenotavailable = driver.findElement(By.xpath("//*[@id=\"imgid_0_1\"]"));
				     // System.out.println(viewimagenotavailable.getAttribute("src"));
				      URLConnection urlConnection1 = new URL(viewimagenotavailable.getAttribute("src")).openConnection();
						int length1 = urlConnection1.getContentLength();
						if (length1 == 11929) {
							System.out.println(length1);
							System.out.println(viewimagenotavailable.getAttribute("src") + " is broken");
						}
				      } catch (Exception e) { 
					    System.out.println("request view photo");
					   }		
					Thread.sleep(6000);
					switchWindow(0);
					Thread.sleep(6000);
					 
				}
//				   else {
//					System.out.println(imagesList.get(invalidImageCount).getAttribute("src") + " is not broken");
//				}
				   } catch (Exception e) { 
				     e.printStackTrace(); 
				   }
				  } 
		try {
		WebElement Next = driver.findElement(By.xpath("//*[text()='Next ']"));
		 btnClick(Next);
	 } catch (Exception e) { 
	     e.printStackTrace(); 
	   }
				 }			 

	
	public static void brokendashboard() throws MalformedURLException, Exception {
		int invalidImageCount = -1; 
		int m = 1;
				
				List<WebElement> imagesList = driver.findElements(By.tagName("img")); 
				System.out.println("Total no. of images are " + imagesList.size()); 

				for (WebElement imgElement : imagesList) { 
				 if (imgElement != null) { 
				  try { 
				   HttpClient client = HttpClientBuilder.create().build(); 
				   HttpGet request = new HttpGet(imgElement.getAttribute("src")); 
				   
				   HttpResponse response = client.execute(request);
				     invalidImageCount++; 
				     URLConnection urlConnection = new URL(imgElement.getAttribute("src")).openConnection();
					int length = urlConnection.getContentLength();
					//System.out.println(length);
				
				   if (length == 11929) {
					   m++;
					   System.out.println("print http response" + response.getStatusLine().getStatusCode());
					   System.out.println(length);
					System.out.println(imagesList.get(invalidImageCount).getAttribute("src") + " is broken");
					try { 
						
						btnClick(imgElement);
						ArrayList<String> tabs5=new ArrayList<String>(driver.getWindowHandles());
						//System.out.println(tabs5.size());
					      driver.switchTo().window(tabs5.get(tabs5.size()-1));    	      
					      WebElement viewimagenotavailable = driver.findElement(By.xpath("//*[@id=\"imgid_0_1\"]"));
						     // System.out.println(viewimagenotavailable.getAttribute("src"));
						      URLConnection urlConnection1 = new URL(viewimagenotavailable.getAttribute("src")).openConnection();
								int length1 = urlConnection1.getContentLength();
								if (length1 == 11929) {
									System.out.println(length1);
									System.out.println(viewimagenotavailable.getAttribute("src") + " is broken");
								}
					      } catch (Exception e) { 
						    System.out.println("request view photo");
						   }		
						Thread.sleep(6000);
						switchWindow(0);
						Thread.sleep(6000);
						alertAccept1();
					}
//					   else {
//						System.out.println(imagesList.get(invalidImageCount).getAttribute("src") + " is not broken");
//					}
					   } catch (Exception e) { 
					     
					   }
				 }
				}
			}
public static void brokenviewnotcontacted() throws MalformedURLException, AWTException, Exception {		
		
		int i = 1;		
		//List<WebElement> imagelist = driver.findElements(By.xpath("//*[@class=\"cbslike-content cbslikeadded\"]"));
		for (int j = 1; j < 50; j++) {
			WebElement imgElement = driver.findElement(By.xpath("(//*[@class=\"cbslike-content cbslikeadded\"])["+j+"]"));
				  try { 
				   HttpClient client = HttpClientBuilder.create().build(); 
				   HttpGet request = new HttpGet(imgElement.getAttribute("src")); 
				   HttpResponse response = client.execute(request); 
				     URLConnection urlConnection = new URL(imgElement.getAttribute("src")).openConnection();
					int length = urlConnection.getContentLength();
				   if (length == 11929) {			   
					   i++;
					   System.out.println("print http response" + response.getStatusLine().getStatusCode());
					   System.out.println(length);
					System.out.println(imgElement.getAttribute("src") + " is broken");
			
					
					try { 
				
					btnClick(imgElement);
					
					ArrayList<String> tabs5=new ArrayList<String>(driver.getWindowHandles());
					//System.out.println(tabs5.size());
				      driver.switchTo().window(tabs5.get(tabs5.size()-1));    	      
				      WebElement viewimagenotavailable = driver.findElement(By.xpath("//*[@id=\"imgid_0_1\"]"));
				     // System.out.println(viewimagenotavailable.getAttribute("src"));
				      URLConnection urlConnection1 = new URL(viewimagenotavailable.getAttribute("src")).openConnection();
						int length1 = urlConnection1.getContentLength();
						if (length1 == 11929) {
							System.out.println(length1);
							System.out.println(viewimagenotavailable.getAttribute("src") + " is broken");
							try { 	
					//	btnClick(b.getShortlist());	
					//	btnClick(b.getShortlistclose());	
							 } catch (Exception e) { 
								  //  System.out.println("Already short list ");
								   }	
						}
				      } catch (Exception e) { 
					    System.out.println("request view photo");
					   }		
					Thread.sleep(6000);
					switchWindow(0);
					Thread.sleep(6000);
					 
				}
//				   else {
//					System.out.println(imagesList.get(invalidImageCount).getAttribute("src") + " is not broken");
//				}
				   } catch (Exception e) { 
				     e.printStackTrace(); 
				   }
				  } 
		
				 }			 
public static void brokenhome() throws MalformedURLException, AWTException, Exception {		
	
	int i = 1;		
	//List<WebElement> imagelist = driver.findElements(By.xpath("//*[@class=\"cbslike-content cbslikeadded\"]"));
	for (int j = 1; j < 11; j++) {
		WebElement imgElement = driver.findElement(By.xpath("(//*[@class=\"home-wrapper clearfix\"]//img)["+j+"]"));
		
		String value = imgElement.getCssValue("background-image");
		int n = value.indexOf("h");
		int m = value.lastIndexOf('"');
		String zee = value.substring(n, m);
		//System.out.println(zee);
		try { 
			   HttpClient client = HttpClientBuilder.create().build(); 
			   HttpGet request = new HttpGet(zee); 
			   HttpResponse response = client.execute(request); 
			     URLConnection urlConnection = new URL(zee).openConnection();
				int length = urlConnection.getContentLength();
			   if (length == 6631) {			   
				   System.out.println("print http response" + response.getStatusLine().getStatusCode());
				   System.out.println(length);
				System.out.println(zee + " is broken");
		
			   }
				
			   } catch (Exception e) { 
			     e.printStackTrace(); 
			   }
			  } 
	
			 }		
public static void brokenhomesearch() throws MalformedURLException, AWTException, Exception {		
	
	int i = 1;		
	//List<WebElement> imagelist = driver.findElements(By.xpath("//*[@class=\"cbslike-content cbslikeadded\"]"));
	for (int j = 1; j < 11; j++) {
		WebElement imgElement = driver.findElement(By.xpath("(//*[@class=\"cbslike-content cbslikeadded user-photo-thumb\"])["+j+"]"));		
		String value = imgElement.getCssValue("background-image");
		int n = value.indexOf("h");
		int m = value.lastIndexOf('"');
		String zee = value.substring(n, m);
		//System.out.println(zee);
		try { 
			   HttpClient client = HttpClientBuilder.create().build(); 
			   HttpGet request = new HttpGet(zee); 
			   HttpResponse response = client.execute(request); 
			     URLConnection urlConnection = new URL(zee).openConnection();
				int length = urlConnection.getContentLength();
			   if (length == 11929) {			   
				   System.out.println("print http response" + response.getStatusLine().getStatusCode());
				   System.out.println(length);
				System.out.println(zee + " is broken");
		
			   }
				
			   } catch (Exception e) { 
			     e.printStackTrace(); 
			   }
			  } 
	try {
		
		WebElement Next = driver.findElement(By.xpath("//*[text()=' Next ']"));
		toMove(Next);
		 btnClick(Next);
	 } catch (Exception e) { 
	    System.out.println("a1");
	   }
try {
		
		WebElement Popclose = driver.findElement(By.xpath("//*[@class=\"clrgray popclose popupclose\"]"));
		toMove(Popclose);
		 btnClick(Popclose);
	 } catch (Exception e) { 
	   // System.out.println("clickpopupclose");
	   }
			 }		
	public static void toInput(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void alertAccept1() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void switchWindow(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		am= new ArrayList();
		List<String>listofwindowid =  am ;
		listofwindowid.addAll(windowHandles);
		String index = listofwindowid.get(i);
		driver.switchTo().window(index);
	}
	public static void toMove(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public static void btnClick(WebElement element) throws Exception {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void launchUrl(String pgUrl) {
		driver.get(pgUrl);
		 b = new CBSPomimage();

	}

	public static void toGetTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void toGetUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void toMaximizeWindow() {
		driver.manage().window().maximize();

	}

//	private void toMinimizeWindow() {
//		driver.manage().window().minimize();
//
//	}
	public static void downScroll(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		public static void upScroll(WebElement element) {
			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);	
		}

	public static void toFillTextBox(WebElement element, String Data) {
		element.sendKeys(Data);

	}

	public static void toClickButton(WebElement clickKey) {
		clickKey.click();

	}

	
	
	public static void waitingWeb() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	public static void pageLoadTime() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}
	
	public static void quitBrowser() {
		driver.quit();

	}

	public static void closeTab() {
		driver.close();

	}

	public static void pressEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void pressTab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static void pressShift() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);

	}

	public static void pressCtrl() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void rightClick(WebElement ref) {
		a = new Actions(driver);
		a.contextClick(ref).perform();

	}

	public static void doubleClick(WebElement target) {
		a = new Actions(driver);
		a.doubleClick(target).perform();

	}

	public static void moveToElement(WebElement src) {
		a = new Actions(driver);
		a.moveToElement(src).perform();

	}

	public static void dragAndDrop(WebElement Source, WebElement tgt) {
		a = new Actions(driver);
		a.dragAndDrop(Source, tgt);

	}

	public static void acceptValue() {
		al = driver.switchTo().alert();
		al.accept();

	}

	public static void dismissValue() {
		al = driver.switchTo().alert();
		al.dismiss();

	}

	public static void sendKeysAlert(String send) {
		al = driver.switchTo().alert();
		al.sendKeys(send);

	}

	public static void getTextAlert() {
		al = driver.switchTo().alert();
		al.getText();
	}

	public static void getScreenshotAs(String PicName) throws IOException {
		s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		Long time=System.currentTimeMillis();
		File des = new File(System.getProperty("user.dir")+"\\screenshots" + time + ".png");
		FileUtils.copyFile(src, des);

	}
	

	public static String readFromExcel(String SheetName, int rowNo, int cellNo) throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\ExcelSheets\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fin);
		Sheet sh = b.getSheet(SheetName);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();

		String data;
		if (type == 1) {
			data = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("mm dd, yy");
			data = sim.format(d);
		} else {
			double d = c.getNumericCellValue();
			long lo = (long) d;
			data = String.valueOf(lo);
		}
		return data;
	}

	public static String writeFromExcel(String picName, String SheetName, int rowNo, int cellNo) throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\ExcelSheets\\Book1.xlsx");

		Workbook b = new XSSFWorkbook();
		Sheet sh = b.createSheet(SheetName);
		Row r = sh.createRow(rowNo);
		Cell c = r.createCell(cellNo);
		FileOutputStream fout = new FileOutputStream(f);
		b.write(fout);
		int type = c.getCellType();
		return SheetName;

	}


}
