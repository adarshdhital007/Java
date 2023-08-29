public class ReferencetoPrimitive {
    public static void main(String[] args) {
        int [] mak = new int[1];
        mak[0]=10;
        System.out.println("Before changing : ");
        System.out.println(mak[0]);
        System.out.println("After changing : ");
        changeitMak(mak);
        System.out.println(mak[0]);
    }
    static void changeitMak(int []p){
        p[0]=7;
    }
}
