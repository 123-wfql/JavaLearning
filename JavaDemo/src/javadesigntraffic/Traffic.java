package javadesigntraffic;

import java.util.concurrent.TimeUnit;

public class Traffic {
	public static int moment = 0;
	public static int wait = 15;
	public static int demotime = 18000;
	static Line[] l = new Line[8];
	
	public static void main(String[] args) throws InterruptedException {
		l[0] = new Line("S2N", 0);
		l[1] = new Line("S2W", 1);
		l[2] = new Line("E2W", 2);
		l[3] = new Line("E2S", 3);
		l[4] = new Line("N2S", 0);
		l[5] = new Line("N2E", 1);
		l[6] = new Line("W2E", 2);
		l[7] = new Line("W2N", 3);
		TrafficMain();
	}
	
	public static void TrafficMain() throws InterruptedException {
		moment = 0;
        while(moment < demotime) {
        	System.out.println("模拟中...");
        	System.out.print(moment + "时刻");
        	for(int j=0; j<8; j++) {
        		if(l[j].come() == true)
        			System.out.print("，" + j);
        	}
    		System.out.print("路口来车");
    		for(int j=0; j<8; j++) {
        		if(l[j].run() == true)
        			System.out.print("，" + j);
        	}
    		System.out.print("路口通行");
        	System.out.print("\n                |4号 | 5号||\t|     |\r\n"
        			+ "                |    |    ||\t|     |\r\n"
        			+ "                |" + String.format("%2d", l[4].car_num) + "辆|" + String.format("%2d", l[5].car_num) + "辆||\t|     |\r\n"
        			+ "                |    |    ||\t|     |\r\n"
        			+ "                |" + l[4].light + "|" + l[5].light + "||\t|     |\r\n"
        			+ "----------------                       ----------------\r\n"
        			+ "                                       " + l[2].light + "  " + String.format("%2d", l[2].car_num) + "辆   2号\r\n"
        			+ "----------------                       ----------------\r\n"
        			+ "                                       " + l[3].light + "  " + String.format("%2d", l[3].car_num) + "辆   3号\r\n"
        			+ "================                       ================ \r\n"
        			+ "7号  " + String.format("%2d", l[7].car_num) + "辆   " + l[7].light + "\r\n"
        			+ "----------------                       ----------------\r\n"
        			+ "6号  " + String.format("%2d", l[6].car_num) + "辆   " + l[6].light + "\r\n"
        			+ "----------------                       ----------------\r\n"
        			+ "                |     |     ||" + l[1].light + "|" + l[0].light + "|\r\n"
        			+ "                |     |     ||    |    |\r\n"
        			+ "                |     |     ||" + String.format("%2d", l[1].car_num) + "辆|" + String.format("%2d", l[0].car_num) + "辆|\r\n"
        			+ "                |     |     ||    |    |\r\n"
        			+ "                |     |     ||1号 | 0号|\n\n");
        	moment++;
        	TimeUnit.MILLISECONDS.sleep(1000);	
        }
	}
        
}
