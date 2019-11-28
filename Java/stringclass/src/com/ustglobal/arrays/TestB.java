package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40};
		receive(nums);
		int[] values = getArray();
		
	}
	static void receive(int[] numbers) {
		for(int num: numbers) {
			System.out.println(num);
		}
	}
	static int[] getArray() {
		int[] values = {20,30,40,50};
		return values;
	}
}
