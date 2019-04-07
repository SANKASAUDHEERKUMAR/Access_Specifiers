package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text {

	public static void main(String[] args) throws Exception {
		WebDriver ssk=new ChromeDriver();
		ssk.get("http://book.theautomatedtester.co.uk/");
		ssk.manage().window().maximize();
		/*String Text=ssk.findElement(By.className("mainheading")).getText();
		Thread.sleep(2000);
		ssk.findElement(By.id("q")).sendKeys(Text);*/
		
		assertEquals("Not matching","omayo",ssk.findElement(By.cssSelector("h1[class='Title']")).getText());
		ssk.close();
	}

	

}
