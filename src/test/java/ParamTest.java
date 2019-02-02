import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParamTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[] {1,2,3,4,5}, new int[] {5}},
                {new int[] {1,4,3,4,6,7}, new int[] {6,7}},
                {new int[] {4,3,3,5}, new int[] {3,3,5}},
                {new int[] {1,2,3,4}, new int[] {}},
        });
    }

    private int[] a;
    private int[] b;

    public ParamTest(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }
    @Test
    public void tastNewArr1() {
        ArraysForTests arr = new ArraysForTests();
        Assert.assertArrayEquals(b,arr.newArr(a));
    }
}

