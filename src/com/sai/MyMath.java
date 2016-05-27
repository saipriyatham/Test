package com.sai;

import java.util.Collections;
import java.util.List;

public class MyMath {
	
	public int add(int a, int b){
		return a + b;
	}
	
	public int subtract(int a, int b){
		return a - b;
	}
	
	public int multiply(int a, int b){
		return a * b;
	}
	
	public List<Integer> sort(List<Integer> numbers, int type){
		if(type == 0){
			Collections.sort(numbers);
		}
		else {
			Collections.sort(numbers,Collections.reverseOrder());
		}
		
		
		return numbers;
	}

}
