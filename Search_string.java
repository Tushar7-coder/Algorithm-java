package Searching;

import java.util.Arrays;

public class Search_string {
    public static void main(String[] args) {
        String str = ("Tushar");
        char Target = 'u';
//         searchstring(str,Target);
//        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(searchstring(str,Target));

    }
    static boolean searchstring(String str, char Target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i <str.length() ; i++) {
            if (Target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
