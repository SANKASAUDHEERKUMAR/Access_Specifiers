package Selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checklist_count {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		ssk.navigate().to("http://localhost/orangehrm-2.6/");
		ssk.findElement(By.name("txtUserName")).sendKeys("admin");
		ssk.findElement(By.name("txtPassword")).sendKeys("admin");
		ssk.findElement(By.name("Submit")).click();
		ssk.switchTo().frame("rightMenu");
		List<WebElement> clists=ssk.findElements(By.xpath("//input[@name='chkLocID[]']"));
		System.out.println("checklist count is:" + clists.size());
		for (WebElement cl : clists) {
			if(!cl.isSelected()){
				cl.click();
				System.out.println("Selected checklist size is:" + cl.getSize());
			}
		}
		ssk.switchTo().defaultContent();
		ssk.quit();

	}

}
