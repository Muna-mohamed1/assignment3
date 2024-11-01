package Mama;

import java.util.ArrayList;
import java.util.List;

public class Main2
{
    public static void main(String[] args) {

        List<ObjectBehavior> objects = new ArrayList<>();
        objects.add(new Type1());
        objects.add(new Type2());
        objects.add(new Type3());

        for (ObjectBehavior obje : objects) {
            obje.performAction();
            System.out.println("Attribute:" + obje.getAttributes());
            System.out.println("Type:" + obje.getType());

            if (obje instanceof Type1) {
                System.out.println("Detail1:" + ((Type1) obje).getDetail1());
            } else if (obje instanceof Type2) {
                System.out.println("Detail1:" + ((Type2) obje).getDetail2());
            } else if (obje instanceof Type3) {
                System.out.println("Detail1:" + ((Type3) obje).getDetail3());
            }
            obje.haltAction();
            System.out.println();
        }
    }
}