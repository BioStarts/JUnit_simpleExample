import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void tastNewArr() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {1, 2,4, 3, 5,4, 6};
        int[] res = {6};
        Assert.assertArrayEquals(res,arr.newArr(ex));
    }
}
