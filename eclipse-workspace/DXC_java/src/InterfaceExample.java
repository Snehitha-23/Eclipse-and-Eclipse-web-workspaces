interface IBankAccount{
	void openAccount();
	void closeAccount();
}
interface IBankTransaction{
	void deposit();
	void withdraw();
	void balance();
}
class SavingAccount implements IBankTransaction,IBankAccount{

	@Override
	public void deposit() {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
