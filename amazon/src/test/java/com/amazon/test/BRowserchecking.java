package com.amazon.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BRowserchecking {
	
	 public static WebDriver driver;

	@Test
	public void Opernbrowser() throws InterruptedException {
		

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        
        Thread.sleep(3000);
        driver.quit();
	}
}

