package Prog3_2;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Amanuel","emito", 5000,10,5,5);
		Account checking = new Account(employee,AccountType.CHECKING,300);
		Account savings = new Account(employee,AccountType.SAVINGS,300);
		Account retirement = new Account(employee,AccountType.RETIREMENT,300);
		
		checking.makeDeposit(700);
		checking.makeWithdrawal(200);
		
		System.out.println(checking);
		System.out.println(savings);
		System.out.println(retirement);
	}
}
