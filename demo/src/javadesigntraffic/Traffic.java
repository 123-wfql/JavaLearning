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
        	System.out.println("Ä£ÄâÖÐ...");
        	System.out.print(moment + "Ê±¿Ì");
        	for(int j=0; j<8; j++) {
        		if(l[j].come() == true)
        			System.out.print("£¬" + j);
        	}
    		System.out.print("Â·¿ÚÀ´³µ");
    		for(int j=0; j<8; j++) {
        		if(l[j].run() == true)
        			System.out.print("£¬" + j);
        	}
    		System.out.print("Â·¿ÚÍ¨ÐÐ");
        	System.out.print("\n                |4ºÅ | 5ºÅ||\t|     |\r\n"
        			+ "                |    |    ||\t|     |\r\n"
        			+ "                |" + String.format("%2d", l[4].car_num) + "Á¾|" + String.format("%2d", l[5].car_num) + "Á¾||\t|     |\r\n"
        			+ "                |    |    ||\t|     |\r\n"
        			+ "                |" + l[4].light + "|" + l[5].light + "||\t|     |\r\n"
        			+ "----------------                       ----------------\r\n"
        			+ "                                       " + l[2].light + "  " + String.format("%2d", l[2].car_num) + "Á¾   2ºÅ\r\n"
        			+ "----------------                       ----------------\r\n"
        			+ "                                       " + l[3].light + "  " + String.format("%2d", l[3].car_num) + "Á¾   3ºÅ\r\n"
        			+ "================                       ================ \r\n"
        			+ "7ºÅ  " + String.format("%2d", l[7].car_num) + "Á¾   " + l[7].light + "\r\n"
        			+ "----------------                       ----------------\r\n"
        			+ "6ºÅ  " + String.format("%2d", l[6].car_num) + "Á¾   " + l[6].light + "\r\n"
        			+ "----------------                       ----------------\r\n"
        			+ "                |     |     ||" + l[1].light + "|" + l[0].light + "|\r\n"
        			+ "                |     |     ||    |    |\r\n"
        			+ "                |     |     ||" + String.format("%2d", l[1].car_num) + "Á¾|" + String.format("%2d", l[0].car_num) + "Á¾|\r\n"
        			+ "                |     |     ||    |    |\r\n"
        			+ "                |     |     ||1ºÅ | 0ºÅ|\n\n");
        	moment++;
        	TimeUnit.MILLISECONDS.sleep(1000);	
        }
	}
        
}
