
public class Main {

	public static void main(String[] args) {
		
		 // Interface onu implemente eden class'ın referansını tutabilir.
		CustomerManager customerManager = new CustomerManager(new SqlCustomerDal());
		customerManager.add();

	}

}
