// program of linear search of array:-
import java.util.Scanner;
public class search
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] a={10,20,30,40,50,60,23,45,67,89,34,23,12,45,67,78};
        System.out.println("Enter the element you want to find:-");
        int ele=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==ele)
            {
                System.out.println("Your element is present in our array.");
            }
            else
            {
                System.out.println("Your element is not present in our array.");
            }
        }
    }
}    
  
