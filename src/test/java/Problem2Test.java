import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    private Problem2 problem2Instance = new Problem2();

    @Test
    public void longestSubstringInTheBegin() {
        int ret = problem2Instance.lengthOfLongestSubstring("abcedexx");
        int expectedResult = 5;
        Assert.assertEquals(ret, expectedResult);
    }

    @Test
    public void longestSubstringInTheEnd() {
        int ret = problem2Instance.lengthOfLongestSubstring("abrkaabcdefghij");
        int expectedResult = 10;
        Assert.assertEquals(ret, expectedResult);
    }

    @Test
    public void longestSubstringInTheMiddle() {
        int ret = problem2Instance.lengthOfLongestSubstring("abrkaabcdefghijjxxx");
        int expectedResult = 10;
        Assert.assertEquals(ret, expectedResult);
    }

    @Test
    public void longestSubstringWithTheSameCharacter() {
        int ret = problem2Instance.lengthOfLongestSubstring("aaaaaa");
        int expectedResult = 1;
        Assert.assertEquals(ret, expectedResult);
    }

    @Test
    public void longestSubstringWithOneCharacter() {
        int ret = problem2Instance.lengthOfLongestSubstring("a");
        int expectedResult = 1;
        Assert.assertEquals(ret, expectedResult);
    }

}
