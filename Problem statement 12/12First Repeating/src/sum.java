import java.util.Scanner;
public class sum
{
    public static void main(String[] args)  
    { 
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sr.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++) // select an element
        for(int j=i+1;j<n;j++) //traverse ahead and check for duplicate
            if(arr[i]==arr[j])
              {
                System.out.println("1st repeating integer is "+ arr[i]);
                temp=1;
                i=n;j=n;
              }
        if(temp==0)
        System.out.println("No repeating integer found");
    }
}