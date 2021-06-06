import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

    private Problem1 problem1Instance = new Problem1();

    @Test
    public void subArrayInTheMiddle() {
        int[] ret = problem1Instance.find_continuous_k(new int[]{1, 3, 2, 5, 7, 2}, 14);
        int[] expectedResult = new int[] {2, 5, 7};
        Assert.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void startingWithSubArray() {
        int[] ret = problem1Instance.find_continuous_k(new int[]{1, 3, 2, 5, 7, 2}, 4);
        int[] expectedResult = new int[] {1, 3};
        Assert.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void finishingWithSubArray() {
        int[] ret = problem1Instance.find_continuous_k(new int[]{1, 3, 2, 5, 7, 2}, 9);
        int[] expectedResult = new int[] {7, 2};
        Assert.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void subArrayWithOneIntIntTheMiddle() {
        int[] ret = problem1Instance.find_continuous_k(new int[]{1, 3, 5, 2, 13}, 5);
        int[] expectedResult = new int[] {5};
        Assert.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void subArrayWithOneIntInTheBegin() {
        int[] ret = problem1Instance.find_continuous_k(new int[]{1, 2, 5, 2, 13}, 1);
        int[] expectedResult = new int[] {1};
        Assert.assertArrayEquals(ret, expectedResult);
    }

    @Test
    public void subArrayWithOneIntIntTheEnd() {
        int[] ret = problem1Instance.find_continuous_k(new int[]{1, 3, 5, 2, 13}, 13);
        int[] expectedResult = new int[] {13};
        Assert.assertArrayEquals(ret, expectedResult);
    }

}