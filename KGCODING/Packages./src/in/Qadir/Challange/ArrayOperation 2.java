package in.Qadir.Challange;

import java.util.Arrays;

public class ArrayOperation {
    private int[] number;

    public ArrayOperation(int[] number) {
        this.number = number;
    }

    public class Statics {
        public double mean() {
            double sum = 0;
            for (int i : number) {
                sum += i;
            }
            return sum / number.length;
        }

        public double median() {
            Arrays.sort(number);
            int n = number.length;
            if (n % 2 == 0)
                return (number[n/2 - 1] + number[n/2]) / 2.0;
            else
                return number[n/2];
        }
    }
}