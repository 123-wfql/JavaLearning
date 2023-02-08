package exp1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class Shuffle {
	public static void main(String ars[]) {
		int [] a = new int [20], b = new int [20];
		for (int j = 0; j < 20; j++ )
			a[j] = j+1;
		System.out.print("the new array:");
		System.out.println(Arrays.toString(a));
		ShuffleArr sa = new ShuffleArr(a);
		b = sa.arr;
		System.out.print("the shuffled array:");
		System.out.println(Arrays.toString(b));
	}
}



class ShuffleArr {
	protected int length;
	public int [] arr;
	public ShuffleArr (int [] a) {	
		length = Array.getLength(a);
		arr = getArr(a);
	}
	
	public int [] getArr(int [] a) {		
		NorepeatRandom nrpr = new NorepeatRandom(length, 0, length-1);
		int [] b = new int [length];
		int i = 0;
		for (int k : nrpr.arr) {
			b[i] = a[k];
			i++;
		}
		return b;
	}
}



class NorepeatRandom{
	protected int num, min_num, max_num;
	public int [] arr;
	public NorepeatRandom (int n, int min_n, int max_n) {	//个数，范围下限，范围上限
		num = n;
		max_num = max_n;
		min_num = min_n;
		arr = getArr(n, min_n, max_n);
	}
	
	public int [] getArr(int n, int min_n, int max_n) {		//产生数组方法
		Random r = new Random();
		int [] arr = new int [n];
		for (int i=0; i<n; i++) {
			arr[i] = r.nextInt(max_n - min_n + 1) + min_n;
			for (int j=0; j<i; j++)		//去除重复
				if (arr[i]==arr[j]) {
					i--;
					break;
				}
		}
		return arr;
	}
}