import java.util.Scanner;
public class arrayinsert{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int [] a={10,20,30,40,50,60};
        int [] arr=new int[7];
        System.out.println("Enter the number which you want to insert:-");
        int ele=sc.nextInt();
        System.out.println("Enter the postion which you want to add your element:-");
        int pos=sc.nextInt();
        int temp;
        for(int i=0;i<a.length;i++)
        {
            if(pos==i)
            {
                a[pos]=ele;
                arr[6]=a[i];
            }
            else
            {
                arr[i]=a[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}