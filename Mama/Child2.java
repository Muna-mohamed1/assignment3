package Mama;

public class Child2 extends ParenT{
    String hobby;
    String Faculty;

      public Child2(String name,int age,String hobby,String faculty){
          super(name,age);
          this.hobby=hobby;
          this.Faculty=faculty;
      }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("hobby:"+hobby);
        System.out.println("age:"+age);
    }
}
