package Selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class menus {

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		ssk.get("http://localhost/orangehrm-2.6/login.php");
		ssk.findElement(By.name("txtUserName")).sendKeys("admin");
		ssk.findElement(By.name("txtPassword")).sendKeys("admin");
		ssk.findElement(By.name("Submit")).click();
		WebElement Menus=ssk.findElement(By.xpath("//ul[@id='nav']/li[1]/a/span"));
		Actions ac=new Actions(ssk);
		ac.moveToElement(Menus).perform();
		List<WebElement> Menubar=ssk.findElements(By.tagName("span"));
		int count=Menubar.size();
		System.out.println(count);
		for (int i = 0; i< Menubar.size(); i++) {
			String output = Menubar.get(i).getText();
			System.out.println(output);
		}
		
		/*List<WebElement> Menubar = ssk.findElements(By.tagName("span"));
		int count=Menubar.size();
		for(int i=0;i<Menubar.size();i++){
			String output=Menubar.get(i).getText();
			System.out.println(output);
		}*/
		
		
	}
}
