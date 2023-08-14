public class BitOperator {
    public static void main (String[] args) {
		int a = -2<<30;         int a1 = -2<<62;            
                            //位运算是按照int类型计算的,若赋值给更小容量的类型，会报错;位操作大于位数的，会取模，即62%32=30
        int b = -5<<30;          long b1 = (long)-5<<30;      
                            //<<等价于*2，左移运算溢出了,数据会出现错误;int范围-2147483648[-(2^31)]~2147483647[2^31-1]
                            //若要赋值给long，需要强制转换
        long c = (long)-2<<62;  long c1 = (long)-2<<126;    
                            //long则是以64取模
        int d = 12>>>1;         int d1 = 12>>1;             
                            //正数情况下>>>与>>等价,都是/2
        int e = -1>>2;          int e1 = -1/2;
                            //>>,“低溢高符”，在正整数情况下等价于/2，负数不一定
        int f = -8>>>2;     //对负数进行>>>，结果遵循于将其补码进行“低溢高0”     
        
        System.out.println("a="+a+",a1="+a1);
        System.out.println("b="+b+",b1="+b1);
        System.out.println("c="+c+",c1="+c1);        
        System.out.println("d="+d+",d1="+d1);
        System.out.println("e="+e+",e1="+e1);
        System.out.println(f);


    }
}
