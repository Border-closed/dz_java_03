// Пусть дан произвольный список целых чисел, удалить из него четные числа 
// (в языке уже есть что-то готовое для этого)

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class delet {

    public static void main(String[] args) {        
        List <Integer> listInt = Arrays.asList(13,-1,8,3,4,101,2,5);        
        List <Integer> result = listInt.stream().reduce(0, (a, b) -> a + b)%2 == 0 ? 
                filter(listInt, p->p%2==0) : filter(listInt, p->p%2!=0);
        System.out.println(result);        
    }

    private static List <Integer> filter(List <Integer> listInt, Predicate <Integer> predicate) {
        return listInt.stream().filter(predicate).collect(Collectors.toList());
    }

}