import java.util.Scanner;

public class Arithmetic_Operators {
    public static void main(String[] args) {
        //CREATE SCANNER OBJECT
        Scanner n = new Scanner(System.in);
        //DECLARE VARIABLES
        double user_input_number1, user_input_number2, answer_add, answer_sub, answer_multi, answer_div, answer_mod;

        //GET USER INPUT
            System.out.print("Enter First Number :");
        user_input_number1 = n.nextDouble();
            System.out.print("Enter Second Number :");
        user_input_number2 = n.nextDouble();

        //CLOSE THE CONNECTION
        n.close();

        //OPERATIONS
        answer_add = user_input_number1 + user_input_number2;
        answer_sub = user_input_number1 - user_input_number2;
        answer_multi = user_input_number1 * user_input_number2;
        answer_div = user_input_number1 / user_input_number2;
        answer_mod = user_input_number1 % user_input_number2;

            //PRINTS ANSWERS
            System.out.println("Add answer is " + answer_add);
            System.out.println("Sub answer is " + answer_sub);
            System.out.println("Multi answer is " + answer_multi);
            System.out.println("Div answer is " + answer_div);
            System.out.println("Mod answer is " + answer_mod);

        System.out.println();

        //INCREMENT
        int x , y;
        //x = x + 1;

        //POST INCREMENT
        System.out.println("Post Increment");
        x = 10;
        y = x++;
            System.out.println("X = " +x);
            System.out.println("Y = " +y);

        //PRE INCREMENT
        System.out.println("Pre Increment");
        x = 10;
        y = ++x;
            System.out.println("X = " +x);
            System.out.println("Y = " +y);

        //MORE THAN ONE INCREMENT
        System.out.println();
        System.out.println("X = 5");
        x = 5;
        x += 5; //x = x + 5;
            System.out.println("X += 5: " +x);
    }
}
