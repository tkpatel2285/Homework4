import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {

        int n,rem,rev=0,temp;

        System.out.println("enter any number : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;

        while(n>0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }

        if(temp==rev)
        {
            System.out.println("Number is Palindrome");
        }

        else
            {
                System.out.println("NUmber is not palindrome ");
            }
            }

}
