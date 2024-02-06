package CodingChallenges;

public class Palindrome {
    public static void main(String[] args) {
        //1 method
        String str="radar";
        if(isPalindrome(str)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }

        //2 method
        String str2="madam";
        if(isPalindrome2(str2)){
            System.out.println(str2+" is palindrome");
        }else{
            System.out.println(str2+" is not palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        return str.replaceAll("\\W","").equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W","")).reverse().toString());
    }

    public static boolean isPalindrome2(String str2){
        String replace=str2.replaceAll("\\W","");
        for(int i=0;i< str2.length()/2;i++){
            //radar
            if(str2.charAt(i)!=str2.charAt(str2.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
