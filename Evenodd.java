package Case;

public class Evenodd {
    public static void main(String[] args) {
        System.out.println(isodd(19));
        System.out.println(iseven(12));
    }
    static boolean  isodd(int n){
       return (n&1)==1;
    }
    static boolean iseven(int n ){
        return ((n&1)==0);
    }
}
