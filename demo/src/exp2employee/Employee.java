package exp2employee;

import java.util.Calendar;

class Config {
	static Calendar calendar = Calendar.getInstance();
	public static double salary_s = 4500, basehour = 160, plus = 1.25, 	//基础工资，最低工时，加班加倍
	salarypersales_c = 0.055, salary_bpc = 1500, salarypersales_bpc = 0.045;//提成比例，提成底薪，带底薪提成比例，当前月份
	public static int nowmonth = calendar.get(Calendar.MONTH) + 1;
}

public class Employee {
	public int birth_year, birth_month;
	double salary, workhour, sales, base_salary;
	public String name, kind;
	public Employee (String na, int by, int bm, double wh, double s) {
		name = na;
		birth_year = by;
		birth_month = bm;
		workhour = wh;
		sales = s;
		kind = "unallocated";
		salary = getSalary(Config.nowmonth);
		
	}
	public double getBaseSalary(double wh, double s) {
		return Config.salary_s;
	}
	
	public double getSalary(int month) {
		if (month == birth_month)
			return getBaseSalary(this.workhour, this.sales) + 100;
		else
			return getBaseSalary(this.workhour, this.sales);
			
	}
}


class SalariedEmployee extends Employee{

	public SalariedEmployee(String na, int by, int bm, double wh, double s) {
		super(na, by, bm, wh, s);
		kind = "S";
	}
}


class HourlyEmployee extends Employee{
	public HourlyEmployee(String na, int by, int bm, double wh, double s) {
		super(na, by, bm, wh, s);
		kind = "H";
	}
	public double getBaseSalary(double wh, double s) {
		if(wh <= Config.basehour)
			return Config.salary_s - (Config.basehour - wh)*Config.salary_s/Config.basehour;
		else
			return Config.salary_s - (Config.basehour - wh)*Config.salary_s/Config.basehour*Config.plus;
	}
}

class CommissionEmployee extends Employee{
	public CommissionEmployee(String na, int by, int bm, double wh, double s) {
		super(na, by, bm, wh, s);
		kind = "C";
	}
	public double getBaseSalary(double wh, double s) {
		return Config.salarypersales_c * s;
	}
}

class BasePlusCommissionEmployee extends CommissionEmployee{
	public BasePlusCommissionEmployee(String na, int by, int bm, double wh, double s) {
		super(na, by, bm, wh, s);
		kind = "BPC";
	}
	public double getBaseSalary(double wh, double s) {
		return Config.salarypersales_bpc * s + Config.salary_bpc;
	}

}

