package ThreadSynchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        mythread obj1 = new mythread();
        op a = new op();
        obj1.setname("one", a);
        mythread obj2 = new mythread();
        obj2.setname("two", a);

        obj1.start();
        obj2.start();
        obj1.join();
        obj2.join();

        System.out.println(a.num);
    }
}

class mythread extends Thread {

    String ThreadName = "";
    op a;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            a.operation(5, ThreadName);
            System.out.println(a.num);
            try {
                sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void setname(String name, op x) {
        ThreadName = name;
        a = x;

    }
}

class op {

    int num = 12;

    synchronized  public void operation(int num, String ThreadName) {
        if (ThreadName.equalsIgnoreCase("One")) {

            this.num += 3;
        } else {
            this.num -= 2;
        }
    }
}

