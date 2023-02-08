package exp3banksave;

public class Bank {
	private static int sum = 0;

    public synchronized static void save(String name, int money) { //需要用synchronized关键字设定该方法为线程同步的，不然账户总额会混乱
        try {
            Thread.sleep((int) (Math.random() * 2000)); //调用Thread类中的sleep（）方法使当前正在执行的线程进入休眠状态
        } catch (InterruptedException e) { }
        sum += money;
        System.out.print(name + "存了" + money + "元\t"); 
        System.out.println("账户总额：" + sum + "元\n"); 
    } 
}
