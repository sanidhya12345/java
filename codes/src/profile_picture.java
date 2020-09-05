import java.util.Scanner;
public class profile_picture {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int test=sc.nextInt();
        while(test>0)
        {
            int size=2;
            int [] arr = new int[2];
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            int width=arr[0];
            int height=arr[1];
            if(width<length || height<length)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                if(width==length && height==length)
                {
                    System.out.println("ACCEPTED");
                }
                else if(width==height)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
            test=test-1;
        }
       sc.close();
    }
}
