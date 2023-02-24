//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Arrays;
public class max_min_avg {
    public static void main (String[] args) {
        Integer [] arr = new Integer[] {1,3,6,8,0,12,3,-6};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)>max) {
                max = list.get(i);
            } else if (list.get(i)<min) {
                min = list.get(i);
            }
            sum = sum+list.get(i);
        }
        System.out.println(list);
        System.out.println("Минимальное значение: "+min);
        System.out.println("Максимальное значение: "+max);
        System.out.println("Среднее значение: "+sum/list.size());

    }
}
