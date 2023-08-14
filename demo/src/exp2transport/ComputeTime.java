package exp2transport;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ComputeTime {
	public static void main(String[] ars) throws IllegalArgumentException, InvocationTargetException, SecurityException{ 
		Scanner input = new Scanner(System.in);
		System.out.print("请输入指令(java ComputeTime [交通工具][参数A][参数B][参数C])：\n");
		String arguments = input.nextLine();
		String args [] = arguments.split(" ");
		System.out.println("交通工具: " + args[2]); 
		System.out.println("参 数 A: " + args[3]); 
		System.out.println("参 数 B: " + args[4]); 
		System.out.println("参 数 C: " + args[5]); 
		
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
				System.out.println("平均速度：" + v + " km/h"); 
				System.out.println("运行时间：" + t + " h "); 
			} 
			catch (ClassNotFoundException | 
					InstantiationException | IllegalAccessException | NoSuchMethodException  e){ 
				System.out.println("class not found"); 
			}	
		}
		else{
			System.out.println("不是整数！" + "\n");
		}  
	}
}