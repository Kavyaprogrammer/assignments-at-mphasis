package integers;

public class integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,avg,temp;
		int[] array=new int[] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		  for (int i = 0; i < array.length; i++) {  
	           sum = sum + array[i];  
	        }  
		  System.out.println("Sum of all the elements of an array: " + sum);  
		  array[15]=sum;
		  avg=sum/array.length;
		  array[16]=avg;
		  for(int i=0;i<array.length;i++) {
			  System.out.println(array[i]);
			  }
		  
		  for(int i=0;i<array.length;i++) {
			  for(int j=i+1;j<array.length;j++) {
				  if(array[i]>array[j]) {
					  temp=array[i];
					  array[i]=array[j];
					  array[j]=temp;
				  }
			 }
		 }
		  for(int i=0;i<array.length;i++) {
			  System.out.println(array[i]);
			  }
		  System.out.println("smallest number"+array[0]);
		  array[17]=array[0];
		  for(int i=0;i<array.length;i++) {
			  System.out.println(array[i]);
			  }
		
     }
}