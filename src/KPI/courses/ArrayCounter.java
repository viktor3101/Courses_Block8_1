package KPI.courses;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayCounter {
    private List<Integer> list;

    public ArrayCounter(List<Integer> list){
        this.list = list;
    }

    public Map<Integer,Integer> count(){
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int value:list) {
            if(resultMap.containsKey(value)){
                resultMap.replace(value,resultMap.get(value) + 1);
            }
            else{
                resultMap.put(value,1);
            }
        }
        return resultMap;
    }
}
