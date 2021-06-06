import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {

    public int[] find_continuous_k(int[] array, int k) {
        List<Integer> ret = new ArrayList<>();
        int sum = 0;
        int startPosition = 0;
        int count = 0;

        while (sum != k) {
            ret.clear();
            sum = 0;
            count = startPosition;

            while (sum < k
                    && count < array.length) {
                sum += array[count];
                ret.add(array[count]);
                count++;
            }

            ret.stream().forEach(i -> System.out.print(i + ", "));
            System.out.println("Sum: " + sum);
            System.out.println("----------");

            startPosition++;
        }
        return ret.stream().mapToInt(Integer::valueOf).toArray();
    }

}