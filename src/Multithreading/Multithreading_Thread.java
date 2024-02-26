package Multithreading;

//CREATE THREAD 01
class M_First extends Thread{
    public void run(){
        for(int i = 0; i<10; i++)
        {
            System.out.println("First Thread");
            //ADD A DELAY
            try{
                Thread.sleep(250);
            }catch (Exception e)
            {
                System.out.println();
            }
        }
    }
}
//CREATE THREAD 02
class M_Second extends Thread{
    public void run(){
        for(int i = 0; i<10; i++)
        {
            System.out.println("Second Thread");
            //ADD A DELAY
            try{
                Thread.sleep(250);
            }catch (Exception e)
            {
                System.out.println();
            }
        }
    }
}

public class Multithreading_Thread {
    public static void main(String[] args) {
        //CREATE A 'M_First' CLASS OBJECT AND CALL 'start' METHOD
        M_First first_object = new M_First();
        first_object.start();
        //ADD A DELAY
        try {
            Thread.sleep(50);
        }catch (Exception e){
            System.out.println();
        }
        //CREATE A 'M_Second' CLASS OBJECT AND CALL 'start' METHOD
        M_Second second_object = new M_Second();
        second_object.start();
    }
}
