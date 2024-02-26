package Multithreading;

//CREATE A THREAD USING 'Thread' CLASS
//(INHERIT WITH 'Thread' CLASS)
class Thread_class_class extends Thread{
    public void run(){
        System.out.println("Thread 01 (Thread class)");
    }
}

//CREATE A THREAD USING 'Runnable' INTERFACE
//(IMPLEMENTS WITH 'Runnable' INTERFACE)
class Runnable_interface_class implements Runnable{
    public void run(){
        System.out.println("Thread 02 (Runnable interface)");
    }
}

public class Multithreading_Basic {
    public static void main(String[] args) {

        //CREATE OBJECT FOR 'thread_class_class'
        Thread_class_class object_1 = new Thread_class_class();
        object_1.start();

        //CREATE OBJECT FOR 'Runnable_interface_class'
        Runnable_interface_class object_2 = new Runnable_interface_class();
        Thread o = new Thread(object_2);
        o.start();

    }
}
