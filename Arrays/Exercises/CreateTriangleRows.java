import java.io.*;

public class CreateTriangleRows {
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number of rows : ");
            int r=Integer.parseInt(br.readLine());

            char c[][] = new char [r][];
            for(int k=0;k<r;k++){
                c[k]= new char[k+1];
            }
            for(int k=0;k<r;k++){
                for(int j=0;j<=k;j++){
                    if(j==0)
                    c[k][j] ='7';

                    else if(j==k)
                    c[k][j] ='7';

                    else if(k==(r-1))
                    c[k][j] ='7';

                    else
                    c[k][j] ='7';
                }
            }
            for(int k=0;k<r;k++){
                for(int j=0;j<=k;j++)
                System.out.print(c[k][j]);
                System.out.println(" ");
            }
        }
        catch(IOException ie){

        }
    }
}
