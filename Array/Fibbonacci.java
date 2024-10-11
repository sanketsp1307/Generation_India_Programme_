public class ArrayPractice
{
    public static void main(String [] args)
    {
        int [] fibbonacci;
        fibbonacci = new int[20];

        if (20 > 0) fibbonacci[0] = 0;
        if (20 > 1) fibbonacci[1] = 1;
        int sum = 0;
        
        for(int i = 2; i< fibbonacci.length;i++)
        {
           
            fibbonacci[i] = fibbonacci[i-1] + fibbonacci[i - 2];
           
            System.out.println(i + " " + fibbonacci[i]);
            sum +=  fibbonacci[i];
        }
        System.out.println(" Sum of Fibbonaaci: "+sum);
        for(int i = 0; i < fibbonacci.length; i++)
        {
        
            if(fibbonacci[i] % 2 == 0)
            {
                // Print Even Fibonacci
                System.out.println(fibbonacci[i] +" Even Fibbonaaci series");
            }
        }
    }
}