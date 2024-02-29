package More_Arguments;

public class To_do_list {
    int list_no = 1;

    //CREATE METHOD FOR COLLECT ALL THE ARGUMENTS
    void addList(String... works) {
        for(String work: works)
        {
            System.out.println(list_no +": " + work);
            list_no++;
        }
    }

    public static void main(String[] args) {

        //CREATE OBJECT AND CALL FEW TIMES THE 'addList' METHOD WITH ARGUMENTS
        To_do_list list = new To_do_list();
        list.addList("Get up at 7am", "Meditation 20min", "Get breakfast and go to the work");
        list.addList("Buy a new Laptop");

    }
}
