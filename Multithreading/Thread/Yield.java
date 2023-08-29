class X implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread());
        Thread.yield();
        System.out.println(Thread.currentThread());
    }
}
/*
 Yield is the process through which a currently executed thread goes to a ready
 state from running.If any other thread is waiting for execution,then it might get a chance for execution.
 */
public class Yield {
    public static void main(String[] args) {
        X o = new X();
        X p = new X();
        
        Thread t1= new Thread(o,"1st");
        Thread t2= new Thread(p,"2nd");
        t1.start();
        t2.start();
    }
}
/*
Thread[#20,1st,5,main]
Thread[#21,2nd,5,main]
Thread[#20,1st,5,main]
Thread[#21,2nd,5,main]
As seen from the output, first t1 starts running. When yield() method is collected,t1 remains in the waiting state
and t2 starts running.Then t2 goes to the waiting state because yield() method is invoked within it and t1 again starts executing.
However, the story becomes entirely different if one sets the priorities.
 */