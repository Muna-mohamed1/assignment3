package Mama;

public class multi extends mas{
    String specialwork;

    public multi(int ID,String Name,String specialwork)
    {
        super(ID,Name);
        this.specialwork=specialwork;

    }

    @Override
    public void getDetails() {
        System.out.println("Name:"+Name+",ID:"+ID+",specialwork:"+specialwork);
    }
}
