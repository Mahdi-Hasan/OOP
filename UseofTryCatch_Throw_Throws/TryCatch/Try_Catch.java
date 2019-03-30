package Assignment2.UseofTryCatch_Throw_Throws.TryCatch;

public class Try_Catch {
    public static void main(String[] args) {
        String str = null;
        int arr[] = new int[4];
        try {
            System.out.print(str.length());
            System.out.println("arr = " + arr[5]);
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Array index OUt of Bound Ex.Handled");

        }
        catch (NullPointerException n) {
            System.out.println("NullPointerException Handled");
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException handled");
        }
    }
}
