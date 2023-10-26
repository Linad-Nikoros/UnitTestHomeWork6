package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
public class TestListAverageCompare {

    // Тест для сравнения пустых списков.
    @Test
    public void testEmptyLists() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList();

        String result = ListAverageCompare.compareLists(list1, list2);

        assertEquals("Средние значения равны", result);
    }
    // Тест для сравнения, когда первый список пуст, а второй - нет.
    @Test
    public void testFirstListEmpty() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        String result = ListAverageCompare.compareLists(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    // Тест для сравнения, когда второй список пуст, а первый - нет.
    @Test
    public void testSecondListEmpty() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList();

        String result = ListAverageCompare.compareLists(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    // Тест для сравнения списков с разными средними значениями.
    @Test
    public void testCompareLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        String result = ListAverageCompare.compareLists(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }
    // Тест для сравнения списков с равными средними значениями.
    @Test
    public void testEqualAverages() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 2, 0);

        String result = ListAverageCompare.compareLists(list1, list2);

        assertEquals("Средние значения равны", result);
    }
}
