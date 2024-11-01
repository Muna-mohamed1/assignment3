package Mama;

public class Type2 implements ObjectBehavior{
    private int Attribute=200;
    private  String detail="detail2";

    @Override
    public void performAction() {
        System.out.println("Type2 is perfoming action");
    }

    @Override
    public void haltAction() {
        System.out.println("Type2 halted the action");
    }

    @Override
    public int getAttributes() {
     return Attribute;
    }

    @Override
    public String getType() {
       return "Type2";
    }

    public String getDetail2() {
        return detail;
    }
}

