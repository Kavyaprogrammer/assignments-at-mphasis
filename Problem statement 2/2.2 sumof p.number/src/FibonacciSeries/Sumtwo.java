package FibonacciSeries;

public class Sumtwo {


	public static void main(String[] args) 
	{
		
		 int n = 13; //maxNumber
		 int n1 = 2; //previousNumber
		 int n2 = 1; //next number
		 
	        System.out.print("Fibonacci Series of "+n+" numbers:");

	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(n2+" ");
	           

	      
	            int sum = n1 + n2; // sum=2+1=3  
	            n1= n2;  //n2 value goes to n1
	            n2 = sum;  //sum value goes to n2 
	        }
	}
}