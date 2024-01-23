package com.amazon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Google {
	
	@FindBy(name = "q")
	WebElement googleSearchTextField;
	
	public boolean inputIsDisplyaed() {
		boolean isDisplayed = googleSearchTextField.isDisplayed();
		return isDisplayed;
	}

}
