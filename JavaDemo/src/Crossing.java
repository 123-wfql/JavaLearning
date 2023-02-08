import java.util.Random;

public class Crossing {
    int state;//是否通行
    int count;//现有车辆

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
        int lt = 30;//左转绿灯
        int st = 30;//直行绿灯
        int mark = lt + st;//时间点标记
        Crossing north = new Crossing(1,0);//北——1
        Crossing south = new Crossing(1,0);//南——2
        Crossing east = new Crossing(-1,0);//东——3
        Crossing west = new Crossing(-1,0);//西——4
        int Time = new Random().nextInt(360);//总时间
        int IP;//是否生成车辆
        int location;//生成方位
        int it=0;//转灯
        int turn;//转向
        System.out.println(0+"时刻，南北车道绿灯，可通行；东西车道红灯，禁止通行！");
        for(int i=0;i<Time;i++){

            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //车辆生成
            IP = new Random().nextInt()%2;
            location = new Random().nextInt()%4+1;

            if(IP==1){
                switch (location){
                    case 1:
                        north.count++;
                        System.out.println(i+"时刻，北车道有车辆到达！目前北车道剩余"+north.count+"辆车未通行……");
                        break;
                    case 2:
                        south.count++;
                        System.out.println(i+"时刻，南车道有车辆到达！目前南车道剩余"+south.count+"辆车未通行……");
                        break;
                    case 3:
                        east.count++;
                        System.out.println(i+"时刻，东车道有车辆到达！目前东车道剩余"+east.count+"辆车未通行……");
                        break;
                    case 4:
                        west.count++;
                        System.out.println(i+"时刻，西车道有车辆到达！目前西车道剩余"+west.count+"辆车未通行……");
                        break;
                    default:
//                        System.out.println("发生事故！");
                }
            }

            if(north.state==1&&north.count>0){
                turn = new Random().nextInt()%3+1;
                switch (turn){
                    case 1:
                        if(mark-lt-1<i&&i<mark){
                            System.out.println(i+"时刻，北车道有车辆左转！");
                            north.count--;
                        }
                        break;
                    case 2:
                        if(i<mark-lt){
                            System.out.println(i+"时刻，北车道有车辆直行！");
                            north.count--;
                        }
                        break;
                    case 3:
                        System.out.println(i+"时刻，北车道有车辆右转！");
                        north.count--;
                        break;
                    default:
//                        System.out.println("发生事故！");
                }
                System.out.println("目前北车道剩余"+north.count+"辆车未通行……");
            }

            if(south.state==1&&south.count>0){
                turn = new Random().nextInt()%3+1;
                switch (turn){
                    case 1:
                        if(mark-lt-1<i&&i<mark){
                            System.out.println(i+"时刻，南车道有车辆左转！");
                            south.count--;
                        }
                        break;
                    case 2:
                        if(i<mark-lt){
                            System.out.println(i+"时刻，南车道有车辆直行！");
                            south.count--;
                        }
                        break;
                    case 3:
                        System.out.println(i+"时刻，南车道有车辆右转！");
                        south.count--;
                        break;
                    default:
//                        System.out.println("发生事故！");
                }
                System.out.println(i+"时刻，南车道剩余"+south.count+"辆车未通行……");
            }

            if(east.state==1&&east.count>0){
                turn = new Random().nextInt()%3+1;
                switch (turn){
                    case 1:
                        if(mark-lt-1<i&&i<mark){
                            System.out.println(i+"时刻，东车道有车辆左转！");
                            east.count--;
                        }
                        break;
                    case 2:
                        if(i<mark-lt){
                            System.out.println(i+"时刻，东车道有车辆直行！");
                            east.count--;
                        }
                        break;
                    case 3:
                        System.out.println(i+"时刻，东车道有车辆右转！");
                        east.count--;
                        break;
                    default:
//                        System.out.println("发生事故！");
                }
                System.out.println(i+"时刻，东车道剩余"+east.count+"辆车未通行……");
            }

            if(west.state==1&&west.count>0){
                turn = new Random().nextInt()%3+1;
                switch (turn){
                    case 1:
                        if(mark-lt-1<i&&i<mark){
                            System.out.println(i+"时刻，西车道有车辆左转！");
                            west.count--;
                        }
                        break;
                    case 2:
                        if(i<mark-lt){
                            System.out.println(i+"时刻，西车道有车辆直行！");
                            west.count--;
                        }
                        break;
                    case 3:
                        System.out.println(i+"时刻，西车道有车辆右转！");
                        west.count--;
                        break;
                    default:
//                        System.out.println("发生事故！");
                }
                System.out.println(i+"时刻，西车道剩余"+ west.count+"辆车未通行……");
            }

            if(mark==i){//状态转变
                it++;
                if(it%2==0){
                    System.out.println(i+"时刻，南北车道绿灯，可通行；东西车道红灯，禁止通行！");
                }else System.out.println(i+"时刻，东西车道绿灯，可通行；南北车道红灯，禁止通行！");
                north.change(north,south,east,west);
                mark += (lt + st);
            }

        }
    }
}
