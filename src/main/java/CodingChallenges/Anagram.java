package CodingChallenges;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //1
        String s1 = "silent";
        String s2 = "listen";

        char[] A = s1.toCharArray();
        char[] B = s2.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        System.out.println(Arrays.equals(A, B));

        //2
        String w = "Heart";
        String w2 = "Earth";

        String s=w.toLowerCase();
        String s5=w2.toLowerCase();

        char[] charofw = s.toCharArray();
        char[] charofw2 = s5.toCharArray();

        Arrays.sort(charofw);
        Arrays.sort(charofw2);

        System.out.println(Arrays.equals(charofw,charofw2));
    }
}