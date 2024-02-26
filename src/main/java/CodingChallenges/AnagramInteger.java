package CodingChallenges;

import java.util.Arrays;

public class AnagramInteger {

    public static void main(String[] args) {
        System.out.println(isAreAnagram(123, 321));  // Output: true
        System.out.println(isAreAnagram(456, 789));  // Output: false
        System.out.println(isAreAnagram(122333, 233231));  // Output: true
        System.out.println(isAreAnagram(123, 456));  // Output: false
    }

    public static boolean isAreAnagram(int num1, int num2){

        String intNum1=Integer.toString(num1);
        String intNum2=Integer.toString(num2);

        char [] one=intNum1.toCharArray();
        char[]two=intNum2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        return Arrays.equals(one, two);

    }
}
