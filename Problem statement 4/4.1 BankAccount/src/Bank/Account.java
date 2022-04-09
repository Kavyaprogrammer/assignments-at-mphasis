package Bank;
public class Account {
	 	int account_number;
	    String name;
	    String account_type;
	    double balance;
	   
	    public int getAccount_number() {
	        return account_number;
	    }
	   
	    public void setAccount_number(int account_number) {
	        this.account_number = account_number;
	    }
	   
	    public String getName() {
	        return name;
	    }
	   
	    public void setName(String name) {
	        this.name = name;
	    }
	   
	    public String getAccount_type() {
	        return account_type;
	    }
	   
	    public void setAccount_type(String account_type) {
	        this.account_type = account_type;
	    }
	   
	    public double getBalance() {
	       
	        if( balance <1000)
	        {
	        try
	        {   
	            throw new NumberFormatException();
	        }
	        catch(NumberFormatException nw)
	        {
	            System.out.println("Balance is low" + balance);
	        }
	        }
	       
	       
	        return balance;
	       
	    }
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }//end setter and getter

	    public Account() {
	       
	        this.account_number = 9723436;
	        this.name = "SANTHOSH";
	        this.account_type = "Saving";
	        this.balance = 500;
	    }
	   
	   
	   
	   
	    public Account(int account_number, String name, String account_type,
	            double balance) {
	       
	        this.account_number = account_number;
	        this.name = name;
	        this.account_type = account_type;
	        this.balance = balance;
	    }
	    void deposit(double amt)
	    {
	        if(amt<0)
	        {
	            try
	            {
	                throw new NumberFormatException();
	            }
	            catch(NumberFormatException nf)
	            {
	                System.out.println("Negaive Amount cant be deposited");
	            }
	        }
	        else
	        {
	            balance=getBalance()+amt;
	            System.out.println("Current balance is ="+ balance);
	           
	        }
	       
	       
	       
	    }
	     public void withdraw(double amt){
	         if(amt>1000)
	            {
	                try
	                {
	                    throw new NumberFormatException();
	                }
	                catch(NumberFormatException nf)
	                {
	                    System.out.println("Insufficent Balance");
	                }
	            }
	            else
	            {
	                balance=getBalance()-amt;
	                System.out.println("Current balance is ="+ balance);
	               
	            }
	       
	   
	    }
	     void display()
	     {
	    	 System.out.println("Account number:" + this.account_number);
	    	 System.out.println("Account name:" + this.name);
	    	 System.out.println("Account type:" + this.account_type);
	    	 System.out.println("Balance is ="+ getBalance());   
	     }
	   
	    public static void main(String[] args) {
	       
	        Account b=new Account();
	        b.deposit(5000);
	        b.display();
	        b.withdraw(1000);
	        b.display();
	        b.withdraw(5000);
	        b.getBalance();
	        b.display();
	   
	       
	       
	       
	    }
}