import java.util.Scanner;

public class Ascending
{
    public static void main(String[] args)
    {
        System.out.println("enter five  elements in Array : ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

            int m =0;
        for(int i=0;m!=5;i++){

            if(i==a || i==b|| i==c|| i==d|| i==e){

                System.out.print(" " + i);
                m++;
            }
        }

        {

    }

}
}
