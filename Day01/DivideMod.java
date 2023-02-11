public class DivideMod {
    public static void main (String[] args) {
        int a1 = 1/2; int a2 = 1/-2; int a3 = -1/2; int a4 = -1/-2;
                    //整数除法运算若出现符号，则符号与符号运算，其余用绝对值进行除法运算
        int b1 = 10/3; double b2 = 10.0/3.0; double b3 = 10.0/3; double b4 = 10.00/-3;
                    //操作数若都是整型，则进行int的计算;若有小数，默认double运算，除非浮点数后有f或F
        int c1 = 1000131235*135431; long c2 = 1000131235*135431; long c3 = (long)1000131235*135431; long c4 = (long)1000131235*(long)135431; 
                    //*运算，结果过大会溢出，需要转long
        int d1 = 3%2; int d2 = 3%-2; int d3 = -3%2; int d4 = -3%-2;
                    //整数求模运算若出现符号，则先用绝对值运算，符号取决于被模数
        double e1 = -100%-31.5; double e2 = -100-(int)(-100/-31.5)*-31.5; double e3 = -3.5%2; double e4 = -3.5%-2;
                    //浮点数求模 a%b=a-(int)(a/b)*b，符号同样取决于被模数
        System.out.println("a1="+a1+",a2="+a2+",a3="+a3+",a4="+a4);
        System.out.println("b1="+b1+",b2="+b2+",b3="+b3+",b4="+b4);        
        System.out.println("c1="+c1+",c2="+c2+",c3="+c3+",c4="+c4);
        System.out.println("d1="+d1+",d2="+d2+",d3="+d3+",d4="+d4);
        System.out.println("e1="+e1+",e2="+e2+",e3="+e3+",d4="+e4);
        
    }
}
