package Selenium_practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Walls_n_Floors {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wallsandfloors.co.uk/");
		driver.findElement(By.xpath("//div[@id='search-bar']/div/div[3]/ul/li[4]/a")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.name("login[username]")).sendKeys("lspatnala@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("lakshmi4321");
		driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
		
		WebElement WE=driver.findElement(By.linkText("All Tiles"));
		Actions Action=new Actions(driver);
		Action.moveToElement(WE).perform();
		// click kitchen tiles
		driver.findElement(By.xpath("//nav[@id='site-nav']/ul/li/div/div/div/div/div/div/ul/li[6]/a")).click(); 
		// Click Aquarelle 300X100 Tiles
		driver.findElement(By.xpath("//img[@alt='Aquarelle 300x100 Tiles']")).click();
		//Click mocha Tiles
		/*WebElement WE1=driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div/a"));
		Action.moveToElement(WE1).click();*/
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div/a")).click();
		// Click Add to Trolley
		driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
		//Click View Trolley/Checkout
		ArrayList<String> Wind =new ArrayList<String>(driver.getWindowHandles());
		System.out.println(driver.switchTo().window(Wind.get(0)).getTitle());
		driver.findElement(By.xpath("//div[@id='messageBox']/div/div/div/div[3]/div[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("WC2N 5DU");
		driver.findElement(By.xpath("//button[@id='update_postcode']/span/span")).click();
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div/div/div/section/div[1]/header/div[3]/div/div/button/span/span")).click();
		driver.findElement(By.xpath("//button[@class='-icon -orange -text-left btn']/span/span")).click();
		// click on Paypal radio button
		driver.findElement(By.xpath("//dt[@id='dt_method_paypal_express']/label")).click();
		// Click on place order
		driver.findElement(By.xpath("//div[@id='billing-buttons-container-top']/button/span/span")).click();
		//
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();

	}

}
