import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String args[]) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		//ssk.manage().deleteAllCookies();
		ssk.get("https://www.flipkart.com");
		String pwinhandle=ssk.getWindowHandle();
        Set<String> wins=ssk.getWindowHandles();
        System.out.println(wins);
        for (String cwin : wins) {
            ssk.switchTo().window(cwin);
            if (pwinhandle.equals(cwin)) {
 
            	
            	System.out.println("Entered in windows");
            	Thread.sleep(2000);
            	ssk.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
            	
                break;
            }}
		
		ssk.findElement(By.name("q")).sendKeys("Selenium books");
		ssk.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
