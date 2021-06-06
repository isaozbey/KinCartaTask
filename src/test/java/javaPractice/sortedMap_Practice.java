package javaPractice;

import org.junit.Test;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMap_Practice {
    
    @Test
    public void test(){

        SortedMap<String,Integer> scoreMap= new TreeMap<>();
        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);
        scoreMap.put("Jill",70);
        scoreMap.put("Jack",52);
        scoreMap.put("Dave",93);

        System.out.println(scoreMap);
        System.out.println(scoreMap.firstKey());

        System.out.println(scoreMap.lastKey());

        System.out.println(scoreMap.subMap("Adam", "Jill"));


    }
    
}
