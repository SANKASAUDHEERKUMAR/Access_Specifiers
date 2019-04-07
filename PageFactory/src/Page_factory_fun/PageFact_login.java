package Page_factory_fun;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFact_login {

	WebDriver ssk;
	@FindBy(how=How.NAME,using="txtUserName")
	@CacheLookup
	WebElement txt_UserName;
	@FindBy(how=How.ID,using="txtPassword")
	WebElement txt_Password;
	@FindBy(how=How.NAME,using="Submit")
	WebElement submit;
	public void login(WebDriver ssk){
		this.ssk=ssk;
		txt_UserName.sendKeys("admin");
		txt_Password.sendKeys("admin");
		submit.click();
	}
	
}
