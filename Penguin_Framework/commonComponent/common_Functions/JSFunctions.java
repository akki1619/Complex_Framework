package common_Functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class JSFunctions {

	
	JavascriptExecutor js;
	
	public void scrollToElement(WebDriver driver,WebElement element) {
		
	
		js = (JavascriptExecutor) driver;  
		
		js.executeScript("argument[0].scrollIntoView()", element);
	
	
	}
	
	
	public void scrollByPixel(int xPixels,int yPixels) {
		
		
		
		  js.executeScript("window.scrollBy("+xPixels+","+yPixels+")");
	
	
		  
		
		  
	}
	
	
	
	
	
}
