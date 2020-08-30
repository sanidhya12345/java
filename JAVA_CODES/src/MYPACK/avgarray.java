import java.util.Scanner;
public class avgarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] a=new int[10];
        int sum=0;
        float avg;
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/a.length;
        System.out.print("Average="+avg);
    }
}