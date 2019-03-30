package Assignment2.UseofTryCatch_Throw_Throws.TryCatch;

public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                String s=null;
                System.out.println(s.charAt(89));
            }catch (IndexOutOfBoundsException n){
                System.out.println("String index out of bounds");
            }
            try {
                int ar[]=new int[5];
                int t=ar[6]/0;

            }catch (ArithmeticException a){
                System.out.println("ArithmeticException");
            }
        }catch (Exception e){
            System.out.println("Exception HAndled");
        }
    }
}
