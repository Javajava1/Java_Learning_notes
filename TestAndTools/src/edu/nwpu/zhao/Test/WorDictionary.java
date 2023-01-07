package edu.nwpu.zhao.Test;

/**
 * @author:weilongzhao
 * @time:2021/10/19 17:08
 */

class WordDictionary {
    class TreeNode{
        TreeNode[] t = new TreeNode[26];
        boolean flag = false; ;
        public TreeNode(){
        }
    }
    TreeNode root;
    public void generate(String s){
        TreeNode p = root;
        for(int i = 0;i<s.length();i++){
            if(p.t[s.charAt(i)-'a'] == null){
                TreeNode node = new TreeNode();
                p.t[s.charAt(i)-'a'] = node;
                p = node;
            }else{
                p = p.t[s.charAt(i)-'a'];
            }
        }
        p.flag = true;
    }
    public WordDictionary() {
        root = new TreeNode();
    }

    public void addWord(String s) {
        TreeNode p = root;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(p.t[c-'a'] == null){
                p.t[c-'a'] = new TreeNode();
                p = p.t[c-'a'];
            }else{
                p = p.t[c-'a'];
            }
        }
        p.flag = true;
    }

    public boolean search(String s) {
        if(s.charAt(0) != '.'){
            return dfs(s,0,root);
        }else{
            for(int j = 0;j<26;j++){
                if(root.t[j] != null){
                    if(dfs(s,1,root.t[j])){
                        return true;
                    }
                }
            }
            return false;
        }
    }
    public boolean dfs(String s,int i,TreeNode root){
        if(i == s.length()){
            if(root.flag)
                return true;
            else{
                return false;
            }
        }

        if(s.charAt(i) != '.' && root.t[s.charAt(i) - 'a'] == null){
            return false;
        }
        if(s.charAt(i) != '.'){
            return dfs(s,i+1,root.t[s.charAt(i)-'a']);
        }else{
            for(int j = 0;j<26;j++){
                if(root.t[j] != null){
                    if(dfs(s,i+1,root.t[j])){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
