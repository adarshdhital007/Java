public class Multidimensional {
    public static void main(String[] args) {
        /* 
        Here town = new int [4][] , the number of rows represent
        the number of integer refrences to which town is pointing

       Here the number of columns represents the 
       length of the integer array to which each 
       element of the array of references points
        */
        
        int [][] town = new int [4][];
        System.out.println(town[0]);//null
        System.out.println(town[1]);
        System.out.println(town[2]);
        System.out.println(town[3]);
    }
}
