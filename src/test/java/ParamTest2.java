import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParamTest2 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[] {1,2,3,4,5}, false},
                {new int[] {1,4,3,4,6,7}, false},
                {new int[] {4,4,4,1}, true},
                {new int[] {1,1,4}, true},
        });
    }

    private int[] a;
    private boolean b;

    public ParamTest2(int[] a, boolean b) {
        this.a = a;
        this.b = b;
    }
    @Test
    public void tastNewArr1() {
        ArraysForTests arr = new ArraysForTests();
        Assert.assertEquals(b,arr.newArrOnlyOneAndFour(a));
    }
}

