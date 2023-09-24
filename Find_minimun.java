package Searching;

public class Find_minimun {
    public static void main(String[] args) {
        int [] arr = {3,6,4,5,34,56,-12,-34,-6};
        System.out.println(min(arr));

    }
    static int min(int [] arr){
        int ans = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<ans){
                ans= arr[i];
            }

        }
        return ans;
    }
}
