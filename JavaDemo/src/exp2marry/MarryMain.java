package exp2marry;

import java.util.Scanner; 

public class MarryMain {
	static int maxp = 10, nowp;
	static Person[] p = new Person[maxp];
	
	public static void main(String ars[]) {
		nowp = 0;
		System.out.println("婚配系统");
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("********************\n"
					+ "1.我是上帝，我要造人！\n"
					+ "2.我是上帝,我要看看我的孩子！\n"
					+ "3.我是月老，牵线促成姻缘！\n"
					+ "4.累了，退出");
			int i = input.nextInt();
			switch(i) {
				case 1:
					System.out.println("开始造人...");
					CreatePerson();
					break;
				case 2:
					System.out.println("开始查询...");
					ShowPerson();
					break;
				case 3:
					System.out.println("开始牵线...");
					MarryPerson();
					break;
				case 4:
					System.exit(0);
				default: 
					System.out.println("请重新输入：");
			}
		}while(true);
	}
	
	public static void CreatePerson() {
		System.out.print("请输入基本信息：姓名、年龄、性别\n");
		Scanner input = new Scanner(System.in);
		System.out.print("姓名：");
		String name = input.next();
		System.out.print("年龄：");
		int age = input.nextInt();
		System.out.print("Ta是：\n1.蓝人\n2.吕人\n");
		int sexchoose;
		do{
			sexchoose = input.nextInt();
			if (sexchoose == 1) {
				nowp++;
				p[nowp] = new Male(name, age);
				System.out.print("成功造出一个凶猛的蓝人！\n");
			}
			else if(sexchoose == 2){
				nowp++;
				p[nowp] = new Female(name, age);
				System.out.print("成功造出一个可爱的吕人！\n");
			}
			else {
				System.out.print("没有这个性别，请重新输入：");
			}
		}while(sexchoose != 1 && sexchoose != 2);
	}
	
	public static void ShowPerson() {
		System.out.print("序号\t姓名\t年龄\t性别\t配偶名\n");
		for (int i = 1; i <= nowp; i++) {
			System.out.print(i + "\t" + p[i].name + "\t" + p[i].age + "\t" 
								+ p[i].gender + "\t" + p[i].partnername + "\n");
		}
	}
	
	public static void MarryPerson() {
		//p[1].marry(p[2]);
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个人的姓名：");
		String name1 = input.next();
		for (int k = 1; k <= nowp; k++) {
			if (name1.equals(p[k].name)) {
				System.out.print("请输入另一个人的姓名：");
				String name2 = input.next();
				for (int j = 1; j<= nowp; j++) {
					if (p[j].name.equals(name2)) {
						p[k].marry(p[j]);
						return;
					}
				}
				System.out.print("找不到第二个人！\n");
				return;
			}
		}
		System.out.print("找不到第一个人！\n");
	}
	
}
