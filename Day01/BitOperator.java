public class BitOperator {
    public static void main (String[] args) {
		int a = -2<<30;//λ�����ǰ���int���ͼ����,����ֵ����С���������ͣ��ᱨ��
        long b = -2<<31; //�����0����ΪĬ��int���ͣ��������������
        long c = (long)-2<<31;//��Ҫ��ֵ��long����Ҫǿ��ת��
        long d = (long)-2<<62;
        long e = (long)-2<<63;
        int f = 8>>>3;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
