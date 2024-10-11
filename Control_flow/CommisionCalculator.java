import java.util.Scanner;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sales Amount");
        int sales = sc.nextInt();
        float Commission_per=0;
        float com;
        if(sales<=1000){
            System.out.println("No Commission");
        }
        else if(sales>=1001 && sales<=4999){
            System.out.println("YOur calculation is calculated at 10%");
            Commission_per=10;
            com=Calc_Comm(Commission_per, sales);
        }
        

    }
       public static float Calc_Comm(int sales,int com){
                    return (sales*com)/100;
       }