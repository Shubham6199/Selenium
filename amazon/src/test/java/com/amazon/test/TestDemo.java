package com.amazon.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

	@Test
	public void myTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.shopify.com/lookup?rid=4b549eca-4901-4365-9725-56aa3e238fd3");
		//WebElement googleSearchTextField = driver.findElement(By.name("q"));
		//boolean isDisplayed = googleSearchTextField.isDisplayed();
		//Assert.assertTrue(!isDisplayed, "input is not displayed....");
		WebElement product = driver.findElement(By.id("email_type_ahead"));
		//WebElement emailInput = null;
		driver.findelementemailInput.sendKeys("shubhamrai@cedcommerce.com");
		
	}

}
