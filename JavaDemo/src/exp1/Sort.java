package exp1;

import java.util.Arrays;
import java.util.Random;

public class Sort {
	public static void main(String ars[]) {
		Random r = new Random();
		int [] arr = new int [20];
		for (int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(20)+1;
			for (int j=0; j<i; j++)
				if (arr[i]==arr[j]) {
					i--;
					break;
				}
		}
		System.out.print("the new array:");
		for (int j : arr)
			System.out.print(j + " ");
		Arrays.sort(arr);
		System.out.print("\nthe sorted array:");
		for (int k : arr){
			System.out.print(k + " ");
		}
	}
}
