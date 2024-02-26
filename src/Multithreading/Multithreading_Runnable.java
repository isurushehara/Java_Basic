package Multithreading;

//CREATE THREAD 03
class M_Third implements Runnable{
    public void run(){
        for(int i = 0; i<10; i++)
        {
            System.out.println("Third Thread");
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
//CREATE THREAD 04
class M_Fourth implements Runnable{
    public void run(){
        for(int i = 0; i<10; i++)
        {
            System.out.println("Fourth Thread");
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

public class Multithreading_Runnable {
    public static void main(String[] args) {
        //CREATE A 'M_Third' CLASS OBJECT AND CALL 'start' METHOD
        M_Third third_object = new M_Third();
        Thread third_thread = new Thread(third_object);
        third_thread.start();
        //ADD A DELAY
        try {
            Thread.sleep(50);
        }catch (Exception e){
            System.out.println();
        }
        //CREATE A 'M_Fourth' CLASS OBJECT AND CALL 'start' METHOD
        M_Fourth fourth_object = new M_Fourth();
        Thread fourth_thread = new Thread(fourth_object);
        fourth_thread.start();
    }
}
