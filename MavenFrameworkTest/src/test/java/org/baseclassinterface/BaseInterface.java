package org.baseclassinterface;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface BaseInterface {
	//documentation for used to create new interface methods
		/**This will launch the chrome browser with the given url
		 * @author Ragavi
		 * @param url
		 * @exception Nullpointer Exception,URLMalfunction
		 */
		void setUp(String url);  //abstract methods
		/**
		 * This method will launch given browser with the given url
		 * @param browserName
		 * @param url
		 *  @author Ragavi
		 */
		void setUp(String browserName,String url);
		
		void close();
		void quit();
		/**
		 * This method to find webelement 
		 */
	    WebElement element(String type,String value);
	    
	    //window handling
	    void switchToWindow(int i);//1st window
	    //dropdown
	    void selectValue(WebElement ele,String value);
	    void selectIndex(WebElement ele,int index);
	    void selectText(WebElement ele,String text);
	    
	    void click(WebElement ele);
	    void type(WebElement ele, String testData, Keys keys);
	    void appendText(WebElement ele, String testData);
	    
	    String getTitle();
	    
	    String getUrl();
	    
	    boolean isDisplayed(WebElement ele);
	    boolean isEnabled(WebElement ele);
	    boolean isSelected(WebElement ele);
	    public  void jsExecutor() ;
	    
	    
	    
	    
}
