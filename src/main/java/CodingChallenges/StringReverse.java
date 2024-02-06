package CodingChallenges;

public class StringReverse {
    public static void main(String[] args) {
        String str="Hello";
        String str2="Hi";
        System.out.println(reverse(str));
        System.out.println(reverse2(str2));
    }
    public static String reverse(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        return s;
    }

    public static String reverse2(String str2){
        return new StringBuilder(str2).reverse().toString().toLowerCase();
    }
}
