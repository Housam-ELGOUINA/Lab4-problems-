package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;

        int max = sales[0] ;
        int max_id  = 0 ;

        int min  = sales[0] ;
        int min_id  =  0 ;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];

            if (sales[i] > max) {
                max  =  sales[i] ;
                max_id  =  i ;
            }

            if ( sales[i]  < min) {
                min  = sales[i] ;
                min_id  =  i ;
            }
        }
        System.out.println("\nTotal sales: " + sum);

        System.out.println("the average is  : "+ sum/5) ;


        System.out.println("the maximum sale is  : "+ max + " and the id of the saleperson is  : " + max_id) ;
        System.out.println("the minimum sale is  : "+ min + " and the id of the saleperson is  : " + min_id) ;


    }
}