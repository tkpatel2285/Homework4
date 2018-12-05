import java.util.Scanner;

public class Armstron
{
    public static void main(String[] args)
    {
            int a,r,m=0,p;

            System.out.println("Enter any  number");

            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
            p = a;

            while (a>0) {
                r = a % 10;
                m += r * r * r;
                a=a/10;}


            if (m==p){
                System.out.println( " ia armstrong number");}
            else
            {System.out.println(  " is not armstrong number");
        }
    }

}

