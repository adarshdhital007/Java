import java.util.Scanner;
//Using Scanner
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int i=sc.nextInt();
        System.out.println("Output is : "+i);
        sc.close();
    }
}
