package tests;

import com.example.Feline;
import com.example.Lion;
import data.TestData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    private static final String falseSex = TestData.returnFalseSex();
    private static final List<String> expected = TestData.returnExpected();
    private static final String expectedError = TestData.returnExpectedError();

    @Test
    public void doesHaveManeExceptionTest()  {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion(feline, falseSex);
        });
        Assert.assertEquals("Здесь должно быть сообщение об ошибке", expectedError,
                exception.getMessage());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        List<String> actual = lion.getFood();
        Assert.assertEquals("Львы едят животных, птиц и рыбу", expected, actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        int expectedInt = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedInt);
        int actual = lion.getKittens();
        Assert.assertEquals("Значения должны совпадать", expectedInt, actual);
    }
}
