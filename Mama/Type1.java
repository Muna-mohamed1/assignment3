package Mama;

public class Type1 implements ObjectBehavior{
    private int Attribute=100;
     private  String details="detail1";

    @Override
    public void performAction() {
        System.out.println("Type1 is perfoming action");
    }

    @Override
    public void haltAction() {
        System.out.println("Type1 halted the action");
    }

    @Override
    public int getAttributes() {
        return Attribute;
    }

    @Override
    public String getType() {
        return "Type1";
    }

    public String getDetail1() {
        return details;
    }
}

