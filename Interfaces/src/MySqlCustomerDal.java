
public class MySqlCustomerDal  implements ICustomerDal , IRepository{ //Class'lar birden fazla Interfaceleri implemente edebilir ancak bi tane Class'ı extends edebilir.  

	@Override
	public void add() {
		System.out.println("My Sql eklendi.");
		
	}

}
