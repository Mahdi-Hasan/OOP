package Assignment2.UseofTryCatch_Throw_Throws.Throw;

public class ThrowEx1 {
    static  void throwf(){
        try {
            throw new ArrayIndexOutOfBoundsException("arr");
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Array index exception");
            throw ae;
        }
    }

    public static void main(String[] args) {
        try {
            throwf();
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Rethrown");
        }
    }

}
