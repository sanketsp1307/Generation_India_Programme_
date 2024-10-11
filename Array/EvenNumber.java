package LinearSearchExample;

public class EvenNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i : numbers) {
            if(i % 2 !=0)
            {
                System.out.println(i);
            }
        }
    }
}
