package edu.nwpu.zhao.Test;

/**
 * @author:weilongzhao
 * @time:2021/10/17 10:55
 */
class Bank {

    long[] balance;
    int n;
    public Bank(long[] balance) {
        this.balance = balance;
        n = balance.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        if(account1 > n || account2 > n)
            return false;
        if(balance[account1-1] > money){
            balance[account1-1] -= money;
            balance[account2-1] += money;
            return true;
        }else{
            return false;
        }

    }

    public boolean deposit(int account, long money) {
        if(account > n){
            return false;
        }
        balance[account-1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if(account > n){
            return false;
        }
        if(balance[account-1] > money){
            balance[account-1] -= money;
            return true;
        }else{
            return false;
        }
    }
}