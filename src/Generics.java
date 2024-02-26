//FIRST WAY (NORMAL)
class A{
    void print(String s){
        System.out.println(s);
    }
}
class B{
    void print(int i){
        System.out.println(i);
    }
}

//SECOND WAY (USING OBJECT)
class C{
    void print(Object o){
        Double d_value = (Double) o; //typecasting
        System.out.println(o);
    }
}

//THIRD WAY (USING GENERICS)
class D<T>{
    void print(T x){
        T y = (T) x;
        System.out.println(y);
    }

    Object[] T_array = new Object[2];
    void print_array(){
        for(int i = 0; i<2; i++){
            System.out.println((T) T_array[i]);
        }
    }
}

public class Generics {
    public static void main(String[] args) {

        //FIRST WAY
            System.out.println("First way:");
        A a_object = new A();
        a_object.print("String");
        B b_object = new B();
        b_object.print(10);
            System.out.println();

        //SECOND WAY
            System.out.println("Second way:");
        C c_object = new C();
        c_object.print(1.1);
        //c_object.print("hello"); //CANNOT DO THAT
            System.out.println();

        //THIRD WAY
            System.out.println("Third way");
        D<String> T_object_1 = new D();
        T_object_1.print("Hello");
        D<Integer> T_object_2 = new D();
        T_object_2.print(11);
            System.out.println();

        //THIRD WAY (ARRAY)
        D<Integer> T_array_object = new D();
        T_array_object.T_array[0] = 10;
        T_array_object.T_array[1] = 11;
        T_array_object.print_array();
    }
}
