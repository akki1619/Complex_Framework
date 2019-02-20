package common_Functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class JSFunctions {

	
	JavascriptExecutor js;
	
	public void scrollToElement(WebDriver driver,WebElement element) {
		
	
		js = (JavascriptExecutor) driver;  
		
		js.executeScript("arguments[0].scrollIntoView();", element);
	
	
	}
	
	
	public void scrollByPixel(WebDriver driver,int xPixels,int yPixels) {
		
		js = (JavascriptExecutor) driver; 
		 
		js.executeScript("window.scrollBy("+xPixels+","+yPixels+")");
	
	
	}
	
	public void scrollToBottom(WebDriver driver) {
		
		
		js = (JavascriptExecutor) driver;  
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	
	}
	
	
	
}
