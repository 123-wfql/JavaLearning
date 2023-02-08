package exp3banksave;

public class Customer extends Thread {
	private String name;

    public Customer(String name) { 
        this.name = name;
    }

    
    public void run() {
        int t = (int)(Math.random()*4+1); 
        for (int i = 0; i < t; i++) {
            int money = ((int)(Math.random()*9+1))*100; 
            Bank.save(name, money); 
        }
    }
}
