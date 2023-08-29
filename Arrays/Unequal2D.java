public class Unequal2D {
    public static void main(String[] args) {
        int [][] town = new int [3][];
        town[0] = new int[1];
        town[1] = new int[2];
        town[2] = new int[3];

        int i,j,k=0;
        for(i=0;i<3;i++){
            for(j=0;j<=i;j++){
                town[i][j]=k;
                k++;
            }
        }
            for(i=0;i<3;i++){
                for(j=0;j<=i;j++){
                    System.out.print(town[i][j]+" ");
                }
                System.out.println();
            }
    }
}
