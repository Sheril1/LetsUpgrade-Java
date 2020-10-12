import java.util.Scanner;

public class Ques2 {
    public static void main(String [] args){
        String name;
        int dob,mob,by,day,month,year,m_sal,a_sal;
        double tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        name=sc.nextLine();
        System.out.println("Enter Date of Birth:");
        dob=sc.nextInt();
        System.out.println("Enter Month of Birth:");
        mob=sc.nextInt();
        System.out.println("Enter Year of Birth:");
        by=sc.nextInt();
        System.out.println("Enter Monthly Salary");
        m_sal=sc.nextInt();
        a_sal=m_sal*12;
        year=2020-by;
        if( a_sal>=500000)
        {
            tax=a_sal*0.2;
        }
        else if(a_sal>=400000 && a_sal<500000)
        {
            tax=a_sal*0.15;
        }
        else if(a_sal>=300000 && a_sal<400000)
        {
            tax=a_sal*0.1;
        }
        else if(a_sal>=200000 && a_sal<300000)
        {
            tax=a_sal*0.05;
        }
        else{
            tax=0;
        }
        System.out.println("The Name is "+name);
        System.out.println("The Age is "+year);
        System.out.println("The Annual Salary is "+a_sal);
        System.out.println("The Tax Amount is "+tax);
    }
}
