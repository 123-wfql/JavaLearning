package exp2guessnum;

import java.util.Scanner; 
import java.util.Random;

public class GuessNumber {
	public static void main(String ars[]) {
		System.out.print("������\n********\n1.��ʼ��Ϸ\n2.�˳���Ϸ\n��ѡ��"); 
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
				System.out.print("ֻ������1��2Ŷ��");
			}
			System.out.print("\n\n\n1.��ʼ��Ϸ\n2.�˳���Ϸ\n��ѡ��"); 
		}while(true);
	}
	
	public static void GuessNumMain() {
		Random r = new Random();
		int score = 0;
		int choose = 1;
		do{

			int number = r.nextInt(10);
			for (int i = 1; i <= 3; i++) {
				System.out.print("��"+ i +"�β�����");
				Scanner input = new Scanner(System.in);
				int guess = input.nextInt();
				if (guess < number)
					System.out.print("��С��...\n");
				else if (guess > number)
					System.out.print("�´���...\n");
				else {
					score += 4-i;
					System.out.print("******��¶��������" + (4-i) + "��******\n");
					break;
				}
			}
			System.out.print("��ȷ���ǣ�" + number);
			System.out.print("\n******��ĵ�ǰ�÷���:" + score);
			do{
				System.out.print("\n1.����һ��\n2.����\n��ѡ��");
				Scanner input = new Scanner(System.in);
				choose = input.nextInt();
				switch(choose) {
				case 1:
					break;
				case 2:
					System.out.print("******�����ĵ÷��ǣ�" + score);
					break;
				default:
					System.out.print("���������룺");
				}
			}while(choose != 1 && choose != 2);
		}while(choose == 1);
		
	}
}

