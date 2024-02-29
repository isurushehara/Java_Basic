package Collections;
//IMPORT THE ARRAYLIST CLASS
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        //CREATE ARRAYLIST OBJECT
        ArrayList array_list = new ArrayList();

        //ADD METHODS
        array_list.add(10);
        array_list.add(11);
        array_list.add(12);
        array_list.add(13);
        array_list.add(14);
        array_list.add("Index");
        array_list.add(0, "Index 0");

        array_list.remove(2);
        array_list.remove("Index");
        array_list.removeFirst();
        array_list.removeLast();


        //PRINT THE ARRAYLIST
        //WAY 01
        System.out.println("Array List: " +array_list);
        //WAY 01(ACCESS THE ELEMENTS)
        for(Object x: array_list){
            System.out.print(x +" ");
        }
        System.out.println();

        //WAY 03
        array_list.forEach(x -> System.out.print(x +" "));
        System.out.println();
        System.out.println();

        //ARRAYLIST METHODS
        System.out.println("Contains: " +array_list.contains(3));
        System.out.println("Get: " +array_list.get(1));
        System.out.println("Index of '12': " +array_list.indexOf(12));
        System.out.println("Size: " +array_list.size());
    }
}
