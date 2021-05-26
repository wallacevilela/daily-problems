import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem1Test {

    private Problem1 p = new Problem1();

    @Test
    public void cenario1() {
        int[] ret = p.find_continuous_k(new int[]{1, 3, 2, 5, 7, 2}, 14);
        int[] expectedResult = new int[] {2, 5, 7};
        Assertions.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void cenario2() {
        int[] ret = p.find_continuous_k(new int[]{1, 2, 5, 2}, 4);
        int[] expectedResult = new int[] {2, 2};
        Assertions.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void cenario3() {
        int[] ret = p.find_continuous_k(new int[]{1, 2, 5, 2, 13}, 13);
        int[] expectedResult = new int[] {13};
        Assertions.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void cenario4() {
        int[] ret = p.find_continuous_k(new int[]{1, 3, 5, 2, 13}, 19);
        int[] expectedResult = new int[] {1, 5, 13};
        Assertions.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void cenario5() {
        int[] ret = p.find_continuous_k(new int[]{1, 8, 5, 3, 13, 4}, 23);
        int[] expectedResult = new int[] {1, 5, 13, 4};
        Assertions.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void cenario6() {
        int[] ret = p.find_continuous_k(new int[]{5, 1, 1, 13, 1, 4}, 22);
        int[] expectedResult = new int[] {5, 13, 4};
        Assertions.assertArrayEquals(ret, expectedResult);
    }
}