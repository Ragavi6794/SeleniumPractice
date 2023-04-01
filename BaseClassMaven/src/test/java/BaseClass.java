

	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;


	public class BaseClass {

		public static WebDriver driver ;   //interface
		public static Alert a;             //class
		public static Actions ac;          //class
		public static Action act;          //class
		public static Robot r;             //class
		public static Select s;            //class
		public static JavascriptExecutor js; //interface
		public static TakesScreenshot tk;  //interface


		//launchBrowser types
		public static void launchChromeBrowser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}

		public static void launchFirefoxBrowser() {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		public static void launchIEBrowser() {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		//webdriver methods
		//load Url passed arguments
		public static void loadUrl(String Url) {  
			driver.get(Url);
		}
		//maximize window
		public static void maximize() {
			driver.manage().window().maximize();
		}
		//getTitle()
		public static void getTitle() {
			String title = driver.getTitle();
			System.out.println("WebSite Title:" +title);
		}
		//current page url
		public static void getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Website CurrentUrl:" +currentUrl);
		}
		//cookie
		public static void getCookie() {
			driver.manage().getCookies();
		}
		public static void deleteAllCookie() {
			driver.manage().deleteAllCookies();
		}
		//quit
		public static void quit() {  
			driver.quit();
		}
		//close
		public static void close() {  
			driver.close();
		}
		//navigateBack
		public static void navigateBack() {
			driver.navigate().back();
		}
		//navigateBack
		public static void navigateForward() {
			driver.navigate().forward();
		}
		//navigateBack
		public static void navigateRefresh() {
			driver.navigate().refresh();
		}
		//navigate url
		public static void navigateTo(String Url) {
			driver.navigate().to(Url);
		}
		//webelements methods
		//sendkeys
		public static void sendkey(WebElement element,String text) {
			element.sendKeys(text);
		}
		//click
		public static void click(WebElement element) {
			element.click();

		}
		//submit
		public static void submit(WebElement element) {
			element.submit();
		}
		
		//clear
		public static void clear(WebElement element) {
			element.clear();
		}
		//webelements Methods
		//To getAttribute id ="pass"  =>o/p =>pass
		public static void getAttributeName(WebElement element,String name) {
			String attributeName = element.getAttribute(name);
			System.out.println("Attribute Name:" +attributeName);
		}
		//To getAttribute value = id="pass"  => Enter Password
		public static void getAttributeValue(WebElement element,String value) {
			String attValue = element.getAttribute(value);
			System.out.println("Attribute Value:" +attValue);

		}
		//To getTagName => input
		public static void getTagName(WebElement element) {
			String tagName = element.getTagName();
			System.out.println("TagName:" +tagName);
		}
		//To getText()
		public static void getText(WebElement element) {
			String getText = element.getText();
			System.out.println("Get Text" +getText);
		}
		//isDisplayed
		public static void displayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			System.out.println("Displayed" +displayed);

		}
		//isEnabled
		public static void enabled(WebElement element) {
			boolean enabled = element.isEnabled();
			System.out.println("Enabled" +enabled);
		}
		//isSelected
		public static void selected(WebElement element) {
			boolean selected = element.isSelected();
			System.out.println("Selected" +selected);
		}
		//getLocation
		public static void getLoacation(WebElement element) {
			Point location = element.getLocation();
			System.out.println("Location" +location);
		}

		//Alert Methods
		//Alert a=driver.switchTo().alert();

		//   	public static void alert() {
		//   		driver.switchTo().alert();
		//   	}
		public static void alert() {
			driver.switchTo().alert();
		}
		public static void accept() {   //accept
			a.accept();
		}

		public static void dismiss() { //dismiss
			a.dismiss();
		}
		public static void sendkeys(WebElement element,String text) {
			a.sendKeys(text);
		}

		public static void getText() {
			String text1 = a.getText();
			System.out.println(text1);
		}

		//Actions class is used to perform mouse operations
		//Actions ac=new Actions(driver);    
		//moveToElement
		public static void moveToElement(WebElement element) {
			ac=new Actions(driver);
			ac.moveToElement(element).perform();;
		}
		//dragAndDrop
		public static void dragAndDrop(WebElement src,WebElement des) {
			ac=new Actions(driver);
			ac.dragAndDrop(src, des).perform();
		}
		//contextClick
		public static void rightClick(WebElement element) {
			ac=new Actions(driver);
			ac.contextClick(element).perform();
		}
		//doubleClick
		public static void doubleClick(WebElement element) {
			ac=new Actions(driver);
			ac.doubleClick(element).perform();
		}
		//clickAndHold
		public static void clickAndHold(WebElement element) {
			ac=new Actions(driver);
			ac.clickAndHold(element).perform();
		}

		//Robot Class
		//Robot r=new Robot();  //handled window applications keyboard operations
		//enter keyboard actions
		public static void enter() {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		//up
		public static void up() {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		//down
		public static void down() {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		//copy
		public static void copy() {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		}
		//paste
		public static void paste() {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		}

		//Select class for Dropdown
		//Select s=new Select(element)
		//selected by index
		public static void selectByIndex(WebElement element,int index) {
			s.selectByIndex(index);
		}
		//selected by value
		public static void selectByValue(WebElement element,String value) {
			s.selectByValue(value);
		}
		//selectedbyvisibletext
		public static void selectByVisibleText(String text) {
			s.selectByVisibleText(text);
		}
		//if check is multiple or not
		public static void isMultiple() {
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		}
		//getalloptions in dropdown
		public static void getOptions() {
			List<WebElement> options = s.getOptions();
			for(WebElement opt:options) {
				System.out.println("List of WebElement"+opt.getText());
			}
		}
		//get only selected options
		public static void getAllSelectedOptions() {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for(WebElement select:allSelectedOptions) {
				System.out.println("AllSelectedOptions:" +select.getText());
			}
		}

		//get first selected option
		public static void getFirstSelectedOption() {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption);
		}

		//deselected based on index
		public static void deselectByindex(int index) {
			s.deselectByIndex(index);
		}
		//deselect based on value
		public static void deselectByValue(String text) {
			s.deselectByValue(text);
		}
		//deselect based on visibletext
		public static void deselectByVisibleText(String text) {
			s.deselectByVisibleText(text);
		}

		//deselect all
		public static void deselectAll() {
			s.deselectAll();
		}

		//TakesScreenshots tk=(TakesScreenshots)driver;

		public static void takeScreenshot(WebElement element,File f1) {
			File src = tk.getScreenshotAs(OutputType.FILE);
		}

		//JavascriptExecutor js=(JavaScriptExecutor)driver;
		//scrollup
		public static void scrollUp(WebElement element) {
			js.executeScript("arguments[0].scrollIntoView(true)",element);
		}
		//scrolldown
		public static void scrollDown(WebElement element) {
			js.executeScript("arguments[0].scrollIntoView(false)", element);
		}

		//scrolltop
		public static void scrollToTop() {
			js.executeScript("window.scrollTo(0,0)");
		}
		//light scrolldown
		public static void scrollNext() {
			js.executeScript("window.scrollTo(0,1000)"); 
		}
		//scrollToendscreenDown
		public static void scrollToDown() {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		//getAttributes
		public static void getAttribute() {
			js.executeScript("return arguments[0].getAttribute('value')"); 
		}
		//sendkey replacement
		public static void setAttribute(WebElement element,String text) {
			js.executeScript("arguments[0].SetAttribute('element','text')"); 
		}

		//click replacement
		public static void jsClick() {
			js.executeScript("arguments[0].click()");     
		}

		//draw border injs
		public static void drawBorder(WebElement element) {
			js.executeScript("arguments[0].style.border='3px solid red'",element); 
		}
		//refresh
		public static void jsRefresh() {
			js.executeScript("history.go(0)");  
		}
		//reload
		public static void reload() {
			js.executeScript("location.reload()"); 
		}
		//return website title js
		public static void title() {
			String sText =  js.executeScript("return document.title").toString();
			System.out.println(sText);

		}

		//Frames
		//driver.switchTo().frames()
		//Index based
		public static void frameIndex(int index) {
			driver.switchTo().frame(index);
		}
		//id based
		public static void frameId(String id) {
			driver.switchTo().frame(id);
		}

		//frame name
		public static void frameName(String name) {
			driver.switchTo().frame(name);
		}

		//frame webelement
		public static void frameWebElement(WebElement element) {
			driver.switchTo().frame(element);
		}

		//swith to parent frame
		public static void frameParent() {
			driver.switchTo().parentFrame();
		}

		//out from frame to Html
		public static void frameOut() {
			driver.switchTo().defaultContent();
		}

		//Window Handles
		//windowTitle
		public static void windowTitle(String title) {
			driver.switchTo().window(title);
		}
		//windows id
		public static void windowsId(String windowsid) {
			driver.switchTo().window(windowsid);
		}
		//parent window id
		public static void windowHandle() {
			String windowHandle = driver.getWindowHandle();
			System.out.println("Parent Window Id:" +windowHandle);
		}
		//parent and child window id
		public static void windowHandles() {
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println("Parent+Child:" +windowHandles);
		}
	    //waits
		public static void wait(int num) throws InterruptedException {
			Thread.sleep(num);
		}
		public static void implicitWait(Integer num,TimeUnit text) {
			driver.manage().timeouts().implicitlyWait(num, text);
		}
	}



