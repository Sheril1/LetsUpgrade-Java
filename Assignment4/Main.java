class Main 
{
    public static void main(String [] args){
        int i;
        Doctor[] doctor=new Doctor[3];
        Engineer[] engineer=new Engineer[3];
        Pilot[] pilot= new Pilot[3];
        for(i=0;i<3;i++)
        {
            doctor[i]=new Doctor();
            engineer[i]=new Engineer();
            pilot[i]=new Pilot();
            doctor[i].getDoctor();
            doctor[i].getDetails();
            engineer[i].getEngineer();
            engineer[i].getDetails();
            pilot[i].getPilot();
            pilot[i].getDetails();
        }
        System.out.println();
        System.out.println("Employee details below:");
        for(i=0;i<3;i++)
        {
            System.out.println();
            doctor[i].displayDetails();
            System.out.println();
            engineer[i].displayDetails();
            System.out.println();
            pilot[i].displayDetails();
        }
    }
}
