import java.util.Scanner;
public class Ques1
{
    public static void main(String [] args){
        int a,b,c,d,e,total;
        float per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of five subjects:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        total=a+b+c+d+e;
        per=total*100/500;
        System.out.println("Your percentage is "+per);
        if(per>=35)
        {
            System.out.println("You have Passed");
            if(per>=70)
            {
                System.out.println("Grade A+");
            }
            else if(per>=60 && per<70)
            {
                System.out.println("Grade A");
            }
            else if(per>=55 && per<60)
            {
                System.out.println("Grade B+");
            }
            else if(per>=45 && per<55)
            {
                System.out.println("Grade B");
            }
            else
            {
                System.out.println("Grade C");
            }
        }
        else
        {
            System.out.println("You have Failed.");
            System.out.println("Grade FF.");
        }    
    }
}