package mavenprac;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class Tc001 {

	@Test
	public void TC_001(){
		DOMConfigurator.configure("Log4j.xml");
		Basic b=new Basic();
		b.open();
		b.login();
		b.Logout();
		b.Close();
	}
}
