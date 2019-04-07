package Neelakanta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT 
{
	public static void main(String[] args) throws Exception
	{
		//To Open The Browser
		WebDriver driver=new ChromeDriver();
			System.out.println("Browser Launched");
		
		driver.get("https://www.makemytrip.com/flights?gclid=EAIaIQobChMIp7DU5aWT4AIVg5GPCh1WUQNyEAAYASAAEgLT7fD_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!makemytrip&ef_id=EAIaIQobChMIp7DU5aWT4AIVg5GPCh1WUQNyEAAYASAAEgLT7fD_BwE%3AG%3As");
			System.out.println("URL passed");
	
		Thread.sleep(3000);	
		//To maximize the Browser
		driver.manage().window().maximize();
		
		//From 
		WebElement From=driver.findElement(By.id("hp-widget__sfrom"));
		From.clear();
		Thread.sleep(2000);
		From.sendKeys("Bangalore (BLR)");
		
		//To
		WebElement To=driver.findElement(By.id("hp-widget__sTo"));
		To.sendKeys("Hyderabad (HYD)");
		
		//click on swap
		WebElement swap=driver.findElement(By.xpath("//span[@class='o-i-swap-button']"));	
		for(int i=0;i<2;i++)   //Repeating Loop
		{
			swap.click();
		}
		
		//Click on Depart
		WebElement Depart=driver.findElement(By.id("hp-widget__depart"));
		Depart.click();
		
		WebElement tag=driver.findElement(By.xpath("html/body/div[2]/div[3]/div[3]/div/div[3]/div/div[2]/div/a/span"));
		tag.click();
		
		Thread.sleep(4000);
		WebElement DepartDate=driver.findElement(By.xpath("html/body/div[2]/div[3]/div[3]/div/div[3]/div/div[1]/table/tbody/tr[5]/td[3]"));
		DepartDate.click();
		System.out.println("Clicked On Feb and Selected date");
		
		Thread.sleep(2000);
		driver.findElement(By.id("hp-widget__return")).click();
		
		Thread.sleep(3000);
		WebElement returnDate=driver.findElement(By.xpath("html/body/div[2]/div[3]/div[3]/div/div[4]/div/div[2]/table/tbody/tr[5]/td[3]"));
		returnDate.click();
		System.out.println("Clicked on march and Selected date");
		
		WebElement button=driver.findElement(By.id("searchBtn"));
		button.click();
		System.out.println("Submit is Successful");
		
		Thread.sleep(4000);
		driver.close();
		System.out.println("Close The Browser");
	}
}

