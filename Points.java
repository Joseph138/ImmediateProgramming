import java.util.Arrays;
import java.util.Scanner;
public class Points {
    public static void main(String [] args){
                Scanner input = new Scanner(System.in);
                System.out.println("How many pairs of x and y do you want to enter");
                int amount = input.nextInt();

                double[][] points = new double[amount][2]; //amount is the number
        // of pairs and 2 is x and y

        for(int i = 0; i < amount; i++ )
        {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();

        /**
         * index of number 1 of the first array is points[0][0]
         * index of number 2 of the first array is points[0][1]
         * index of number  5 of the second array is points[1][0]
         * index of number 6 of the second array is points[1][1]
         *
         * {{1,2},
         * {5,6},
         * {4,8}}
         */
//        int x = input.nextInt();
//                int y= input.nextInt();
//                int [][]pairs = [x][y];
//                for(int i = 0; i < pairs.length;i++){
//                    for(int j = 0; j < pairs[i].length; j++){
//
//                    }
                }
       System.out.println("The output of your pairs are " + Arrays.deepToString(points));
   }
}
