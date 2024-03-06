import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        //GET INPUT FROM USER
        Scanner n = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int age = n.nextInt();
        System.out.print("Enter a day number: ");
        int day = n.nextInt();

        //IF STATEMENT
        if (age > 18)
        {
            System.out.println("You are adult!");
        }
        else if (age == 18)
        {
            System.out.println("You are 18!");
        }
        else
        {
            System.out.println("You are child!");
        }

        //SWITCH STATEMENT
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                //GET USER INPUT
                System.out.print("Is saturday class or free: ");
                n.nextLine();
                String work = n.nextLine();
                n.close();

                //CHECK SATURDAY FREE OR NOT
                switch (work) {
                    case "CLASS":
                    case "Class":
                    case "class":
                        System.out.println("Class day");
                        break;
                    case "FREE":
                    case "Free":
                    case "free":
                        System.out.println("Free day");
                        break;
                }
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("It's not a day");
        }
    }
}
