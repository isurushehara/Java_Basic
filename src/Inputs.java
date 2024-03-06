import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        //CREATE A SCANNER OBJECT
        Scanner n = new Scanner(System.in);

        //GET USER INPUT
        System.out.print("Enter your name: ");
        String name = n.nextLine();
        System.out.println("Name is " + name); //PRINT

        System.out.print("Enter your age: ");
        int age = n.nextInt();
        System.out.println("Your are "+ age); //PRINT

        //CLOSE THE SCANNER CONNECTION
        n.close();
    }
}
