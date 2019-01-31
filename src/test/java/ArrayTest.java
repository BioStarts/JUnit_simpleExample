import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ArrayTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0},{1,2,3},
                {1, 1, 2},
        });
    }
    private int[] a;
    private int[] b;
    public ArrayTest(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }


    @Before
    public void prepare() {
        ArraysForTests arr = new ArraysForTests();
    }

    @Test
    public void tastNewArr() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {1, 2,4, 3, 5,4, 6};
        int[] res = {6};
        Assert.assertArrayEquals(res,arr.newArr(ex));
    }

    @Test(expected = RuntimeException.class)
    public void tastArrException() {
        ArraysForTests arr = new ArraysForTests();
        int[] ex = {1, 2, 3, 5, 6};
        arr.newArr(ex);
    }
}
