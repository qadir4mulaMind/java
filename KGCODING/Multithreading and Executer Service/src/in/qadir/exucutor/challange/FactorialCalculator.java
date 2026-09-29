package in.qadir.exucutor.challange;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class FactorialCalculator implements Callable<Integer> {
    private int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}