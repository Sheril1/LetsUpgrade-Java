import java.util.Scanner;
public class Ques3 {
    public static void main(String [] args){
        int i,sum=0;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            arr[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("");
        System.out.println("The sum of all values is "+sum);
    }
}
