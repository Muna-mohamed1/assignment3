package Mama;

public class main {
    public static void main(String[] args) {

    Pap P=new Pap(24,"muna",23.9);

    multi M= new multi(25,"shafe","nursing");

    P.getDetails();
    M.getDetails();

    double resultA=P.compute(20);
     double resultB=M.compute(5);

        System.out.println("compute value is:"+resultA);
        System.out.println("compute value is:"+resultB);
    }
}
