import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {


    @Test
    public void tastNewArr1() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {1, 2,4, 3, 5,4, 6};
        int[] res = {6};
        Assert.assertArrayEquals(res,arr.newArr(ex));
    }

    @Test
    public void tastNewArr2() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {1, 2,4, 3, 5,4, 4};
        int[] res = {};
        Assert.assertArrayEquals(res,arr.newArr(ex));
    }

    @Test
    public void tastNewArr3() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {4, 2, 6};
        int[] res = {2,6};
        Assert.assertArrayEquals(res,arr.newArr(ex));
    }

    @Test(expected = RuntimeException.class)
    public void tastArrException() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {1, 2, 3, 5, 6};
        arr.newArr(ex);
    }

    @Test
    public void tastNewArrOnly1() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {4,4, 4};
        boolean res = true;
        Assert.assertEquals(false, arr.newArrOnlyOneAndFour(ex));
    }

    @Test
    public void tastNewArrOnly2() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {1,4, 4};
        boolean res = true;
        Assert.assertEquals(true, arr.newArrOnlyOneAndFour(ex));
    }

    @Test
    public void tastNewArrOnly3() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {1,2, 4};
        boolean res = true;
        Assert.assertEquals(false, arr.newArrOnlyOneAndFour(ex));
    }

}
