public class StringToBasic {
    public static void main (String[] args) {
		//������������->String
        int n1 = 1;
        String s1 = n1 + "Hello";
        System.out.println(n1);
        System.out.println(s1);
		String s2 = "1.0";
		double num0 = Double.parseDouble(s2);
		System.out.println(num0);

        //String->��Ӧ�Ļ�����������
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		System.out.println(num1);
    }
}
