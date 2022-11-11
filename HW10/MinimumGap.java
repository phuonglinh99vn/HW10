package HW10;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumGap {
	public static void main(String[] args) {
		int[] array = new int[] { 7, 5, 4, 7, 7, 5 };
		
// ON^2
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[i] == array[j] && minGap > j - i) {
//					minGap = j - i;
					break;
//				}
//			}
//0(N)				
		
		int[] arrGap = new int[10000];
		int[] index = new int[10000];		
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
		for (int i : arrGap) {
			if (i > 0 && minGap > i) {
				minGap = i;
			}
		}
		return minGap;
	}
	
}

