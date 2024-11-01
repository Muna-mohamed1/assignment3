package Mama;


public class Type3 implements ObjectBehavior{
    private int Attribute=300;
    private  String detail="detail3";

    @Override
    public void performAction() {
        System.out.println("Type3 is perfoming action");
    }

    @Override
    public void haltAction() {
        System.out.println("Type3 halted the action");
    }

    @Override
    public int getAttributes() {
      return Attribute;
    }

    @Override
    public String  getType() {
       return "Type3";
    }


    public String getDetail3() {
        return detail;
    }
}


