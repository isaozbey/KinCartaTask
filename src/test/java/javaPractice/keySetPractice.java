package javaPractice;

import org.junit.Test;

import java.util.*;

public class keySetPractice {

    @Test
    public void test1(){

        SortedMap<String,Integer> scoreMap= new TreeMap<>();
        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);
        scoreMap.put("Jill",70);
        scoreMap.put("Jack",52);
        scoreMap.put("Dave",93);

        Set<String> keys=scoreMap.keySet();
      //  System.out.println(keys);

        for (String each :scoreMap.keySet()) {
           // System.out.println(each);
        }

        Collection<Integer> values=scoreMap.values();
        //System.out.println(values);

        for (Map.Entry<String,Integer> each : scoreMap.entrySet()) {
            if (each.getValue()<90) {
                each.setValue(50);
            }
            System.out.println(each);
        }


    }
}
