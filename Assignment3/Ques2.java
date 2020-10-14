import java.util.Scanner;
public class Ques2{
    public static void main(String [] args){
        int i;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            arr[i]=sc.nextInt();
        }
        System.out.println(" ");
        System.out.println("The odd numbers are:");
        for(i=0;i<5;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    
}
