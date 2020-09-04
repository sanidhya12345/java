/*
    1
   22
  333
 4444
55555
*/


public class number_pattern12 {
    public static void main(String[] args)
    {
        for(int i=1;i<6;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}

