package LinearSearchExample;

public class Duplicatearray {
    public static void main(String[] args) {
        int array []={56,23,7,89,7,24,39,24};
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j]){
                    System.out.println("Duplicate element is "+array[i]);
                }
            }
        }
    }
}
