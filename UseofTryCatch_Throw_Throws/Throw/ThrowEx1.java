package Assignment2.UseofTryCatch_Throw_Throws.Throw;

public class ThrowEx1 {
    static  void throwf(){
        try {
            for(int i=2;i>-3;i--) {
                System.out.println(10 / i);
                if(i==0)
                throw new ArithmeticException("arr");
            }
        }catch (ArithmeticException ae){
            System.out.println("Arithmathic Exception Catched");
            throw ae;
        }
    }

    public static void main(String[] args) {
        try {
            throwf();
        }catch (ArithmeticException ae){
            System.out.println("Rethrown");
        }
    }

}
