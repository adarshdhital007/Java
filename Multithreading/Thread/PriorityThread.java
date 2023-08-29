class X implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread()+"Hello X");
    }
}
public class PriorityThread {
    public static void main(String[] args) {
        X o = new X();
        Thread t1 = new Thread(o,"1st");
       // t1.setPriority(8);
        System.out.println(t1.getPriority());
        t1.start();
    }
}

/*
 If you want to set the priority of a thread then , do this:
        t1.setPriority(8);
 */