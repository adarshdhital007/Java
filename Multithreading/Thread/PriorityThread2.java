class X implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread()+"Hello X");
    }
}
/*
 Here the thread scheduler is selecting t2 instead of t1 to be completed
 first. After t2 exits, t1 starts execution
 */
public class PriorityThread2 {
    public static void main(String[] args) {
        X o = new X();
        X p = new X();

        Thread t1 = new Thread(o,"1st");
        Thread t2 = new Thread(o,"2nd");
        t1.setPriority(2);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
