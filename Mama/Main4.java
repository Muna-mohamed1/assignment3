package Mama;

public class Main4 {
    public static void main(String[] args) {
       Child1 C1=new Child1("nasta",21,"somali",12);
       Child2 C2=new Child2("shafe",23,"design","Engineering");

       C1.showDetails();
       C2.showDetails();

       utilityclas ut=new utilityclas();
       ut.identifyObjectType(C1);
       ut.identifyObjectType(C2);
    }
}
