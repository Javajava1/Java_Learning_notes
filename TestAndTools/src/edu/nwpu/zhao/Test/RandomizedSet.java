package edu.nwpu.zhao.Test;
import java.util.Map;
import java.util.List;
import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
/**
 * @author:weilongzhao
 * @time:2022/4/13 20:59
 */
public class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> list;
    Random rand;
    public RandomizedSet() {
        map = new HashMap();
        list = new ArrayList();
        rand = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(map.containsKey(val)){
            int index = map.get(val);
            map.remove(val);
            if(list.size() > 1){
                list.set(index, list.get(list.size() - 1));
                map.put(list.get(list.size() - 1), index);
                list.remove(list.size() - 1);
            }else{
                list.remove(0);
            }
            return true;
        }
        return false;
    }

    public int getRandom() {
        int index = rand.nextInt(list.size());
//        System.out.println(list.size());
        return list.get(index);
    }
}
