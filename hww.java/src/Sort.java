import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sort
{
    public static void main(String[] args) {

        int numeric[] = {70, 30, 40, 10, 80, 5, 8,};

        System.out.println("original value : " + Arrays.toString(numeric));       //original value
        Arrays.sort(numeric);               //to sort arrays

        System.out.println("Sort Numeric Array : " + Arrays.toString(numeric));


        String word[] = {"baroda", "ahmedabad", "surat", "anand", "mehsana", "himmatnagar"};
        System.out.println("original value : " + Arrays.toString(word));        // for original value
        Arrays.sort(word);

        System.out.println("Sort Numeric Array : " + Arrays.toString(word));


    }}






