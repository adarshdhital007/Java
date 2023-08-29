import java.io.*;

public class Traingle2 {
    public static void main(String[] args) {
        try{
            BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number of rows : ");

            int r=Integer.parseInt(br.readLine());
            char c[][] = new char [r][r];
            for(int k=0;k<r;k++){
                for(int j=0;j<r;j++){
                    if(j<k)
                    c[k][j]=' ';

                    else
                    c[k][j]='7';
                }
            }
            System.out.println("See the Structure : ");
            for(int k=0;k<r;k++){
                for(int j=0;j<r;j++){
                    System.out.print(c[k][j]);
                }
                System.out.println();
            }
        }
        catch(IOException ie){
        }
    }
}
