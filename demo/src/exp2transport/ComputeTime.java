package exp2transport;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ComputeTime {
	public static void main(String[] ars) throws IllegalArgumentException, InvocationTargetException, SecurityException{ 
		Scanner input = new Scanner(System.in);
		System.out.print("������ָ��(java ComputeTime [��ͨ����][����A][����B][����C])��\n");
		String arguments = input.nextLine();
		String args [] = arguments.split(" ");
		System.out.println("��ͨ����: " + args[2]); 
		System.out.println("�� �� A: " + args[3]); 
		System.out.println("�� �� B: " + args[4]); 
		System.out.println("�� �� C: " + args[5]); 
		
		if(args[3] != null && args[3].matches("^[0-9]+$") && args[4] != null && 
		   args[4].matches("^[0-9]+$") && args[5] != null && args[5].matches("^[0-9]+$") ){
			double a = Double.parseDouble(args[3]);      
			double b = Double.parseDouble(args[4]); 
			double c = Double.parseDouble(args[5]); 
			double v, t;
			Class<?> class1=args[2].getClass();
			try{
				class1 = Class.forName("exp2transport." + args[2]);
				Common d = (Common) class1.getDeclaredConstructor().newInstance();  
				v = d.Velocity(a,b,c);
				t = 1000 / v; 
				System.out.println("ƽ���ٶȣ�" + v + " km/h"); 
				System.out.println("����ʱ�䣺" + t + " h "); 
			} 
			catch (ClassNotFoundException | 
					InstantiationException | IllegalAccessException | NoSuchMethodException  e){ 
				System.out.println("class not found"); 
			}	
		}
		else{
			System.out.println("����������" + "\n");
		}  
	}
}