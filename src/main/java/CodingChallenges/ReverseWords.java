package CodingChallenges;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {

        System.out.println(wordsReverse("Hello World"));
    }

    public static String wordsReverse(String str) {
        String [] word=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            sb.append(word[i]);
        }

        return sb.toString();
    }
}