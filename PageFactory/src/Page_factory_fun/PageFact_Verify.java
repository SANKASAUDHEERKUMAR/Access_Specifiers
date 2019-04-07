package Page_factory_fun;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Page_Factory_Utility.Openclose;

public class PageFact_Verify extends Openclose{

	@FindBy(how=How.XPATH,using="//ul[@id='option-menu']/li")
			static WebElement Gettext;
	public void VerifyTitle(){
		if (ssk.getTitle().contains("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");
		}
		else{
			System.out.println("Title not Matched");
		}
	}
	public static void VerifyText(){
		assertTrue(Gettext.getText().equals("Welcome admin"));
	}
}
