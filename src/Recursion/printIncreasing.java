package Recursion;

public class printIncreasing {
    public static void inc(int n){
        if(n==6) return;
        System.out.println(n);
        inc(n+1);
    }
    public static void main(String[] args) {
        inc(1);
    }
}
