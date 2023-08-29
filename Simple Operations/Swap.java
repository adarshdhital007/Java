public class Swap {
    int x;
    public static void main(String[] args) {
        Swap a = new Swap();
        a.x=1;
        Swap b = new Swap();
        b.x=2;

        valueSwap(a,b);
        System.out.println(b.x);
        System.out.println(a.x);
    }
    static void valueSwap(Swap k, Swap l){
        int i = k.x;
        k.x = l.x;
        l.x=i;
    }
}
