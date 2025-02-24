package Inheritance;

//CREATE CLASSES
class Class_01{}
class Class_02{}

//CREATE INTERFACES
interface Interface_01{}
interface Interface_02{}
interface Interface_03{}

public class Class_Interface_Inheritance {

    //A CLASS CAN'T MULTIPLE INHERIT WITH ANOTHER TWO OR MORE CLASSES
    //A CLASS CAN MULTIPLE INHERIT WITH ONE CLASS(extends) AND MORE INTERFACES(implements)
    static class Class_Class_Interface extends Class_01 implements Interface_01, Interface_02{}

    //A CLASS CAN MULTIPLE INHERIT WITH MORE INTERFACES(implements)
    static class Class_Interface_Interface implements Interface_01, Interface_02, Interface_03{}

    //INTERFACE CAN MULTIPLE INHERIT MORE INTERFACES(extends)
    interface Interface_Interface_Interface extends Interface_01, Interface_02, Interface_03{}
}

