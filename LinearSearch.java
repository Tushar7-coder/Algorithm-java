package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {23,34,13,14,56,78,34,456};
        int Target = 113;
        int ans = linearsearch(arr,Target);
        System.out.println(ans);
    }
    static int linearsearch(int [] arr,int Target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            int element = arr[i];
            if (element==Target){
                return element;
            }
        }return -1;
    }
}
