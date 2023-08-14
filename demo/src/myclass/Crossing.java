package myclass;

import java.util.Random;

public class Crossing {
    int state;//�Ƿ�ͨ��
    int count;//���г���

    public Crossing(int state,int count){
        this.state = state ;
        this.count = count ;
    }

    public void change(Crossing n,Crossing s,Crossing e,Crossing w){
            n.state = n.state * -1;
            s.state = s.state * -1;
            e.state = e.state * -1;
            w.state = w.state * -1;
    }

    public static void main(String args[]){
        int lt = 30;//��ת�̵�
        int st = 30;//ֱ���̵�
        int mark = lt + st;//ʱ�����
        Crossing north = new Crossing(1,0);//������1
        Crossing south = new Crossing(1,0);//�ϡ���2
        Crossing east = new Crossing(-1,0);//������3
        Crossing west = new Crossing(-1,0);//������4
        int Time = new Random().nextInt(360);//��ʱ��
        int IP;//�Ƿ����ɳ���
        int location;//���ɷ�λ
        int it=0;//ת��
        int turn;//ת��
        System.out.println(0+"ʱ�̣��ϱ������̵ƣ���ͨ�У�����������ƣ���ֹͨ�У�");
        for(int i=0;i<Time;i++){

            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //��������
            IP = new Random().nextInt()%2;
            location = new Random().nextInt()%4+1;

            if(IP==1){
                switch (location){
                    case 1:
                        north.count++;
                        System.out.println(i+"ʱ�̣��������г������Ŀǰ������ʣ��"+north.count+"����δͨ�С���");
                        break;
                    case 2:
                        south.count++;
                        System.out.println(i+"ʱ�̣��ϳ����г������Ŀǰ�ϳ���ʣ��"+south.count+"����δͨ�С���");
                        break;
                    case 3:
                        east.count++;
                        System.out.println(i+"ʱ�̣��������г������Ŀǰ������ʣ��"+east.count+"����δͨ�С���");
                        break;
                    case 4:
                        west.count++;
                        System.out.println(i+"ʱ�̣��������г������Ŀǰ������ʣ��"+west.count+"����δͨ�С���");
                        break;
                    default:
//                        System.out.println("�����¹ʣ�");
                }
            }

            if(north.state==1&&north.count>0){
                turn = new Random().nextInt()%3+1;
                switch (turn){
                    case 1:
                        if(mark-lt-1<i&&i<mark){
                            System.out.println(i+"ʱ�̣��������г�����ת��");
                            north.count--;
                        }
                        break;
                    case 2:
                        if(i<mark-lt){
                            System.out.println(i+"ʱ�̣��������г���ֱ�У�");
                            north.count--;
                        }
                        break;
                    case 3:
                        System.out.println(i+"ʱ�̣��������г�����ת��");
                        north.count--;
                        break;
                    default:
//                        System.out.println("�����¹ʣ�");
                }
                System.out.println("Ŀǰ������ʣ��"+north.count+"����δͨ�С���");
            }

            if(south.state==1&&south.count>0){
                turn = new Random().nextInt()%3+1;
                switch (turn){
                    case 1:
                        if(mark-lt-1<i&&i<mark){
                            System.out.println(i+"ʱ�̣��ϳ����г�����ת��");
                            south.count--;
                        }
                        break;
                    case 2:
                        if(i<mark-lt){
                            System.out.println(i+"ʱ�̣��ϳ����г���ֱ�У�");
                            south.count--;
                        }
                        break;
                    case 3:
                        System.out.println(i+"ʱ�̣��ϳ����г�����ת��");
                        south.count--;
                        break;
                    default:
//                        System.out.println("�����¹ʣ�");
                }
                System.out.println(i+"ʱ�̣��ϳ���ʣ��"+south.count+"����δͨ�С���");
            }

            if(east.state==1&&east.count>0){
                turn = new Random().nextInt()%3+1;
                switch (turn){
                    case 1:
                        if(mark-lt-1<i&&i<mark){
                            System.out.println(i+"ʱ�̣��������г�����ת��");
                            east.count--;
                        }
                        break;
                    case 2:
                        if(i<mark-lt){
                            System.out.println(i+"ʱ�̣��������г���ֱ�У�");
                            east.count--;
                        }
                        break;
                    case 3:
                        System.out.println(i+"ʱ�̣��������г�����ת��");
                        east.count--;
                        break;
                    default:
//                        System.out.println("�����¹ʣ�");
                }
                System.out.println(i+"ʱ�̣�������ʣ��"+east.count+"����δͨ�С���");
            }

            if(west.state==1&&west.count>0){
                turn = new Random().nextInt()%3+1;
                switch (turn){
                    case 1:
                        if(mark-lt-1<i&&i<mark){
                            System.out.println(i+"ʱ�̣��������г�����ת��");
                            west.count--;
                        }
                        break;
                    case 2:
                        if(i<mark-lt){
                            System.out.println(i+"ʱ�̣��������г���ֱ�У�");
                            west.count--;
                        }
                        break;
                    case 3:
                        System.out.println(i+"ʱ�̣��������г�����ת��");
                        west.count--;
                        break;
                    default:
//                        System.out.println("�����¹ʣ�");
                }
                System.out.println(i+"ʱ�̣�������ʣ��"+ west.count+"����δͨ�С���");
            }

            if(mark==i){//״̬ת��
                it++;
                if(it%2==0){
                    System.out.println(i+"ʱ�̣��ϱ������̵ƣ���ͨ�У�����������ƣ���ֹͨ�У�");
                }else System.out.println(i+"ʱ�̣����������̵ƣ���ͨ�У��ϱ�������ƣ���ֹͨ�У�");
                north.change(north,south,east,west);
                mark += (lt + st);
            }

        }
    }
}
