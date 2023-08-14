package javadesigntraffic;

public class Line {
	public String direction;
	public int car_num;
	public int run_turn;//�ڵڼ��ֱ�����
	public String light;

    public Line(String direction, int run_turn) { 
        this.direction = direction;
        this.run_turn = run_turn;
        this.car_num = 0;
    }

    public boolean come() {
    	if (Math.random() < 0.25) {
    		this.car_num ++;
    		return true;
    	}
    	else
    		return false;
    }
    
    public boolean run() {
    	if ((Traffic.moment/Traffic.wait)%4 == this.run_turn) {
    		this.light = "�̵�";
    		if (this.car_num > 0) {
    			this.car_num --;
    		}
    		return true;
    	}
    	else {
    		this.light = "���";
    		return false;
    	}
    }
}