import java.util.Scanner;

public class Sum
{

    public static void main(String[] args)
    {
        int a, j, sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to calculate : ");
        a= scan.nextInt();


        while(a > 0)
        {
            j = a % 10; // first last digit seearate
            a = a / 10; // again dividing to get another numbers sepearate
            sum = sum + j;
        }
        System.out.println("Total Sum of Digits: "+sum);
    }
}



