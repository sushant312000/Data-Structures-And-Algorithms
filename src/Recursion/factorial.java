package Recursion;

public class factorial {
    public static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        int fact_nm1 = fact(n-1);
        return n*fact_nm1;
    }
    public static void main(String[] args) {
        int ans = fact(4);
        System.out.println(ans);
    }
}
