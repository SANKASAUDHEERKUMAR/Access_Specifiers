package Realtorproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Com_Realtor_fun extends Com_Raltor_obj_ver{

	public void openapp(){
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		ssk=new ChromeDriver();
		ssk.navigate().to(URL);
	}
	public void Register(){
		ssk.findElement(By.xpath("//div[@id='search-bar']/div/div[3]/ul/li[3]/a")).click();
		Select title=new Select(ssk.findElement(By.xpath("//select[@id='prefix'][@name='prefix']")));
		title.selectByIndex(1);
		ssk.findElement(By.name("firstname")).sendKeys("sudheer");
		ssk.findElement(By.name("lastname")).sendKeys("Sanka");
		ssk.findElement(By.name("email")).sendKeys("sudheerssk90@gmail.com");
		
	}
}
