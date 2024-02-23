package Keywords;

//CREATE CLASS USING 'final' KEYWORD
//(CAN'T INHERIT WITH OTHER CLASSES)
final class class_answer{

    //CREATE METHOD USING 'final' KEYWORD
    //(CAN'T OVERRIDING)
    final void method_answer(){
        System.out.println("True");
    }
}

public class final_Answer {
    public static void main(String[] args) {

        //CAN'T CHANGE 'var_answer' VALUE
        final boolean var_answer = true;
        //var_answer = false;   CAN'T DO THAT

    }
}
