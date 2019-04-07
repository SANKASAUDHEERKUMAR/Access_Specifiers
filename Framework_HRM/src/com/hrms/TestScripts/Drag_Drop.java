package com.hrms.TestScripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.hrms.lib.Global;

public class Drag_Drop extends Global {
	public void Dragndrop() throws Exception{
		ssk.manage().window().maximize();
		ssk.navigate().to("http://jqueryui.com/droppable/");
		Thread.sleep(3000);
		assertEquals("Droppable|jQueryUI",ssk.getTitle());
		ssk.switchTo().frame(0);
		Actions action=new Actions(ssk);
		action.dragAndDrop(ssk.findElement(By.id("draggable")),ssk.findElement(By.id("droppable"))).build().perform();
		
		}
}
