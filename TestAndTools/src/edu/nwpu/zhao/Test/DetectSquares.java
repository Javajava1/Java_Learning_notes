package edu.nwpu.zhao.Test;

import java.util.*;

/**
 * @author:weilongzhao
 * @time:2022/1/26 16:58
 */
class DetectSquares {
    Map<Integer, Set<Integer>> row = new HashMap();
    Map<Integer, Set<Integer>> column = new HashMap();
    Map<String, Integer> map = new HashMap();
    public DetectSquares() {

    }

    public void add(int[] point) {
        int x = point[0];
        int y = point[1];

        Set<Integer> tmp1 = row.getOrDefault(y, new HashSet<>());
        tmp1.add(x);
        row.put(y, tmp1);
        Set<Integer> tmp2 = column.getOrDefault(x, new HashSet<>());
        tmp2.add(y);
        column.put(x, tmp2);
        String str = "#" + point[0] + "#" + point[1];
        map.put(str, map.getOrDefault(str,0) + 1);

//        if(map.containsKey(point)){
//            List<Integer> tmp1 = row.get(point[1]);
//            tmp1.add(point[0]);
//            List<Integer> tmp2 = column.get(point[0]);
//            tmp2.add(point[1]);
//            map.put(point, map.get(point) + 1);
//        }else{
//            List<Integer> tmp1 = new ArrayList();
//            tmp1.add(point[0]);
//            row.put(point[1], tmp1);
//
//            List<Integer> tmp2 = new ArrayList();
//            tmp2.add(point[1]);
//            column.put(point[0], tmp2);
//
//            map.put(point, 1);
//        }
    }

    public int count(int[] point) {
        int res = 0;
        int x = point[0];
        int y = point[1];
        if(!row.containsKey(y) || !column.containsKey(x)){
            return res;
        }
        for(int nx : row.get(y)){
            int len = nx - x;
            int []nums = new int[]{y + len, y - len};
            for(int ny : nums){
                Set<Integer> tmp_set = row.getOrDefault(ny, new HashSet<>());
                if(tmp_set.contains(nx)){
                    int c1 = map.getOrDefault("#" + nx + "#" + ny,0);
                    int c2 = map.getOrDefault("#" + x + "#" + ny,0);
                    int c3 = map.getOrDefault("#" + nx + "#" + y,0);
                    res += c1 * c2 * c3;
                }
            }
        }
        return res;
//        for(int i = 0; i < row.get(y).size(); i++){
//            int len = row.get(y).get(i) - x;
//            int[] nums = new int[]{y + len, y - len};
//            for(int ny : nums){
//                List<Integer> xs = row.get(ny);
//            }
//            for(int j = 0; j < column.get(x).size(); j++){
//                int x1 = row.get(y).get(i);
//                int y1 = column.get(x).get(j);
//                String tmp = "#" + x1 + "#" + y1;
//                if(map.containsKey(tmp) && Math.abs(x - x1) == Math.abs(y - y1) && Math.abs(x - x1) != 0){
//                    res += map.getOrDefault(tmp, 0);
//                }
//            }
//       }
//        return res;
    }
}

