package exp2transport;

public class Car007 implements Common{
	public double Velocity(double a, double b, double c){
		if(c == 0) {
			System.out.println("³ıÊıÎª0");
			return 0;
		}
		else
			return a * b / c;
	}
}
