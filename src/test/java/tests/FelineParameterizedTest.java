package tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int expected;

    public FelineParameterizedTest(int expected){
        this.expected = expected;
    }

    Feline feline = new Feline();

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                {2},
                {1},
                {3},
                {5},
                {8},
                {4}
        };
    }

    @Test
    public void getKittensWithInt() {
        int actual = feline.getKittens(expected);
        Assert.assertEquals("Значения должны совпадать", expected, actual);
    }
}
