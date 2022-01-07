package exercises.lecture2;

import java.util.ArrayList;

public class SumIntegers {
    public static Integer getSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i=0; i< numbers.size(); i++) {
            sum += i;
        }
        return sum;
    }
}
