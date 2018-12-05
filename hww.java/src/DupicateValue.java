public class DupicateValue {

    public static void main(String[] args)
    {
        int a[]={1,3,2,4,5,6,1,2,10,15,10};

        for(int i=1;i<a.length;i++){

            for(int j = i+1;j<a.length;j++) {

                if ((a[i] == a[j]) && (i != j)) {

                    System.out.println( a[j]);
                }
            }
        }

    }


}
