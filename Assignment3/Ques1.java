import java.util.Scanner;
class Avenger{
    String name, power, weapon, planet;
    int age;
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        name=sc.nextLine();
        System.out.println("Enter the power:");
        power=sc.nextLine();
        System.out.println("Enter the weapon:");
        weapon=sc.nextLine();
        System.out.println("Enter the planet:");
        planet=sc.nextLine();
        System.out.println("Enter the age:");
        age=sc.nextInt();
        System.out.println(" ");
    }
    void displayDetails(){
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The power is "+power);
        System.out.println("The weapon is "+weapon);
        System.out.println("The planet is "+planet);
        System.out.println(" ");
    }
}
public class Ques1 {
    public static void main(String [] args){
        int i;
        Avenger[] avengers = new Avenger[5];
        for(i=0;i<5;i++)
        {
            avengers[i]=new Avenger();
            avengers[i].getDetails();
        }
        for(i=0;i<5;i++)
        {
            avengers[i].displayDetails();
        }
    }
}
