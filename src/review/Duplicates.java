package review;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Duplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAAASGNHNGFVCDDGFDFSFH"));
    }
    public static String removeDuplicates(String str){
        String []arr = str.split("");
        LinkedHashSet<String>set = new LinkedHashSet<>(Arrays.asList(arr));
        return set.toString().replace("[","").replace("]","").replace(" ","");



    }
}
