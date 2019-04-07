package Hybrid_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import Hybrid_FW_Utility.log;


public class HF_Functions extends HF_ObjVer{

	public void openapp() {
		Reporter.log("Open Browser");
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		ssk=new ChromeDriver();
		ssk.get("http://localhost/orangehrm-2.6/login.php");
		ssk.manage().window().maximize();
		log.info("******Browser Opened******");
		
	}
	public void Closeapp(){
		Reporter.log("Close Browser");
		ssk.quit();
		log.info("******Browser Closed******");
		
	}
	public void Login(){
		Reporter.log("Login Application");
		ssk.findElement(By.name(UID)).sendKeys(un);
		ssk.findElement(PWD).sendKeys(pw);
		ssk.findElement(By.name(submit)).click();
		log.info("******Login Successfully******");
	}
	public void Logout(){
		Reporter.log("Logout Application");
		ssk.findElement(By.linkText(logout)).click();
		log.info("******Logout Successfully******");
	}
	public void time() throws Exception{
		Reporter.log("Wait Some Time");
		Thread.sleep(3000);
		log.info("******Waited Some Time******");
	}
	public void mousemover(){
		Reporter.log("Select Menu");
		WebElement we=ssk.findElement(By.xpath(admin));
		Actions ac=new Actions(ssk);
		ac.moveToElement(we).perform();
		WebElement we1= ssk.findElement(By.xpath(importexport));
		ac.moveToElement(we1).perform();
		ssk.findElement(By.xpath(Export)).click();
		log.info("******Menu Selected******");
	}
	public void Entryframe(){
		Reporter.log("Enter Frame");
		ssk.switchTo().frame("rightMenu");
		log.info("******Entered Frame******");
	}
	public void Exitframe(){
		Reporter.log("Close Frame");
		ssk.switchTo().defaultContent();
		log.info("******Exited Frame******");
	}
	public void Exporthrdata() throws Exception{
		Reporter.log("Download Exortdata");
		Select EXHRD=new Select(ssk.findElement(By.xpath(Exporttype)));
		EXHRD.selectByIndex(1);
		time();
		ssk.findElement(By.id("btnExport"));
		System.out.println("button clicked");
		log.info("******Downloaded Exportdata******");
	}
	public void AddEmpselect(){
		WebElement We=ssk.findElement(By.xpath("//li[@id='pim']/a/span"));
		Actions ac=new Actions(ssk);
		ac.moveToElement(We).perform();
		ssk.findElement(By.xpath("//li[@id='pim']/ul/li[2]/a/span")).click();
	}
	public void AddEmployee() throws Exception{
		System.out.println(ssk.findElement(txt_EmployeeId).getAttribute("value"));
		ssk.findElement(By.name("txtEmpLastName")).sendKeys("Uday");
		ssk.findElement(By.name("txtEmpFirstName")).sendKeys("Kumar");
		ssk.findElement(By.name("txtEmpMiddleName")).sendKeys("reddy");
		ssk.findElement(By.name("txtEmpNickName")).sendKeys("Udaybhanu");
		HF_Functions hf=new HF_Functions();
		hf.uploadimage();
		ssk.findElement(By.id("btnEdit")).click();
	}
	public void uploadimage() throws Exception{
		WebElement WE=ssk.findElement(By.xpath("//input[@type='file']"));
		WE.sendKeys("C:/Users/Public/Pictures/Sample Pictures/Penguins.jpg");
		Thread.sleep(3000);
	}
}















