import java.util.Scanner;
public class sumof{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        int i=0;
        int sum=0;
        System.out.println("Enter the elements of array:-");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("Sum ="+sum);
    }
}