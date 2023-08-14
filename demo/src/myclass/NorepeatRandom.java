package myclass;

import java.util.Random;

public class NorepeatRandom{
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
			arr[i] = r.nextInt(max_n) + min_n;
			for (int j=0; j<i; j++)		//去除重复
				if (arr[i]==arr[j]) {
					i--;
					break;
				}
		}
		return arr;
	}
}

