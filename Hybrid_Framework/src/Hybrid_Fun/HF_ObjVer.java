package Hybrid_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HF_ObjVer {

	public WebDriver ssk;
	public String UID="txtUserName";
	public By PWD=By.name("txtPassword");
	//public String PWD="txtPassword";
	public String submit="Submit";
	public String logout="Logout";
	public String un="admin";
	public String pw="admin";
	public String admin="//li[@id='admin']/a/span";
	public String importexport="//li[@id='admin']/ul/li[10]/a/span";
	public String Export="//li[@id='admin']/ul/li[10]/ul/li[2]/a/span";
	public String Exporttype="//select[@id='cmbExportType']";
	By txt_EmployeeId=By.name("txtEmployeeId");
}
