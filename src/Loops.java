public class Loops {
    public static void main(String[] args) {

        //WHILE LOOP
        System.out.println("While loop");
        int i = 0;
        while(i<=10)
        {
            System.out.println(i);
            i += 2;
        }

        //DO WHILE LOOP
        System.out.println();
        System.out.println("Do While loop");
        int j = 100;
        do{
            System.out.println(j);
            j += 2;
        }while(j <= 10); //Always false

        //FOR LOOP
        System.out.println();
        System.out.println("For loop");
        for(int k = 1; k<=3; k++)
        {
            System.out.println(k);
        }
    }
}
