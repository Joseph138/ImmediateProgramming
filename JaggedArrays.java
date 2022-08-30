import java.util.Arrays;
public class JaggedArrays {
    public static void main(String [] args){
        int [][]y = {
            {1,2,3},
            {4,5},
                {6}
        };
        System.out.println(Arrays.toString(rowLengths(y)));
    }
    public static int[] rowLengths(int [][] a){
        int [] answer = new int[a.length];
        for(int i = 0; i < a.length; i++){
            answer[i] = a[i].length;
        }
        return answer;
    }
}
