package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		System.out.println("~~~~~~~~~~~~~~~");
		
		for(int i : nums) {
			System.out.println(i);
		}
		
		System.out.println("~~~~~~~~~~~~~~~");
		
		boolean b[] = {true,false,true,false,false,true,false};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("~~~~~~~~~~~~~~~~");
		for(boolean b2: b) {
			System.out.println(b2);
		}
		
	}
}
