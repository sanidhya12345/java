import java.util.Scanner;
public class evenele{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int [] arr={2,6,7,5,8,10,12,9};
        int i=0;
        int sum=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] % 2==0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.print("Sum of even elements="+sum);
    }
}
