package Assignment2.UseofTryCatch_Throw_Throws.Throws;

public class ThrowsEX2 {
    public static void main(String[] args) throws ArithmeticException {
        try {
            for(int i=2;i>=-5;i--){
                System.out.println(10/i);
            }
        }catch (ArithmeticException ae)
        {
            System.out.println("aa");
        }

        System.out.println("ss");
    }
}
