package edu.nwpu.zhao.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:weilongzhao
 * @time:2022/3/22 17:40
 */
public class C_2049 {
    int root;
    int total;
    int maxScore = 0;
    int maxCnt = 0;
    public int countHighestScoreNodes(int[] parents) {
        Map<Integer, Integer> map = new HashMap();
        total = parents.length;
        List<Integer>[] list = new ArrayList[total];
        for(int i = 0; i < total; i++){
            list[i] = new ArrayList();
        }
        int []cnt = new int[parents.length];
        // Arrays.fill(cnt, 1);
        fun_build(parents, list);
        dfs2(list, 0);

        return maxCnt;

    }
    public int dfs2(List<Integer>[] list, int start){
        int score = 1;
        int size = 1;
        for(int c : list[start]){
            int nums = dfs2(list, c);
            score *= nums;
            size += nums;
        }
        if(total != size){
            score *= (total - size);
        }

        if(score == maxScore){
            maxCnt++;
        }else if(score > maxScore){
            maxScore = score;
            maxCnt = 1;
        }
        return size;
    }
    public void fun_build(int[] parents, List<Integer>[] list){
        for(int i = 0; i < parents.length; i++){
            if(parents[i] == -1){
                root = i;
            }else{
                list[parents[i]].add(i);
            }
        }
    }

}
