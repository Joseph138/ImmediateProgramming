package ExceptionHandling;

/**
 * the purpose of this demo is to show the OutOfBoundException for an
 * Array value.
 * This will show how the exception is handled and return an output to the user.
 */
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
        java.util.Scanner input = new java.util.Scanner(System.in);
        int lastIndex = 0;
            try {
                System.out.println("Enter the last index number. ");

                lastIndex = input.nextInt();
                if(lastIndex != list.length -1){
                    throw new ArrayIndexOutOfBoundsException("You put the incorrect index value, try again.");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                do{
                    lastIndex = input.nextInt();
                    if(lastIndex != 3) {
                        System.out.println("You put the incorrect index value, try again.");
                    }
                }while(lastIndex != list.length -1);
            }
        System.out.println(list[lastIndex]);
    }

}
