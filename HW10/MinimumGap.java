package HW10;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumGap {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[] { 7, 5, 4, 7, 6, 7, 5 };
		
//		int minGap = array.length;
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[i] == array[j] && minGap > j - i) {
//					minGap = j - i;
// 					break;
//				}
//			}
//				
		int[] arrGap = new int[maxValue(array)+1];
		int[] index = new int[maxValue(array)+1];		
		for (int j = 0; j < arrGap.length; j++) {
			arrGap[j] = array.length;
		}	
	
		for (int i = 0; i < array.length; i++) {
			if (index[array[i]] != 0) {
				arrGap[array[i]] = Math.min(arrGap[array[i]], i - index[array[i]] + 1);
			}
			index[array[i]] = i + 1;
		}
		System.out.println(minGap(arrGap));
	}	
	public static int minGap(int[] arrGap) {
		int minGap = 10000;
		for (int a : arrGap) {
			if (a > 0 && minGap > a) {
				minGap = a;
			}
		}
		return minGap;
	}
	
	public static int maxValue(int[] array) {
		int maxValue = array[0];
		for (int a : array) {
			if (maxValue < a) {
				maxValue = a;
			}
		}
		return maxValue;
	}
}

