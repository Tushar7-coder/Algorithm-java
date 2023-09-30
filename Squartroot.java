package Case;

public class Squartroot {
    public static void main(String[] args) {
//        System.out.println(sqrt(400));
        int n =40;
        int p =3;
        System.out.printf("%3f",sqrt(n,p));

    }
//    static int sqrt(int n){
//        int half = n/2;
//        int i;
//        for ( i =1;i<=half;i++){
//            if (i*i==n){
//                return i;
//            }
//        }
//        return i;
//    }
    static double sqrt(int n, int  p){
        int s =0;
        int e=n;
        double root = 0.0;
        while (s<=e){
            int m = s + (e-s)/2;
            if(m*m==n){
                return m ;
            }
            if (m*m>n){
                e = m-1;
            }else {
                s = m+1;
            }
            double incr = 0.1;
            for (int i = 0;i<p;i++){
                while (root*root<=n){
                    root+= incr;
                    incr /= 10;
                }
                root-= incr;
                incr/=10;
            }
        }
     return root;
    }
}
