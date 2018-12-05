import java.util.Scanner;

public class ReverseString
{


        public static void main(String[] args)
        {
            System.out.println("enter word : ");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();

            StringBuilder input1 = new StringBuilder();

            input1.append(name); // append usually use with stringbuilder. its keyword


            input1 = input1.reverse();   // reverse StringBuilder input1



            System.out.println(input1);
        }
    }


