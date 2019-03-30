package Array_Sum;
public class MainClass {
    public static void main(String[] args) {
        ThreadClass1 t1=new ThreadClass1();
        ThreadClass2 t2=new ThreadClass2();
        t1.start();
        try {
            Thread.sleep(10);
        }catch (Exception e){
        }
        t2.start();
    }
}
