package exp2marry;

import java.util.Scanner; 

public class MarryMain {
	static int maxp = 10, nowp;
	static Person[] p = new Person[maxp];
	
	public static void main(String ars[]) {
		nowp = 0;
		System.out.println("����ϵͳ");
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("********************\n"
					+ "1.�����ϵۣ���Ҫ���ˣ�\n"
					+ "2.�����ϵ�,��Ҫ�����ҵĺ��ӣ�\n"
					+ "3.�������ϣ�ǣ�ߴٳ���Ե��\n"
					+ "4.���ˣ��˳�");
			int i = input.nextInt();
			switch(i) {
				case 1:
					System.out.println("��ʼ����...");
					CreatePerson();
					break;
				case 2:
					System.out.println("��ʼ��ѯ...");
					ShowPerson();
					break;
				case 3:
					System.out.println("��ʼǣ��...");
					MarryPerson();
					break;
				case 4:
					System.exit(0);
				default: 
					System.out.println("���������룺");
			}
		}while(true);
	}
	
	public static void CreatePerson() {
		System.out.print("�����������Ϣ�����������䡢�Ա�\n");
		Scanner input = new Scanner(System.in);
		System.out.print("������");
		String name = input.next();
		System.out.print("���䣺");
		int age = input.nextInt();
		System.out.print("Ta�ǣ�\n1.����\n2.����\n");
		int sexchoose;
		do{
			sexchoose = input.nextInt();
			if (sexchoose == 1) {
				nowp++;
				p[nowp] = new Male(name, age);
				System.out.print("�ɹ����һ�����͵����ˣ�\n");
			}
			else if(sexchoose == 2){
				nowp++;
				p[nowp] = new Female(name, age);
				System.out.print("�ɹ����һ���ɰ������ˣ�\n");
			}
			else {
				System.out.print("û������Ա����������룺");
			}
		}while(sexchoose != 1 && sexchoose != 2);
	}
	
	public static void ShowPerson() {
		System.out.print("���\t����\t����\t�Ա�\t��ż��\n");
		for (int i = 1; i <= nowp; i++) {
			System.out.print(i + "\t" + p[i].name + "\t" + p[i].age + "\t" 
								+ p[i].gender + "\t" + p[i].partnername + "\n");
		}
	}
	
	public static void MarryPerson() {
		//p[1].marry(p[2]);
		Scanner input = new Scanner(System.in);
		System.out.print("������һ���˵�������");
		String name1 = input.next();
		for (int k = 1; k <= nowp; k++) {
			if (name1.equals(p[k].name)) {
				System.out.print("��������һ���˵�������");
				String name2 = input.next();
				for (int j = 1; j<= nowp; j++) {
					if (p[j].name.equals(name2)) {
						p[k].marry(p[j]);
						return;
					}
				}
				System.out.print("�Ҳ����ڶ����ˣ�\n");
				return;
			}
		}
		System.out.print("�Ҳ�����һ���ˣ�\n");
	}
	
}
