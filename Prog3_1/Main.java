package Prog3_1;

public class Main {

	public static void main(String[] args) {
		
		Customer c1=new Customer("Amanuel","Gebreendrias","332-221-4444");
		Customer c2=new Customer("Petros","Habteslasie","120-201-5555");
		Customer c3=new Customer("Amine","Tsegay","111-897-6666");

		c1.setBillingAddress(new Address("10 Adams", "Chicago", "IL", "60290"));
        c1.setShippingAddress(new Address("110 Burlington", "Fairfield", "IA", "52556"));
		
        c2.setBillingAddress(new Address("322 Harrison", "Chicago", "IL", "60290"));
        c2.setShippingAddress(new Address("2210 Burlington", "Fairfield", "IA", "52556"));
        
        c3.setBillingAddress(new Address("322 Harrison", "FairField", "IA", "52557"));
        c3.setShippingAddress( new Address("110 Burlington", "Fairfield", "IA", "52556"));
        
		Customer[] customerArrays=new Customer[3];
		customerArrays[0]=c1;
		customerArrays[1]=c2;
		customerArrays[2]=c3;
		
		for (Customer customer : customerArrays) {
			Address billingAddress=customer.getBillingAddress();
		    if("Chicago".equalsIgnoreCase(billingAddress.getCity())){
		    	System.out.println("Found a matched record - " + customer.toString());
		    }
		   
		}
	}

}
