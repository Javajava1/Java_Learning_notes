package edu.nwpu.zhao.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author:weilongzhao
 * @time:2021/8/8 21:30
 */
public class HowToIterateMap {
    /**
     * four method to iterate map
     */
    private Map<String,String> map = new HashMap<>();
    //entry
    public static void firstMethod(Map<String, String> map){
        for(Map.Entry<String, String> m :map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    //keySet() valueSet()
    public static void secondMethod(Map<String,String> map){
        for(String s:map.keySet()){
            System.out.println(s);
        }
        for(String v: map.values()){
            System.out.println(v);
        }
    }
    //iterator
    public static void thirdMethod(Map<String,String> map){
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry= iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
    //through key iterate value
    public static void fourthMethod(Map<String,String> map){
        for(String k: map.keySet()){
            System.out.println(map.get(k));
        }
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        for (int i = 0; i < 26; i++) {
            map.put(""+i,""+'a'+i);
        }
        //firstMethod(map);
//        secondMethod(map);
//        thirdMethod(map);
        fourthMethod(map);
    }
}
