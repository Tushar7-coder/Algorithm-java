package Searching;

public class Search_in_range {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int [] arr, int Target,int start,int end){
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start;index <=end;index++){
            int element = arr[index];
            if (element == Target){
                return index;
            }
        }return -1;
    }
}
