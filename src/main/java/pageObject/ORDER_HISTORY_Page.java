package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ORDER_HISTORY_Page 
{
	
	WebDriver driver;
	
	public ORDER_HISTORY_Page(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	By Download_your_invoice_as_PDF_file=By.cssSelector("div[class='info-order box'] a[target='_blank']");
	
	
	By center_column =By.xpath("//div[@id='center_column']  /div/table/tbody/tr[1]/td[7]/a[1]");
	
	
	By page=By.id("history");
	
	
	
	public WebElement Get_Download_your_invoice_as_PDF_file() 
	{
		
	return	driver.findElement(Download_your_invoice_as_PDF_file);
		
	}
	
	public WebElement center_Column() 
	{
		return	driver.findElement(center_column);
		
	}
	
	
	
	public WebElement page() 
	{
		return	driver.findElement(page);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
