package LinearSearchExample;

public class BinarySearch {
    public static void binary(int arr[], int target)
    {
        int begin =0, end =arr.length-1;
        while(begin<=end)
        {
            int mid = (begin+end)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);
            }
            if (arr[mid] < target) {
                begin = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                end = mid - 1;
            }
        }
    }
    public static void main(String[] args) {
        int  [] arr ={4,5,10,15,20,30,35,40,45,50,58,65,80,98};
        int target = 35;
        int result = binarySearch(arr, target);
       
    }
    
}
