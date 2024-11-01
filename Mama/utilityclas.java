package Mama;

public class utilityclas {

    public void identifyObjectType(ParenT obj)
    {

    if (obj instanceof Child1)
    {
            System.out.println("obj is an instance of Child1");
        }
        else if (obj instanceof Child2)
        {
            System.out.println("obj is an instance of Child2");
        }
        else
        {
            System.out.println("obj is an instance of ParenT");
        }
    }
}
