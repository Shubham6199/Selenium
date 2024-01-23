package com.amazon.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebloginHomeLoan()
	{	System.out.println("WebloginHomeLoan");
	}

	
	@Test
	public void MobileloginHomeLoan()
	{System.out.println("MobileloginHomeLoan");
}

@Test
public void ApiloginHomeLoan()
{System.out.println("ApiloginHomeLoan");

}


@BeforeSuite
 public void  BFsuite() {
 System.out.println(" am first in the world");
}
@Test
public void ApiloginHomeLoanaa()
{System.out.println("ApiloginHomeLoan");
}
}