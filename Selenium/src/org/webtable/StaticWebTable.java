package org.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://softwaretestingo.blogspot.com/2020/09/static-table.html");
		
		//How many rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"post-body-2550359478821280401\"]/table/tbody/tr"));
		int rowsize = rows.size();  //no of rows in webtable
		System.out.println("No of Rows:" +rowsize);
		
		//How many columns in table
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"post-body-2550359478821280401\"]/table/tbody/tr[1]/th"));
		int columnsize = columns.size();  //no of columns
		System.out.println("No of Columns:" +columnsize);
		
		//how to retrieve specific data (RC)=>ROW-COLUMN xpath
        WebElement specific = driver.findElement(By.xpath("//*[@id=\"post-body-2550359478821280401\"]/table/tbody/tr[4]/td[1]"));
        String text = specific.getText();
        System.out.println("The Value is:" +text);
        
        String text2 = driver.findElement(By.xpath("//*[@id=\"post-body-2550359478821280401\"]/table/tbody/tr[6]/td[4]")).getText();
        System.out.println("The Value is:" +text2);
        
        //4.how to retrieve all the data from the table
      
    	
    	for (int row = 0; row < rowsize; row++) {
    	    //To locate columns(cells) of that specific row.
    	    List < WebElement > Columns_row = rows.get(row).findElements(By.tagName("td"));
    	    
    	    //To calculate no of columns (cells). In that specific row.
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	    
    	    //Loop will execute till the last cell of that specific row.
    	    for (int column = 0; column < columns_count; column++) {
    	    	
    	        // To retrieve text from that specific cell.
    	        String celtext = Columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
    	    System.out.println("-------------------------------------------------- ");
    	}
   	
    	
    	//

    	
        
       // driver.quit();
	}

}
