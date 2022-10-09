//This Program is prepared by 21CE118 Shruti Sangani
//Part-7 Practical1
//Aim :: Create a generic method for sorting an array of Comparable objects.
import java.util.Arrays;
public class Practical1 {
    public <E extends Comparable<E>> void sort(E[] s)
    {
        E swap;
        int i,j;
        for(i=0;i<s.length;i++)
        {
            for(j=i+1;j<s.length;j++)
            {
                if(s[i].compareTo(s[j])>0)
                {
                    swap=s[i];
                    s[i]=s[j];
                    s[j]=swap;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Practical1 t=new Practical1();
        Integer[] a={3,4,1,2,5};
        t.sort(a);
        int i;
        for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        String[] countries = { "India", "SriLanka", "SouthAfrica", "America", "NewZealand", " Australia", "SouthKorea", "Japan", "Russia", "Italy", "Germany" };
        t.sort(countries);
        System.out.println(Arrays.toString(countries));
    }
}
