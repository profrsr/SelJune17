package reflections;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import wrappers.Wrappers;

public class WrapperMethods implements Wrappers {

	public RemoteWebDriver driver;
	int i=1;

	public void invokeApp(String browser, String Url) {		
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("The browser:" + browser + " launched successfully");
		} catch (WebDriverException e) {			
			System.out.println("The browser:" + browser + " could not be launched");
		}
	}


	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Babu - TestLeaf
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public void enterById(String idValue, String data) {
		try {
			driver.findElement(By.id(idValue)).clear();
			driver.findElement(By.id(idValue)).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+idValue);
		} catch (NoSuchElementException e) {
			System.out.println("The data: "+data+" could not be entered in the field :"+idValue);
		} catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Title");
		}
	}

	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Babu - TestLeaf
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public void enterByName(String nameValue, String data) {
		try {
			driver.findElement(By.name(nameValue)).clear();
			driver.findElement(By.name(nameValue)).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+nameValue);
		} catch (NoSuchElementException e) {
			System.out.println("The data: "+data+" could not be entered in the field :"+nameValue);
		} catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Title");
		}
	}

	/**
	 * This method will enter the value to the text field using Xpath attribute to locate
	 * 
	 * @param XpathValue - Xpath of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Babu - TestLeaf
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public void enterByXpath(String XpathValue, String data) {
		try {
			driver.findElement(By.xpath(XpathValue)).clear();
			driver.findElement(By.xpath(XpathValue)).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+XpathValue);
		} catch (NoSuchElementException e) {
			System.out.println("The data: "+data+" could not be entered in the field :"+XpathValue);
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Title");
		}
	}

	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Babu - TestLeaf
	 */
	public void verifyTitle(String title){		
		try{			
			if (driver.getTitle().equals(title)){
				System.out.println("The title of the page matches with the value :"+title);
			}else{
				System.out.println("The title of the page:"+driver.getTitle()+" did not match with the value :"+title);
			}
		}catch (WebDriverException e) {
			System.out.println("Unknown exception occured while verifying the Title");
		}
	}

	/**
	 * This method will verify the given text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Babu - TestLeaf
	 */
	public void verifyTextById(String id, String text){
		String sText = driver.findElementById(id).getText();
		try {
			if (sText.equals(text)){
				System.out.println("The text: "+sText+" matches with the value :"+text);
			}else{
				System.out.println("The text: "+sText+" did not match with the value :"+text);
			}
		}catch (NoSuchElementException e) {
			System.out.println("The element: "+id+" not founded in the DOM");
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}

	}

	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Babu - TestLeaf
	 */
	public void verifyTextByXpath(String xpath, String text){
		String sText = driver.findElementByXPath(xpath).getText();
		try {
			if (sText.equals(text)){
				System.out.println("The text: "+sText+" matches with the value :"+text);
			}else{
				System.out.println("The text: "+sText+" did not match with the value :"+text);
			}
		}catch (NoSuchElementException e) {
			System.out.println("The element: "+xpath+" not founded in the DOM");
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
	}

	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Babu - TestLeaf
	 */
	public void verifyTextContainsByXpath(String xpath, String text){
		try {
			String sText = driver.findElementByXPath(xpath).getText();
			if (driver.findElementByXPath(xpath).getText().trim().contains(text)){
				System.out.println("The text: "+sText+" contains the value :"+text);
			}else{
				System.out.println("The text: "+sText+" doesn't contain the value :"+text);
			}
		} catch (NoSuchElementException e) {
			System.out.println("The element: "+xpath+" not founded in the DOM");
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
	}	

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickById(String id) {
		try{
			driver.findElementById(id).click();
			System.out.println("The element with id: "+id+" is clicked.");
		} catch (NoSuchElementException e) {
			System.out.println("The element with id: "+id+" could not be clicked.");
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
	}

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByClassName(String classVal) {
		try{
			driver.findElementByClassName(classVal).click();
			System.out.println("The element with class Name: "+classVal+" is clicked.");
		} catch (NoSuchElementException e) {
			System.out.println("The element with class Name: "+classVal+" could not be clicked.");
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}finally {

		}
	}

	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByName(String name) {
		try{
			driver.findElementByName(name).click();
			System.out.println("The element with name: "+name+" is clicked.");
		} catch (NoSuchElementException e) {
			System.out.println("The element with name: "+name+" could not be clicked.");
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}finally {

		}
	}

	/**
	 * This method will click the element using link name as locator
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByLink(String link){
		try{			
			driver.findElementByLinkText(link).click();
			System.out.println("The element with link name: "+link+" is clicked.");
		} catch (NoSuchElementException e) {
			System.out.println("The element with link name: "+link+" could not be clicked.");
			throw new RuntimeException();
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}finally {

		}
	}

	/**
	 * This method will click the element using link name as locator and do not take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */

	public void clickByLinkNoSnap(String link){
		try{			
			driver.findElementByLinkText(link).click();
			System.out.println("The element with link name: "+link+" is clicked.");
		} catch (NoSuchElementException e) {
			System.out.println("The element with link name: "+link+" could not be clicked.");
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
	}

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByXpath(String xpathVal) {
		try{		
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element : "+xpathVal+" is clicked.");
		} catch (NoSuchElementException e) {
			System.out.println("The element with xpath: "+xpathVal+" could not be clicked.");
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
	}

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByXpathNoSnap(String xpathVal){
		try{		
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element : "+xpathVal+" is clicked.");
		} catch (NoSuchElementException e) {
			System.out.println("The element with xpath: "+xpathVal+" could not be clicked.");
		}catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
	}

	/**
	 * This method will get the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element 
	 * @author Babu - TestLeaf
	 */
	public String getTextById(String idVal){
		String txt = "";
		try{
			txt = driver.findElementByXPath(idVal).getText();
		} catch (NoSuchElementException e) {
			System.out.println("The element with id: "+idVal+" could not be found.");
		} catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
		return txt;
	}

	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 * @author Babu - TestLeaf
	 */
	public String getTextByXpath(String xpathVal){
		String txt = "";
		try{
			txt = driver.findElementByXPath(xpathVal).getText();
		} catch (NoSuchElementException e) {
			System.out.println("The element with xpath: "+xpathVal+" could not be found.");
		} catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
		return txt;
	}

	/**
	 * This method will select the drop down visible text using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Babu - TestLeaf
	 */
	public void selectVisibileTextById(String id, String value){
		try{
			new Select(driver.findElementById(id)).selectByVisibleText(value);;
			System.out.println("The element with id: "+id+" is selected with value :"+value);
		} catch (NoSuchElementException e) {
			System.out.println("The value: "+value+" could not be selected.");
		} catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
	}

	/**
	 * This method will select the drop down value using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Babu - TestLeaf
	 */
	public void selectIndexById(String id, int value) {
		try{
			new Select(driver.findElementById(id)).selectByIndex(value);
			System.out.println("The element with id: "+id+" is selected with value :"+value);
		} catch (NoSuchElementException e) {
			System.out.println("The value: "+value+" could not be selected.");
		} catch (WebDriverException e) {			
			System.out.println("Unknown exception occured while verifying the Text");
		}
	}

	public void switchToLastWindow() {
		try {
			Set<String> allWin = driver.getWindowHandles();
			for (String eachWin : allWin) {
				driver.switchTo().window(eachWin);
			}
		} catch (Exception e) {

		}
	}

	/**
	 * This method will switch to the parent Window
	 * @author Babu - TestLeaf
	 */
	public void switchToParentWindow() {
		try {
			Set<String> allWin = driver.getWindowHandles();
			for (String eachWin : allWin) {
				driver.switchTo().window(eachWin);
				break;
			}
		} catch (Exception e) {

		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.out.println("The alert could not be found.");
		} catch (Exception e) {
			System.out.println("The alert could not be accepted.");
		}
	}
		
	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("The alert could not be found.");
		} catch (Exception e) {
			System.out.println("The alert could not be accepted.");
		}	
	}

	public String getAlertText(){
		String sText = "";
		try{
			sText = driver.switchTo().alert().getText();
			acceptAlert();
		} catch(Exception e){

		}
		return sText;
	}

	/**
	 * This method will take snapshot of the browser
	 * @author Babu - TestLeaf
	 */
	public void takeSnap(){
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snap"+i+".jpeg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed.");		
		} catch (IOException e) {
			System.out.println("There was IO Exception while taking the SnapShot");
		}
		i++;		
	}
		
	/**
	 * This method will close the active browser
	 * @author Babu - TestLeaf
	 */
	public void closeBrowser(){
		try {
			driver.close();
			System.out.println("Browser Closed");
		} catch (Exception e) {
			System.out.println("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.");
		}		
	}
	
	
	/**
	 * This method will close all the browsers
	 * @author Babu - TestLeaf
	 */
	public void closeAllBrowsers(){
		try {
			driver.quit();
			System.out.println("Browser Closed");
		} catch (Exception e) {
			System.out.println("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.");
		}
		
	}


	
}

