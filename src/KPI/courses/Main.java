package KPI.courses;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = {4,5,-6,4,5,3,4,2,4,5,7};
        for (int value:array) {
            list.add(value);
        }

        ArrayCounter counter = new ArrayCounter(list);
        Map<Integer, Integer> countedArray = counter.count();

        System.out.println(countedArray.toString());
    }
}
