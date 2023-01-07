package edu.nwpu.zhao.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author:weilongzhao
 * @time:2022/8/10 19:24
 */

public class List_Reverse {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};// 2 1 4 3 5
        Node list = new Node(-1);
        Node head = list;
        for(int i = 0; i < arr.length; i++){
            list.next = new Node(arr[i]);
            list = list.next;
        }
        Node next = head.next;

        Node l = reverse(head.next, 2);
        while (l.next != null){
            System.out.println(l.val);
            l = l.next;
        }
        System.out.println("over");
    }
    public static Node reverse(Node list, int k){
//        List<Node> arr = new ArrayList<>();
//        int i = 0;
//        while(list != null){
//            i = 1;
//            while(list != null && i != k + 1){
//                arr.add(list);
//                list = list.next;
//                i++;
//            }
//        }
//        if(i != k + 1){
//            return arr.get(0);
//        }
//        for(int j = arr.size() - 1; j > 0; j--){
//            arr.get(j).next = arr.get(j - 1);
//        }
//        arr.get(0).next = null;
//        return arr.get(arr.size() - 1);
        return null;
    }
}
