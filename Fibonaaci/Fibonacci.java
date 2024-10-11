package GenerationPracticeQuestions;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2=1;
        short count = 10;
        fibbo(n1,n2,count);
    }
    public static void fibbo(long n1,long n2,short count)
    {
        long [] arr = new long[count];
        for(int i =0;i<arr.length;i++)
        {
            long n3=n1+n2; // Calculate the next Fibonacci number
            arr[i]=n3;   // Store it in the array
            n1 = n2+n3;// Update n to the last calculated number
            n1=n2;
            n2=n3;
            
        }
       for (long num : arr)
       {
        System.out.println(num);
       }
    }
}
