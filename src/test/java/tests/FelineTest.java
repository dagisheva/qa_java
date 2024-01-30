package tests;

import com.example.Feline;
import data.TestData;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    private static final List<String> expected = TestData.returnExpected();
    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        List<String> actual = feline.eatMeat();
        Assert.assertEquals("Кошачьи едят животных, птиц и рыбу", expected, actual);
    }

    @Test
    public void getFamilyTest() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals("Здесь ожидается семейство 'Кошачьи'", expected, actual);
    }

    @Test
    public void getKittensWithoutInt() {
        int actual = 1;
        int expected = feline.getKittens();
        Assert.assertEquals("Метод должен вернуть 1", expected, actual);
    }
}
