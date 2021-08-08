public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while (start<end){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
