package Recursion;
import java.util.Scanner;

public class Binary_Convert {

    //CREATE CONVERTOR FOR CONVERT DENARY NUMBERS TO BINARY NUMBERS
    void convert(int number){
        if(number > 0){
            convert(number/2);
            System.out.print(number%2);
        }
    }

    public static void main(String[] args) {

        //CREATE OBJECTS
        Binary_Convert converter = new Binary_Convert();
        Scanner input = new Scanner(System.in);

        //GET USER INPUT NUMBER
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        //CALL 'convert' METHOD WITH 'number' ARGUMENT
        converter.convert(number);

    }
}
