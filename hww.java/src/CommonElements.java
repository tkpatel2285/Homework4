import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class CommonElements
{
    public static void main (String[]args)
    {
      String  a []  = {"sunday","monday","tuesday","thursday"};
      String  b[]  = {"tuesday","thursday","friday","saturday"};
        HashSet<String> set = new HashSet<String>();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if(a[i] == (b[j]))
                {
                    set.add(a[i]);
                }
            }
        }
        System.out.println("Common element is : "+(set));
    }
}

