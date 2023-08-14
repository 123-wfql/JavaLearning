package exp1;

import java.util.Random;

public class SumArray {
	public static void main(String ars[]) {
		Random r = new Random();
		int [][] arr = new int [5][5];
		for (int i=0; i<5; i++) 
			for (int j=0; j<5; j++)
				arr[i][j] = r.nextInt(100);
		
		System.out.print("the new array:\n");
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++)
				System.out.print(arr[i][j]+"\t");
			System.out.print("\n");
		}
		
		int sum = 0;
		for (int i=0; i<5; i++) 
			for (int j=0; j<5; j++)
				if (i==0||i==4||j==0||j==4)
					sum += arr[i][j];
		System.out.println("\nthe sum of Matrix around:" + sum);
		
		int max = arr[0][0];
		int index = 0;
		for (int i=1; i<5; i++)
			if(arr[i][i]>max) {
				max = arr[i][i];
				index = i+1;
			}
		System.out.print("\nthe max in diagonal:" + max);
		System.out.print("\nthe index of the max:" + index + ' ' + index);
	}

}
