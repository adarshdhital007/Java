import java.io.*;
//Reading from the keyboard
public class Demo1 {
    public static void main(String [] args) throws IOException{
      InputStreamReader is = new InputStreamReader(System.in);
      BufferedReader  br = new BufferedReader(is);
      System.out.println("Enter the data from keyboard : ");
      String s= br.readLine();
      System.out.println("Output is : "+s);
    }
}
