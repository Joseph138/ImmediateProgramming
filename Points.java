import java.util.Arrays;
import java.util.Scanner;
public class Points {
    public static void main(String [] args){
                Scanner input = new Scanner(System.in);
                System.out.println("How many pairs of x and y do you want to enter");
                int amount = input.nextInt();
                int x = input.nextInt();
                int y= input.nextInt();
                int [][]pairs = [x][y];
                for(int i = 0; i < pairs.length;i++){
                    for(int j = 0; j < pairs[i].length; j++){

                    }
                }
       System.out.println("The output of your pairs are " + Arrays.deepToString(pairs));
   }
}
