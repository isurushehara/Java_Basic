package Static_Type;

public class Phone {

    //USING STATIC
    static String name1;
    static String name2;
    static String name3;

    static void call1() {
        System.out.println("Call: " +name1);
    }
    static void call2() {
        System.out.println("Call: " +name2);
    }
    static void call3() {
        System.out.println("Call: " +name3);
    }

        //USING OBJECT
        String name;
        void call(){
            System.out.println("Call : " +name);
        }

    //USING PARAMETER AND ARGUMENT
    void call(String name){
        System.out.println("Call : " +name);
    }

    public static void main(String[] args) {
        //USING STATIC
        name1 = "Vivo";
        name2 = "Nokia";
        name3 = "Iphone";
        call1();
        call2();
        call3();

        System.out.println();

            //USING OBJECT
            Phone phone1 = new Phone();
            Phone phone2 = new Phone();
            Phone phone3 = new Phone();
            phone1.name = "Vivo";
            phone2.name = "Nokia";
            phone3.name = "Iphone";
            phone1.call();
            phone2.call();
            phone3.call();

        System.out.println();

        //USING PARAMETER AND ARGUMENT
        Phone phone = new Phone();
        phone.call("Vivo");
        phone.call("Nokia");
        phone.call("Iphone");

    }

}
