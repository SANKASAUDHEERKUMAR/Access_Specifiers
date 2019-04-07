package Page_factory_fun;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Page_Factory_Utility.Openclose;

public class PageFact_logout extends Openclose{

	@FindBy(how=How.LINK_TEXT,using="Logout")
	WebElement Lout;
	public void logout(){
		Lout.click();
		
	}
}
