package Recursion;

public class towerOfHanoi {
    public static void transfer(int n, String src, String Helper, String Dest){
        if(n==1){
            System.out.println(n + "disks tranfered from" + src + "to" + Dest);
            return;
        }
        transfer(n-1, src, Helper, Dest);
        System.out.println(n + "disks tranfered from" + src + "to" + Dest);
        transfer(n-1, Helper, src, Dest);
    }
    public static void main(String[] args) {
        transfer(3, "S", "H", "D");
    }
}
