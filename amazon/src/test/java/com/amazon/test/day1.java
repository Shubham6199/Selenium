package com.amazon.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void Demo()
	{
		System.out.println("hello");
	}

	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}
	@AfterSuite
	 public void  BFsuite() {
	 System.out.println(" am last in the world before method-> specfic to clss file and it excute  before  each and every method and before test-> its depend on the testng xml file based upon the test scoop");
	 
	}

}
