public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("saikat"));
    }

    public static String reverse(String str){
        char[] charArr = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        char temp;

        while (start<end){
            temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
        return new String(charArr);
    }
}
