public class LogicOperate {
    public static void main (String[] args) {
		//逻辑或|和短路或||的区别
        int a = 4;
        int b = 9;
        if(a > 1 | ++b > 4){//换成||试试！
            System.out.println("a="+a+",b="+b);
        }
    }
    //逻辑与&和短路与&&同理
}
