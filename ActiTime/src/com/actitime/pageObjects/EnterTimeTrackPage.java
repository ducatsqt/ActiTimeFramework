package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

//import com.actitime.scripts.BasePage;

public class EnterTimeTrackPage extends BasePage {

	
	WebDriver driver; //c
	
	public EnterTimeTrackPage(WebDriver driver) { //b
		
		//super keyword in java is a reference variable that is used to refer parent class objects.
		// To access the data members of parent class when both parent and 
		//child class have member with same name
		//To explicitly call the no-arg and parameterized constructor of parent class
		//To access the method of parent class when child class has overridden that method.
		super(driver);
		this.driver = driver;
	}
   public void verifytable()
   
   {
	   String expTitle = "actiTIME - Enter Time-Track";
	 String actTitle = driver.getTitle();
	 Assert.assertEquals(actTitle, expTitle);
	 Reporter.log("Logo is displayed", true);
			   
   }
}
