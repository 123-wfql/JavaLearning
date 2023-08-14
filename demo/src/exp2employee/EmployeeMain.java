package exp2employee;

import java.util.Scanner;

public class EmployeeMain {
	static int maxe = 10, nowe;
	static Employee[] e = new Employee[maxe];
	static Config c = new Config();
	public static void main(String ars[]) {
			nowe = 0;
			System.out.println("员工工资查询系统");
			Scanner input = new Scanner(System.in);
			do {
				System.out.println("********************\n"
						+ "1.添加员工信息\n"
						+ "2.查询员工信息\n"
						+ "3.工资参数设置\n"
						+ "4.退出系统");
				int i = input.nextInt();
				switch(i) {
					case 1:
						System.out.println("开始添加...");
						CreateEmployee();
						break;
					case 2:
						System.out.println("开始查询...");
						ShowEmployee();
						break;
					case 3:
						System.out.println("进入设置...");
						Setting();
						break;
					case 4:
						System.exit(0);
					default: 
						System.out.println("请重新输入：");
				}
			}while(true);
	}
		
	public static void CreateEmployee() {
		System.out.print("请输入基本信息：姓名、出生年月、工作时长和销售额（以空格隔开）\n");
		Scanner input = new Scanner(System.in);
		String info = input.nextLine();
		String args [] = info.split(" ");
		String name = args[0];
		int year = Integer.parseInt(args[1]);
		int month = Integer.parseInt(args[2]);
		double workhour = Integer.parseInt(args[3]);
		double sales = Integer.parseInt(args[4]);
		System.out.print("员工类型：\n"
						+ "1.固定薪资员工(S)\n"
						+ "2.工时计薪员工(H)\n"
						+ "3.提成计薪员工(C)\n"
						+ "4.带底薪提成计薪员工(BPC)\n");
		int choose;
		do{
			choose = input.nextInt();
			if (choose == 1) {
				nowe++;
				e[nowe] = new SalariedEmployee(name, year, month, workhour, sales);
				System.out.print("添加成功！\n");
			}
			else if(choose == 2){
				nowe++;
				e[nowe] = new HourlyEmployee(name, year, month, workhour, sales);
				System.out.print("添加成功！\n");
			}
			else if(choose == 3){
				nowe++;
				e[nowe] = new CommissionEmployee(name, year, month, workhour, sales);
				System.out.print("添加成功！\n");
			}
			else if(choose == 4){
				nowe++;
				e[nowe] = new BasePlusCommissionEmployee(name, year, month, workhour, sales);
				System.out.print("添加成功！\n");
			}
			else {
				System.out.print("类型错误，请重新输入：");
			}
		}while(choose != 1 && choose != 2 && choose != 3 && choose != 4);
	}
	
	public static void ShowEmployee() {
		System.out.print("序号\t姓名\t出生年月\t类型\t工时\t销售额\t工资\n");
		for (int i = 1; i <= nowe; i++) {
			System.out.print(i + "\t" + e[i].name + "\t" + e[i].birth_year + "." 
								+ e[i].birth_month + "\t" + e[i].kind + "\t" 
								+ e[i].workhour + "\t" + e[i].sales + "\t" 
								+ e[i].getSalary(Config.nowmonth) + "\n");
		}
	}
	
	public static void Setting() {
		Scanner input = new Scanner(System.in);
		System.out.print("1.修改当前月(当前值：" + Config.nowmonth
						+ ")\n2.修改最低要求工时(当前值：" + Config.basehour
						+ ")\n3.修改基础工资(当前值：" + Config.salary_s
						+ ")\n4.修改加班倍率(当前值：" + Config.plus
						+ ")\n5.修改不带底薪销量提成比例(当前值：" + Config.salarypersales_c
						+ ")\n6.修改带底薪员工底薪(当前值：" + Config.salary_bpc
						+ ")\n7.修改带底薪销量提成比例(当前值：" + Config.salarypersales_bpc + ")\n");
		int choose; 
		do{
			choose = input.nextInt();
			if (choose == 1) {
				System.out.print("请输入当前月：");
				int nm = input.nextInt();
				Config.nowmonth = nm;
				System.out.print("修改成功！\n");
			}
			else if(choose == 2){
				System.out.print("请输入员工最低要求工作时长：");
				double bh = input.nextDouble();
				Config.basehour = bh;
				System.out.print("修改成功！\n");
			}
			else if(choose == 3){
				System.out.print("请输入员工基础工资：");
				double s_s = input.nextDouble();
				Config.salary_s = s_s;
				System.out.print("修改成功！\n");
			}
			else if(choose == 4){
				System.out.print("请输入员工加班倍率：");
				double p = input.nextDouble();
				Config.plus = p;
				System.out.print("修改成功！\n");
			}
			else if(choose == 5){
				System.out.print("请输入不带底薪销量提成比例：");
				double sps_c = input.nextDouble();
				Config.salarypersales_c = sps_c;
				System.out.print("修改成功！\n");
			}
			else if(choose == 6){
				System.out.print("请输入带底薪员工底薪：");
				double s_bpc = input.nextDouble();
				Config.salary_bpc = s_bpc;
				System.out.print("修改成功！\n");
			}
			else if(choose == 7){
				System.out.print("请输入带底薪员工提成比例：");
				double sps_bpc = input.nextDouble();
				Config.salarypersales_bpc = sps_bpc;
				System.out.print("修改成功！\n");
			}
			else {
				System.out.print("类型错误，请重新输入：");
			}
		}while(choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5 && choose != 6 && choose != 7);
		
		
	}
}
