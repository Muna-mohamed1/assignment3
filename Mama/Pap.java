package Mama;

public class Pap extends mas {
    double specialvalue;

    public Pap(int ID,String Name,double specialvalue)
    {
        super(ID,Name);
        this.specialvalue=specialvalue;
    }

    @Override
    public void getDetails() {
        System.out.println("Name:"+Name+", ID:"+ID+",specialvalue:"+specialvalue);
    }
}
