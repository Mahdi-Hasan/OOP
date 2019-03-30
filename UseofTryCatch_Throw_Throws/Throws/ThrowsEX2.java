package Assignment2.UseofTryCatch_Throw_Throws.Throws;

public class ThrowsEX2 {
    public static void main(String[] args) throws ArithmeticException, InterruptedException {
        Thread.sleep(100);
      System.out.println("Exception Caught");
        for(int i=2;i>-3;i--){
            System.out.println(10/i);
        }
    }
}
