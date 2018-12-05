import java.util.Scanner;

public class FirstAndLast
{
    public static void main(String[] args)
    {
        int i,a=0,b;

        System.out.println("enter any number : ");
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        b=j%10;

        while(j>0)
        {
            i = j % 10;
            a = a * 10 + i;
            j = j / 10;
        }
        int k=a%10;
        int total = k+b;
        System.out.println("first and last digit sum : "  + total);



}

}
