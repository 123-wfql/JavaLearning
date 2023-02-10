public class BitOperator {
    public static void main (String[] args) {
		int a = -2<<30;//位运算是按照int类型计算的,若赋值给更小容量的类型，会报错
        long b = -2<<31; //结果是0，因为默认int类型，左移运算溢出了
        long c = (long)-2<<31;//若要赋值给long，需要强制转换
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
