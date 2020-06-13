package review;

import java.util.ArrayList;

public class BiggestPalindrome {
    public static void main(String[] args) {
        ArrayList<String>words = new ArrayList<>();
        words.add("racecar"); words.add("aba"); words.add("palindnilap");
                words.add("class"); words.add("finishedehsinif");
        System.out.println(biggestPalindrome(words));
    }
    public static String biggestPalindrome(ArrayList<String>words){
        String palindrome = "";
        for(String word: words){
            if(isPalindrome(word) && word.length() > palindrome.length()){
                palindrome = word;
            }
        }
        return palindrome;
    }
    static boolean isPalindrome(String word){
        return new StringBuilder(word).reverse().toString().equals(word);
    }
}
