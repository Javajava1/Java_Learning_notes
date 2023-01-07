package edu.nwpu.zhao.Test;

import java.util.*;

/**
 * @author:weilongzhao
 * @time:2021/10/10 0:29
 */
class SummaryRanges {
    List<Integer> arr;
    List<int[]> res;
    Set<Integer> set;
    public SummaryRanges() {
        //arr = new ArrayList();
        set = new HashSet<>();
        //res = new ArrayList<>();
    }
    public void addNum(int val) {
        set.add(val);
    }
    public int[][] getIntervals() {
        arr = new ArrayList<>(set);
        res = new ArrayList<>();
        Collections.sort(arr);
        int start = arr.get(0);
        int end = arr.get(0);
        int i;
        for(i = 1;i<arr.size();i++){
            if(arr.get(i)!=arr.get(i-1)+1){
                end = arr.get(i-1);
                res.add(new int[]{start,end});
                start = arr.get(i);
            }
        }
        if(i == arr.size()){
            res.add(new int[]{start,arr.get(arr.size()-1)});
        }
        return res.toArray(new int[res.size()][]);
    }
}
class  Test{
    public static void main(String[] args){
        SummaryRanges sr = new SummaryRanges();
        int [][] res ;
        sr.addNum(1);
        res = sr.getIntervals();
        sr.addNum(3);
        res = sr.getIntervals();
        sr.addNum(7);
        res = sr.getIntervals();
        sr.addNum(2);
        res = sr.getIntervals();
        sr.addNum(6);
        res = sr.getIntervals();
//        sr.addNum(7);
//        res = sr.getIntervals();
//        sr.addNum(6);
//        res = sr.getIntervals();
//        sr.addNum(4);
//        res = sr.getIntervals();
//        sr.addNum(7);
//        res = sr.getIntervals();
//        sr.addNum(5);
//        res = sr.getIntervals();
    }

}

