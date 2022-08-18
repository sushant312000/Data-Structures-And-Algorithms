package Recursion;

public class calcPower {
    public static int power(int x, int n){
        if(n==0) return 1;
        if(x==0) return 0;
        int pownm_1 = power(x, n-1);
        return x * pownm_1;
    }
    public static void main(String[] args) {
        int x = 3, n = 8;
        int ans = power(x, n);
        System.out.println(ans);
    }
}
