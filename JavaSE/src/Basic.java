
public class Basic {
	public static void main(String[] ars) {
		
	}
}

class AutoConvert {
	/*�Զ�����ת��˳��
	 * char->int->long->float->double;
	 *  byte->short->int->long->float->double
	 */
	public static void main(String[] ars) {
		int n1 = 10, n2 = 10;
		double d1 = n1 + 1.1;
		float d2 = n2 + 1.1f;
		//float d1 = n1 + 1.1;
		 //ϸ��1������������Ͳ���ת��Ϊ����С�ģ���double���Ͳ���ת��Ϊfloat
		
		//ϸ��2����������ֵ����byte��shortʱ���ж��Ƿ������������������
		byte b1 = 10;//10��byte��ʾ��Χ֮��
		//ϸ��3����byte,short����char֮�䲻���໥ת��
		int n3 = 1;
		//byte b2 = n2; //���ܽ�intת��Ϊbyte
		//char c1 = b1; //���ܽ�byteת��Ϊchar
		
		//ϸ��4��byte,short��char���߿����໥���㣬������ת��Ϊint
		short s1 = 10;
		//short s2 = s1 + b1; //��Ӻ�����Ϊint
	}
}

class ForceConvert {
	public static void main(String[] ars) {
		
	}
}
	
class BasicToString {
	public static void main(String[] ars) {
		int n1 = 100;
		String s1 = n1 + "";//��""�Ͱѻ�����������תΪ�ַ���
	}
}

class StringToBasic {
	public static void main(String[] ars) {
		String s5
	}
}
	