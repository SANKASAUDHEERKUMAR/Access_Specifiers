package Selenium_practice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		//ssk.manage().deleteAllCookies();
		ssk.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ssk.get("https://www.google.com/");
		ssk.findElement(By.name("q")).sendKeys("java");
		/*List<WebElement> list=ssk.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Totla no of Search list is:" +list.size());*/
		List<WebElement> list=ssk.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("Totla no of Search list is:" +list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("java 8 features")){
				list.get(i).click();
				break;
			}
		}
		ssk.findElement(By.name("q")).clear();
		ssk.findElement(By.name("q")).sendKeys("java 8 features");
		List<WebElement> list1=ssk.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("Totla no of Search list is:" +list1.size());
		try {
			for(int j=0;j<list1.size();j++){
				System.out.println(list1.get(j).getText());
				if(list1.get(j).getText().equals("java 8 features geeksforgeeks")){
					System.out.println("xxx");
					list1.get(j).click();
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No such element found");
		}
		
		
		
	}
}
