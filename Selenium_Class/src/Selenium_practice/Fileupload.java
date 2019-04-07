package Selenium_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver ssk=new ChromeDriver();
		ssk.navigate().to("http://omayo.blogspot.com/");
		WebElement upload=ssk.findElement(By.xpath("//input[@id='uploadfile']"));
		upload.sendKeys("C:/Users/Public/Pictures/Sample Pictures/Penguins.jpg");
		System.out.println("File Uploaded Sucessfully");
	}
}
