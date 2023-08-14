package exp3banksave;

public class BankSave {
	public static void main(String[] args) {
        Customer c1 = new Customer("CZF");
        Customer c2 = new Customer("LJY");
        Customer c3 = new Customer("HC");

        c1.start();
        c2.start();
        c3.start();
    }
}
