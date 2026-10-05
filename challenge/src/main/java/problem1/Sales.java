package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE  ;
        Scanner sc  =  new Scanner(System.in) ;
        System.out.println("enter the number of salespeople  : ") ;
        SALESPEOPLE = sc.nextInt() ;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            int idx  =  i+1 ;
            System.out.print("Enter sales for salesperson " + idx + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;

        int max = sales[0] ;
        int max_id  = 1 ;

        int min  = sales[0] ;
        int min_id  =  1 ;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];

            if (sales[i] > max) {
                max  =  sales[i] ;
                max_id  =  i+1 ;
            }

            if ( sales[i]  < min) {
                min  = sales[i] ;
                min_id  =  i+1 ;
            }
        }
        System.out.println("\nTotal sales: " + sum);

        System.out.println("the average is  : "+ sum/5) ;


        System.out.println("the maximum sale is  : "+ max + " and the id of the saleperson is  : " + max_id) ;
        System.out.println("the minimum sale is  : "+ min + " and the id of the saleperson is  : " + min_id) ;

        System.out.println("Enter a value : ") ;

        int i_val  =  sc.nextInt() ;

        System.out.println("the sales values that are surpassing the enterd value with the ids are  : ");
        int count =  0 ;
        for ( int i = 0 ; i < sales.length ; i++) {
            if (sales[i] > i_val) {
                System.out.println(i + "  : " + sales[i]) ;
                count ++ ;
            }
        }

        System.out.println("the number of salesmen who surpassed the entered vale is : " + count );


    }
}