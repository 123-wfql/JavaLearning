package exp2guessnum;

import java.util.Scanner; 
import java.util.Random;

public class GuessNumber {
	public static void main(String ars[]) {
		System.out.print("猜数字\n********\n1.开始游戏\n2.退出游戏\n请选择："); 
		Scanner input = new Scanner(System.in);
		do{
			int i = input.nextInt();
			switch(i) {
			case 1:
				GuessNumMain();
				break;
			case 2:
				System.exit(0);
			default:
				System.out.print("只能输入1或2哦！");
			}
			System.out.print("\n\n\n1.开始游戏\n2.退出游戏\n请选择："); 
		}while(true);
	}
	
	public static void GuessNumMain() {
		Random r = new Random();
		int score = 0;
		int choose = 1;
		do{

			int number = r.nextInt(10);
			for (int i = 1; i <= 3; i++) {
				System.out.print("第"+ i +"次猜数：");
				Scanner input = new Scanner(System.in);
				int guess = input.nextInt();
				if (guess < number)
					System.out.print("猜小了...\n");
				else if (guess > number)
					System.out.print("猜大了...\n");
				else {
					score += 4-i;
					System.out.print("******你猜对啦！获得" + (4-i) + "分******\n");
					break;
				}
			}
			System.out.print("正确答案是：" + number);
			System.out.print("\n******你的当前得分是:" + score);
			do{
				System.out.print("\n1.再来一次\n2.返回\n请选择：");
				Scanner input = new Scanner(System.in);
				choose = input.nextInt();
				switch(choose) {
				case 1:
					break;
				case 2:
					System.out.print("******你最后的得分是：" + score);
					break;
				default:
					System.out.print("请重新输入：");
				}
			}while(choose != 1 && choose != 2);
		}while(choose == 1);
		
	}
}

