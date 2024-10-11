package LinearSearchExample;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array ={5,9,36,78,65};
        int start = 0; 
        int end = array.length-1;
        int temp;
        while(start< end)
        {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
           
            start++;
            end--;
        }
System.out.println(Arrays.toString(array));
    
}
}