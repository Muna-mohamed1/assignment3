package Mama;

public class Child1 extends ParenT{

    protected String nationality;
    protected int ID;

    public Child1(String name,int age,String nationality,int Id)
    {
        super( name, age);
        this.nationality=nationality;
        this.ID=ID;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("nationality"+nationality);
        System.out.println("Id"+ID);
    }
}
