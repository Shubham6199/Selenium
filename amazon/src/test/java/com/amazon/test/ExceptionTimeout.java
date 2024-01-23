package com.amazon.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
@Test(invocationTimeOut=2)
public void intfiniteloopTest() {
int i=1;
while(i==1)
	System.out.println(i);
}
}