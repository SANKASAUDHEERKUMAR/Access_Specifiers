package Selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks 
{
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		
		ssk.get("https://www.google.com/");
		
		List<WebElement> links=ssk.findElements(By.tagName("a"));
		int count=links.size();
			System.out.println("Total links : "+count);
			
		for(int i=0;i<links.size();i++) 
		{
			String output=links.get(i).getText();
			System.out.println("Links name is : "+output);
			if(output!=""){
				continue;
			}
		}
	}
}
