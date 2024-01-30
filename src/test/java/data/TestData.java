package data;

import java.util.List;

public class TestData {
    private static final List<String> expected = List.of("Животные", "Птицы", "Рыба");
    private static final String catSound = "Мяу";
    private static final String falseSex = "Какой-то пол";
    private static final String expectedError = "Используйте допустимые значения пола животного - самец или самка";
    public static List<String> returnExpected() {
        return expected;
    }
    public static String returnCatSound() {
        return catSound;
    }
    public static String returnFalseSex() {
        return falseSex;
    }
    public static String returnExpectedError() {
        return expectedError;
    }
}
