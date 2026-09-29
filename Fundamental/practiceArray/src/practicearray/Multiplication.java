/**
 * @author Abdul Qadir
 * @date 18 Nov 2025
 * @time 1:53:31 pm
 */
package practicearray;
public class Multiplication {
    public static void main(String args[]){
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] c = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++) c[i][j] += a[i][k] * b[k][j];
            }
        }
        for(int x[] : c){
            for(int y : x) System.out.print(y + " ");
            System.out.println();
        }
    }
}