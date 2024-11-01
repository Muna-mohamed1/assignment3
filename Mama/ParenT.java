package Mama;

public class ParenT {

    protected String name;
    protected int age;

    public ParenT(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void showDetails()
    {
        System.out.println("name:"+name);

        System.out.println("age:"+age);
    }
    public final void displaymesage()
    {
        System.out.println("this is the final method in parentclass");
    }
}
