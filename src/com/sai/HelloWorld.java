package com.sai;

public class HelloWorld {
	
	int noOfTimes = 10;
	
	Util util = new Util();
	
	public void process(){
		for (int i = 0; i < noOfTimes; i++) {
			util.task(i);
		}
	}
}
