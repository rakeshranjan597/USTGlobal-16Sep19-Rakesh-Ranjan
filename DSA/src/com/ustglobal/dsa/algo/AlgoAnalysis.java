package com.ustglobal.dsa.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
	public static void main(String[] args) {
		countingDuration2();
		countingDuration1();
//		System.out.println(addUpto(number));
//		System.out.println(addUptoQuick(number));
	}
	
	public static long addUpto(Long number) {
		long total = 0L;
		for(long i = 0; i <= number; i++) {
			total = total + i;
		}
		return total;
	}
	
	public static long addUptoQuick(Long number) {
		return number * (number + 1)/2;
	}
	
	public static void countingDuration1() {
		long number = 9999999L;
		Instant start = Instant.now();
		System.out.println("addUoto:" + addUpto(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUpto time: "+ seconds + "seconds");
	}
	
	public static void countingDuration2() {
		long number = 9999999L;
		Instant start = Instant.now();
		System.out.println("addUotoQuick:" + addUptoQuick(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUptoQuick time: "+ seconds + "seconds");
	}
}
