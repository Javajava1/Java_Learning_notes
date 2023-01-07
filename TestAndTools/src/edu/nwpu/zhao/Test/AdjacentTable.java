package edu.nwpu.zhao.Test;

import java.util.Arrays;

/**
 * @author:weilongzhao
 * @time:2022/3/21 21:11
 */
public class AdjacentTable {
        static int N = 100010, M = N * 2;
        static int[] he = new int[N], e = new int[M], ne = new int[M];
        static int[] f = new int[N];
        int idx;
        void add(int a, int b) {
            e[idx] = b;//由于访问某一条边指向的节点；
            ne[idx] = he[a];//由于是以链表的形式进行存边，该数组就是用于找到下一条边；
            he[a] = idx++;//存储是某个节点所对应的边的集合（链表）的头结点；
        }
        public int countHighestScoreNodes(int[] parents) {
            Arrays.fill(he, -1);
            int n = parents.length;
            for (int i = 1; i < n; i++) add(parents[i], i);
            dfs(0);
            long max = 0;
            int ans = 0;
            for (int x = 0; x < n; x++) {
                long cur = 1;
                for (int i = he[x]; i != -1; i = ne[i]) cur *= f[e[i]];
                if (x != 0) cur *= n - f[x];
                if (cur > max) {
                    max = cur; ans = 1;
                } else if (cur == max) {
                    ans++;
                }
            }
            return ans;
        }
        int dfs(int u) {
            int ans = 1;
            for (int i = he[u]; i != -1; i = ne[i]) ans += dfs(e[i]);
            f[u] = ans;
            return ans;
        }
}
