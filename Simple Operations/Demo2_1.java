import java.util.Scanner;
//Floating point number
public class Demo2_1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a floating point number : ");
        float i = sc.nextFloat();
        System.out.println("Output is "+i);
        sc.close();
    }
}