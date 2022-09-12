public class Main{
     public static void main(String []args){
        int[][] array = new int[2][3];
        int[][] array2 = new int[3][2];
        
        System.out.println("Matris");
        
        int num = 1;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = num++;
                System.out.print(array[i][j] + "  ");
            }
            
            System.out.println();
        }
        
        System.out.println("Matrisin Transpozu");
        
        for(int i = 0; i < array.length + 1; i++) {
            for(int j = 0; j < array.length; j++) {
                array2[i][j] = array[j][i];
                System.out.print(array2[i][j] + "  ");
            }
            
            System.out.println();
        }
     }
}