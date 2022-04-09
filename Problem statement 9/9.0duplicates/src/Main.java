import java.util.Arrays;
 
public class Main
{
public static void countFreq(int arr[], int n)
{
    boolean visited[] = new boolean[n];
     
    Arrays.fill(visited, false);
 
    // Traverse through array elements and
    // count frequencies
    for (int i = 0; i < n; i++) {
 
        // Skip this element if already processed
        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " occurs " + count + " times ");
    }
}
 
// Driver code
public static void main(String []args)
{
    int arr[] = new int[]{2, 2, 2, 4, 4, 4, 5, 5, 6, 8, 8, 9};
    int n = arr.length;
    countFreq(arr, n);
}
}
