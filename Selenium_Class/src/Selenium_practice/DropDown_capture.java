package Selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_capture {

	public static void main(String argc[]) throws Exception{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new FirefoxDriver();
		ssk.get("http://localhost/orangehrm-2.6/");
		Thread.sleep(2000);
		ssk.findElement(By.name("txtUserName")).sendKeys("admin");
		ssk.findElement(By.name("txtPassword")).sendKeys("admin");
		ssk.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		ssk.switchTo().frame("rightMenu");
		//ssk.findElement(By.xpath("//select[@id='loc_code']")).click();
		Select drpdwn=new Select(ssk.findElement(By.xpath("//select[@id='loc_code']")));
		drpdwn.selectByIndex(6);
		//List<WebElement> ts=drpdwn.getOptions();      this is used to capture all values from the dropdown
		List<WebElement> ts=drpdwn.getAllSelectedOptions();  //This is for only selected value
		int count=ts.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++){
			WebElement capture=ts.get(i);
			System.out.println(capture.getText());
		}
		
		ssk.switchTo().defaultContent();
		//ssk.quit();
		
}
}
