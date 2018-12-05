import java.util.Scanner;

public class Reverse {

    public static void main(String[] args)
    {
        int i =0;
        int j=0;

        System.out.println("enter number : ");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();

        while(i!=0)
        {
            j=j*10;
            j=j + i%10;
            i = i/10;

        }

        System.out.println("reverse number is : " + j);
    }
}
