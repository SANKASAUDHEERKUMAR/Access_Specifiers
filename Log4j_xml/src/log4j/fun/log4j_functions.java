package log4j.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class log4j_functions extends log4j_objver {

	public void openapp() {
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		ssk=new ChromeDriver();
		ssk.get("http://localhost/orangehrm-2.6/login.php");
		ssk.manage().window().maximize();
		log.info("********* Browser Opened*********");
		
	}
	public void Closeapp(){
		ssk.quit();
		log.info("********* Browser closed*********");
		
	}
	public void Login(){
		ssk.findElement(By.name(UID)).sendKeys(un);
		ssk.findElement(By.name(PWD)).sendKeys(pw);
		ssk.findElement(By.name(submit)).click();
		log.info("********* Login Successfully*********");
	}
	public void Logout(){
		ssk.findElement(By.linkText(logout)).click();
		log.info("********* Logout Successfully*********");
	}
	public void time() throws Exception{
		Thread.sleep(3000);
		log.info("********* Wait Some Time*********");
	}
	public void mousemover(){
		WebElement we=ssk.findElement(By.xpath(admin));
		Actions ac=new Actions(ssk);
		ac.moveToElement(we).perform();
		WebElement we1= ssk.findElement(By.xpath(importexport));
		ac.moveToElement(we1).perform();
		ssk.findElement(By.xpath(Export)).click();
		log.info("********* mouse over completed*********");
	}
	public void Entryframe(){
		ssk.switchTo().frame("rightMenu");
		log.info("********* Frame Entered*********");
	}
	public void Exitframe(){
		ssk.switchTo().defaultContent();
		log.info("********* Frame Exited*********");
	}
	public void Exporthrdata() throws Exception{
		Select EXHRD=new Select(ssk.findElement(By.xpath("//select[@id='cmbExportType']")));
		EXHRD.selectByIndex(1);
		time();
		ssk.findElement(By.id("btnExport"));
		System.out.println("button clicked");
		log.info("********* Export HR data*********");
	}
}
