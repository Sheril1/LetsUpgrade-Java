class Employee
{
    String name;
    int age;
    String city;
    void display()
    {
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The city is "+city);
    }
}
public class Main {
    public static void main(String [] args)
    {
        Employee e=new Employee();
        e.name="Sheril Samuel";
        e.age=19;
        e.city="Mumbai";
        e.display();
        Employee e1=new Employee();
        e1.name="Jeon Jungkook";
        e1.age=23;
        e1.city="Busan";
        e1.display();
    } 
}
