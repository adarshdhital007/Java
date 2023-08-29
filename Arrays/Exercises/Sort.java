import java.io.*;

public class Sort {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i=0,j,temp;
        int arr[]= new int[4];
        System.out.println("Enter the array elements : ");
        for(i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
            for(j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Output is: ");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    
    }    
}
