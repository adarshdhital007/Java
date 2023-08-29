import java.io.*;

public class Smallest {
    public static void main(String[] args)throws Exception {
        int i,j,temp=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int [] ar = new int[5];
        System.out.println("Enter the elements : ");
        for(i=0;i<5;i++){
            ar[i]=Integer.parseInt(br.readLine());
            for(j=0;j<5;j++){
                if(ar[i]<ar[j]){
                    temp=ar[j];
                    ar[j]=ar[i];
                    temp=ar[i];
                }
            }
        }
         System.out.println("Smallest is : "+temp);
    }
}
