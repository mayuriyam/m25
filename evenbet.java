import java.io.*;
import java.util.*;
class evenbet
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
     
        for(int i=1;i<a;i++)
        {
            if((i%2==0))
            {
                System.out.println(i);
            }
        }
    }
}


