package exp3banksave;

public class Bank {
	private static int sum = 0;

    public synchronized static void save(String name, int money) { //��Ҫ��synchronized�ؼ����趨�÷���Ϊ�߳�ͬ���ģ���Ȼ�˻��ܶ�����
        try {
            Thread.sleep((int) (Math.random() * 2000)); //����Thread���е�sleep��������ʹ��ǰ����ִ�е��߳̽�������״̬
        } catch (InterruptedException e) { }
        sum += money;
        System.out.print(name + "����" + money + "Ԫ\t"); 
        System.out.println("�˻��ܶ" + sum + "Ԫ\n"); 
    } 
}
