import java.lang.Thread;

class X implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
        Thread.yield();
        System.out.println(Thread.currentThread());
    }
}

public class YieldwithPriority {
    public static void main(String[] args) {
        X o = new X();
        X p = new X();

        Thread t1 = new Thread(o, "1st");
        Thread t2 = new Thread(p, "2nd");

        t1.setPriority(3);
        t2.setPriority(9);
        t1.start();
        t2.start();
    }
}
