package edu.nwpu.zhao.Test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author:weilongzhao
 * @time:2022/9/3 16:40
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int[] chs_S = new int[128];
        int[] chs_T = new int[128];
        for(int i = 0; i < S.length(); i++){
            chs_S[S.charAt(i)]++;
        }
        for(int i = 0; i < T.length(); i++){
            chs_T[T.charAt(i)]++;
        }
        if(chs_S['#'] == 0){
            System.out.println(S);
            return;
        }
        int max = 0;
        for(int i = 'a'; i <= 'z'; i++){
            max = Math.max(max, chs_S[i]);
        }
        int res = 1;
        for(; res <= max; res++){
            increase(chs_T, res);
            if(cover(chs_S, chs_T)){
                continue;
            }else{
                for(int i = 'z'; i >= 'a'; i--){
                    int diff = chs_T[i] - chs_S[i];
                    if(diff <= 0){
                        continue;
                    }
                    if(chs_S['#'] >= diff){
                        chs_S['#'] -= diff;
                        chs_S[i] += diff;
                    }else{
                        chs_T[i] += chs_S['#'];
                        break;
                    }
                }
            }
            if(chs_S['#'] == 0){
                break;
            }
        }
        StringBuilder strb = new StringBuilder(S);
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < S.length(); i++){
            if(strb.charAt(i) != '#'){
                chs_S[strb.charAt(i)]--;
            }else{
                q.offer(i);
            }
        }
        for(int i = 'z'; i >= 'a'; i--){
            while(chs_S[i] != 0){
                int index = q.poll();
                strb.setCharAt(index, (char)i);
                chs_S[i]--;
            }
        }
        System.out.println(strb.toString());
    }
    public static void increase(int[] chs, int res){
        for(int i = 'a'; i <= 'z'; i++){
            int tmp = chs[i] / res;
            chs[i] += tmp;
        }
    }
    public static boolean cover(int[] chs_S, int[] chs_T){
        for(int i = 'a'; i <= 'z'; i++){
            if(chs_S[i] < chs_T[i]){
                return false;
            }
        }
        return true;
    }

}
