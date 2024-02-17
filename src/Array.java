public class Array {
    public static void main(String[] args) {

        //INTEGER ARRAY
        int[] numbers = {2,4,6,8};  // CAN'T CHANGE SIZE AFTER DECLARE

        //PRINT 'NUMBERS' ARRAY
        System.out.println("* Print number array #01");
        for(int i = 0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        //PRINT 'NUMBERS' ARRAY USING ANOTHER WAY
        System.out.println("* Print number array #02");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println();
        int[] nums = new int[5];
        nums[0] = 1;
        System.out.println("* Integer Array");
        System.out.println("Initialed element: " +nums[0]);
        System.out.println("Didn't initialed element: " +nums[1]);
        System.out.println();

        //STRING ARRAY
        String[] names = new String[5];
        names[0] = "sunil";
        names[1] = "kasun";
        System.out.println("* String Array");
        System.out.println("Initialed element: " +names[0]);
        System.out.println("Didn't initialed element: " +names[2]);
        System.out.println();

        //2D ARRAY
        int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("* 2D Array [0][0] element: " +x[0][0]);


    }
}
