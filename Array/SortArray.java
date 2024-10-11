package LinearSearchExample;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        int temp =0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
    }
    for(int j =0;j<array.length;j++)
    {
        for (int i = 0; i < array.length; i++)
        {
            if(array[j]>array[i])
            {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
    }
    System.out.println("Sorted array");
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]+ " ");
}
}
}
