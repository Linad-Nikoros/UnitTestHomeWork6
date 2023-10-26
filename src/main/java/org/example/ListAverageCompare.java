package org.example;
import java.util.List;
public class ListAverageCompare {
    public static double calculateAverage(List<Integer> list1) {
        if (list1.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Integer num : list1) {
            sum += num;
        }
        return (double) sum / list1.size();
    }
    public static String compareLists(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}


