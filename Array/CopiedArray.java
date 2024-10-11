package LinearSearchExample;

public class CopiedArray {
    public static void main(String[] args) {
        int [] originalArray = {5,6,8,2,0,6,9,7};
        int [] CopiedArray = new int[originalArray.length];
        for(int i=0;i<originalArray.length;i++)
        {
            CopiedArray[i]=originalArray[i];
            System.out.println("Copied Elements : "+CopiedArray[i]);

        }
}
}