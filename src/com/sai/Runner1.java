package com.sai;

import java.util.ArrayList;
import java.util.List;

public class Runner1  {

	public static void main(String[] args) {

		MyMath myMath = new MyMath();
		
		System.out.println(myMath.add(2, 3));
		
		System.out.println(myMath.subtract(5, 3));
		
		System.out.println(myMath.multiply(2, 3));
		
		List<Integer> myNUmbers = new ArrayList<Integer>();
		
		myNUmbers.add(50);
		myNUmbers.add(20);
		myNUmbers.add(40);
		myNUmbers.add(30);
		myNUmbers.add(10);
		
		List<Integer> sortedNumbers = myMath.sort(myNUmbers,1);
		
		for(Integer i : sortedNumbers){
			System.out.println(i);
		}
		
		
	}

}
