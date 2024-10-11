package LinearSearchExample;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
       // System.out.println("Enter the elements "+ n+ " of array");
        for(int i =0;i< n;i++)
        {
            arr[i] =sc.nextInt();
            System.out.println("Enter the value to Print");
            int search=sc.nextInt();
            for(int j =0;j<arr.length;j++)
            {
                if(arr[j]==search)
                {
                    System.out.println(search+" is Present at Location"+(i+1)+" ");
                }
                else{
                    System.out.println(search+" is not Present at Location"+(i+1)+" ");
                }
            }
        }
    }
    
}
