package edu.nwpu.zhao.Test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;


/**
 * @author:weilongzhao
 * @time:2022/3/16 20:28
 */
class AllOne {
    Map<String, Node> map;
    Node head = new Node(-1);
    Node tail = new Node(-1);
    public AllOne() {
        map = new HashMap();
        head.right = tail;
        tail.left = head;
    }

    public void inc(String key) {
        if(map.containsKey(key)){
            Node pos = map.get(key);
            pos.set.remove(key);
            if(pos.right.val == pos.val + 1){
                pos.right.set.add(key);
                map.put(key, pos.right);
            }else{
                Node node = new Node(pos.val + 1);
                node.right = pos.right;
                pos.right.left = node;
                pos.right = node;
                node.left = pos;
                node.set.add(key);
                map.put(key, node);
            }
            if(pos.set.size() == 0){
                pos.left.right = pos.right;
                pos.right.left = pos.left;
            }
        }else{
            if(head.right.val == 1){
                head.right.set.add(key);
                map.put(key, head.right);
            }else{
                Node node = new Node(1);
                node.right = head.right;
                head.right.left = node;
                node.left = head;
                head.right = node;
                node.set.add(key);
                map.put(key, node);
            }
        }
    }

    public void dec(String key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.set.remove(key);
            Node pre = node.left;
            int val = node.val;

            if(node.set.size() == 0){//删除结点
                pre.right = node.right;
                node.right.left = pre;
            }
            if(pre.val == val - 1){
                pre.set.add(key);
                map.put(key, pre);
            }else{
                if(val - 1 == 0){
                    map.remove(key);
                }else{
                    Node t_node = new Node(val - 1);
                    t_node.left = pre;
                    t_node.right = pre.right;
                    pre.right.left = t_node;
                    pre.right = t_node;
                    t_node.set.add(key);
                    map.put(key, t_node);
                }
            }
        }
    }

    public String getMaxKey() {
        Node t = tail.left;
        for(String s : t.set){
            return s;
        }
        return "";
    }

    public String getMinKey() {
        Node h = head.right;
        for(String s : h.set){
            return s;
        }
        return "";
    }

    class Node{
        int val;
        Node left;
        Node right;
        Set<String> set;
        public Node(int _val){
            this.val = _val;
            set = new HashSet();
        }
    }
}