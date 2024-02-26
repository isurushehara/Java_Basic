public class Wrapper_Class {
    public static void main(String[] args) {

        //PRIMITIVE TYPE VARIABLES
        int p_number = 10;

        //WRAPPER CLASS
        Integer w_number = 11;

        //WRAPPING (BOXING)
        Integer w_number_1 = Integer.valueOf(p_number);
        //AUTO WRAPPING (BOXING)
        Integer w_number_2 = p_number;

        //UNWRAPPING (UNBOXING)
        int p_number_1 = w_number.intValue();
        //AUTO UNWRAPPING (BOXING)
        int p_number_2 = w_number;
    }
}
