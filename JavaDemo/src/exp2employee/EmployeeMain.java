package exp2employee;

import java.util.Scanner;

public class EmployeeMain {
	static int maxe = 10, nowe;
	static Employee[] e = new Employee[maxe];
	static Config c = new Config();
	public static void main(String ars[]) {
			nowe = 0;
			System.out.println("Ա�����ʲ�ѯϵͳ");
			Scanner input = new Scanner(System.in);
			do {
				System.out.println("********************\n"
						+ "1.���Ա����Ϣ\n"
						+ "2.��ѯԱ����Ϣ\n"
						+ "3.���ʲ�������\n"
						+ "4.�˳�ϵͳ");
				int i = input.nextInt();
				switch(i) {
					case 1:
						System.out.println("��ʼ���...");
						CreateEmployee();
						break;
					case 2:
						System.out.println("��ʼ��ѯ...");
						ShowEmployee();
						break;
					case 3:
						System.out.println("��������...");
						Setting();
						break;
					case 4:
						System.exit(0);
					default: 
						System.out.println("���������룺");
				}
			}while(true);
	}
		
	public static void CreateEmployee() {
		System.out.print("�����������Ϣ���������������¡�����ʱ�������۶�Կո������\n");
		Scanner input = new Scanner(System.in);
		String info = input.nextLine();
		String args [] = info.split(" ");
		String name = args[0];
		int year = Integer.parseInt(args[1]);
		int month = Integer.parseInt(args[2]);
		double workhour = Integer.parseInt(args[3]);
		double sales = Integer.parseInt(args[4]);
		System.out.print("Ա�����ͣ�\n"
						+ "1.�̶�н��Ա��(S)\n"
						+ "2.��ʱ��нԱ��(H)\n"
						+ "3.��ɼ�нԱ��(C)\n"
						+ "4.����н��ɼ�нԱ��(BPC)\n");
		int choose;
		do{
			choose = input.nextInt();
			if (choose == 1) {
				nowe++;
				e[nowe] = new SalariedEmployee(name, year, month, workhour, sales);
				System.out.print("��ӳɹ���\n");
			}
			else if(choose == 2){
				nowe++;
				e[nowe] = new HourlyEmployee(name, year, month, workhour, sales);
				System.out.print("��ӳɹ���\n");
			}
			else if(choose == 3){
				nowe++;
				e[nowe] = new CommissionEmployee(name, year, month, workhour, sales);
				System.out.print("��ӳɹ���\n");
			}
			else if(choose == 4){
				nowe++;
				e[nowe] = new BasePlusCommissionEmployee(name, year, month, workhour, sales);
				System.out.print("��ӳɹ���\n");
			}
			else {
				System.out.print("���ʹ������������룺");
			}
		}while(choose != 1 && choose != 2 && choose != 3 && choose != 4);
	}
	
	public static void ShowEmployee() {
		System.out.print("���\t����\t��������\t����\t��ʱ\t���۶�\t����\n");
		for (int i = 1; i <= nowe; i++) {
			System.out.print(i + "\t" + e[i].name + "\t" + e[i].birth_year + "." 
								+ e[i].birth_month + "\t" + e[i].kind + "\t" 
								+ e[i].workhour + "\t" + e[i].sales + "\t" 
								+ e[i].getSalary(Config.nowmonth) + "\n");
		}
	}
	
	public static void Setting() {
		Scanner input = new Scanner(System.in);
		System.out.print("1.�޸ĵ�ǰ��(��ǰֵ��" + Config.nowmonth
						+ ")\n2.�޸����Ҫ��ʱ(��ǰֵ��" + Config.basehour
						+ ")\n3.�޸Ļ�������(��ǰֵ��" + Config.salary_s
						+ ")\n4.�޸ļӰ౶��(��ǰֵ��" + Config.plus
						+ ")\n5.�޸Ĳ�����н������ɱ���(��ǰֵ��" + Config.salarypersales_c
						+ ")\n6.�޸Ĵ���нԱ����н(��ǰֵ��" + Config.salary_bpc
						+ ")\n7.�޸Ĵ���н������ɱ���(��ǰֵ��" + Config.salarypersales_bpc + ")\n");
		int choose; 
		do{
			choose = input.nextInt();
			if (choose == 1) {
				System.out.print("�����뵱ǰ�£�");
				int nm = input.nextInt();
				Config.nowmonth = nm;
				System.out.print("�޸ĳɹ���\n");
			}
			else if(choose == 2){
				System.out.print("������Ա�����Ҫ����ʱ����");
				double bh = input.nextDouble();
				Config.basehour = bh;
				System.out.print("�޸ĳɹ���\n");
			}
			else if(choose == 3){
				System.out.print("������Ա���������ʣ�");
				double s_s = input.nextDouble();
				Config.salary_s = s_s;
				System.out.print("�޸ĳɹ���\n");
			}
			else if(choose == 4){
				System.out.print("������Ա���Ӱ౶�ʣ�");
				double p = input.nextDouble();
				Config.plus = p;
				System.out.print("�޸ĳɹ���\n");
			}
			else if(choose == 5){
				System.out.print("�����벻����н������ɱ�����");
				double sps_c = input.nextDouble();
				Config.salarypersales_c = sps_c;
				System.out.print("�޸ĳɹ���\n");
			}
			else if(choose == 6){
				System.out.print("���������нԱ����н��");
				double s_bpc = input.nextDouble();
				Config.salary_bpc = s_bpc;
				System.out.print("�޸ĳɹ���\n");
			}
			else if(choose == 7){
				System.out.print("���������нԱ����ɱ�����");
				double sps_bpc = input.nextDouble();
				Config.salarypersales_bpc = sps_bpc;
				System.out.print("�޸ĳɹ���\n");
			}
			else {
				System.out.print("���ʹ������������룺");
			}
		}while(choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5 && choose != 6 && choose != 7);
		
		
	}
}
