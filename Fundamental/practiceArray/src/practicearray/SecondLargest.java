/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 9:37:58 pm
 */
package practicearray;

public class SecondLargest {
    public static void main(String args[]){
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        
        if (a.length < 2) {
            System.out.println("Second largest is not possible.");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;  // ✅ previous max becomes 2nd largest
                max1 = a[i];  // ✅ new max found
            } else if (a[i] > max2 && a[i] < max1) {
                max2 = a[i];  // ✅ new second largest
            }
        }

        if (max2 == Integer.MIN_VALUE)
            System.out.println("All elements are equal. Second largest not possible.");
        else
            System.out.println("Second largest: " + max2);
    }
}