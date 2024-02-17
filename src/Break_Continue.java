public class Break_Continue {
    public static void main(String[] args) {

        for(int i = 1; i<=10; i++)
        {
            //CONTINUE
            if(i==3)
            {
                System.out.println("Skip value 3");
                continue;   //SKIP PRINT VALUE '3'
            }

            //BREAK
            if(i==6)
            {
                System.out.println("Break the loop when i=6");
                break;      //WHEN i=6, BREAK THE LOOP
            }

            System.out.println(i);
        }
    }
}
