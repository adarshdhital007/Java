public class Swap2 {
    int x;
    public static void main(String[] args) {
        Swap2 a = new Swap2();
        a.x = 1;
        Swap2  b = new Swap2();
        b.x=2;
        valueSwap(a,b);
        System.out.println(a.x);
        System.out.println(b.x);
    }
    static void valueSwap(Swap2 k, Swap2 l){
        Swap2 temp;
        temp=k;
        k=l;
        l=temp;
    }
}
