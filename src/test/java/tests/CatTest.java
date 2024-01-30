package tests;

import com.example.Cat;
import com.example.Feline;
import data.TestData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private static final List<String> expected = TestData.returnExpected();
    private static final String catSound = TestData.returnCatSound();
    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        Assert.assertEquals("Кот говорит 'Мяу'", catSound, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        List<String> actual = cat.getFood();
        Assert.assertEquals("Коты едят животных, птиц и рыбу", expected, actual);
    }
}
