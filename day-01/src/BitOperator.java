public class BitOperator {
    public static void main (String[] args) {
		int a = -2<<30;         int a1 = -2<<62;            
                            //λ�����ǰ���int���ͼ����,����ֵ����С���������ͣ��ᱨ��;λ��������λ���ģ���ȡģ����62%32=30
        int b = -5<<30;          long b1 = (long)-5<<30;      
                            //<<�ȼ���*2���������������,���ݻ���ִ���;int��Χ-2147483648[-(2^31)]~2147483647[2^31-1]
                            //��Ҫ��ֵ��long����Ҫǿ��ת��
        long c = (long)-2<<62;  long c1 = (long)-2<<126;    
                            //long������64ȡģ
        int d = 12>>>1;         int d1 = 12>>1;             
                            //���������>>>��>>�ȼ�,����/2
        int e = -1>>2;          int e1 = -1/2;
                            //>>,������߷�����������������µȼ���/2��������һ��
        int f = -8>>>2;     //�Ը�������>>>�������ѭ�ڽ��䲹����С������0��     
        
        System.out.println("a="+a+",a1="+a1);
        System.out.println("b="+b+",b1="+b1);
        System.out.println("c="+c+",c1="+c1);        
        System.out.println("d="+d+",d1="+d1);
        System.out.println("e="+e+",e1="+e1);
        System.out.println(f);


    }
}
