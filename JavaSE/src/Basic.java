
public class Basic {
	public static void main(String[] ars) {
		
	}
}

class AutoConvert {
	/*自动类型转换顺序：
	 * char->int->long->float->double;
	 *  byte->short->int->long->float->double
	 */
	public static void main(String[] ars) {
		int n1 = 10, n2 = 10;
		double d1 = n1 + 1.1;
		float d2 = n2 + 1.1f;
		//float d1 = n1 + 1.1;
		 //细节1：容量大的类型不能转换为容量小的，即double类型不能转换为float
		
		//细节2：将具体数值赋给byte或short时，判断是否溢出，若不溢出则可以
		byte b1 = 10;//10在byte表示范围之内
		//细节3：（byte,short）和char之间不能相互转换
		int n3 = 1;
		//byte b2 = n2; //不能将int转换为byte
		//char c1 = b1; //不能将byte转换为char
		
		//细节4：byte,short和char三者可以相互计算，但会先转换为int
		short s1 = 10;
		//short s2 = s1 + b1; //相加后类型为int
	}
}

class ForceConvert {
	public static void main(String[] ars) {
		
	}
}
	
class BasicToString {
	public static void main(String[] ars) {
		int n1 = 100;
		String s1 = n1 + "";//加""就把基本数据类型转为字符串
	}
}

class StringToBasic {
	public static void main(String[] ars) {
		String s5
	}
}
	