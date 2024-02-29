package Collections;
//IMPORT LINKED LIST CLASS
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {

        //CREATE LINKED LIST
        LinkedList<String> linked_list = new LinkedList(List.of("Data1", "Data2", "Data3"));

        //ADD ELEMENTS
        linked_list.add("Data4");
        linked_list.add(1, "Data");
        linked_list.addFirst("Data0");
        linked_list.addLast("Datan");

        //REMOVE ELEMENTS
        linked_list.remove("Data");

        //PRINT THE LINKED LIST
        //WAY 01
        System.out.println(linked_list);
        System.out.println();

        //WAY 02
        linked_list.forEach(n -> {
            System.out.print(n +" ");
        });

    }
}
