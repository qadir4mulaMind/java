/**
 * @author Abdul Qadir
 * @date 18 Nov 2025
 * @time 2:15:28 am
 */
package practicearray;
public class Array2DPracice {
    public static void main(String args[]){
        int a[][] = new int[5][5];
        int b[][] = {{1, 2, 3,}, {2, 4, 6}, {1, 3, 5}};
        int c[][];
        c = new int[5][5];
        int [][]d = new int[5][5];
        int e[][];
        int []f[] = new int[5][5];
        int[][] g = new int[2][2];
        int[] h, i[];
        h = new int[5];
        i = new int[5][5];
        for(int x = 0; x < b.length; x++){
            for(int y = 0; y < b[0].length; y++){
                System.out.print(b[x][y] + " ");
            }
            System.out.println("");
        }
        for(int x[] : b){
            for(int y : x) System.out.print(y + " ");
            System.out.println();
        }
        System.out.println(b);
        int j[][];
        j = new int[3][];
        j[0] = new int[3];
        j[1] = new int[5];
        j[2] = new int[4];
        for(int m = 0; m < j.length; m++){
            for(int n = 0; n < j[m].length; n++) System.out.print(j[m][n] + " ");
            System.out.println();
        }
        for(int x[] : j){
            for(int y : x) System.out.print(y + " ");
            System.out.println();
        }
    } 
}