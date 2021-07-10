public class BruteForce
{

    // Driver Method
    public static void main(String[] args)
    {
        System.out.println(isRotation("SAIKAT","TSAIKA"));
    }

    public static String rotateRight(String s1){
        char[] charArr = s1.toCharArray();

        char temp = charArr[charArr.length-1];
        for (int i = charArr.length-1; i > 0 ; i--) {
            charArr[i] = charArr[i-1];
        }
        charArr[0] = temp;
        return new String(charArr);
    }

    public static boolean isRotation(String s1,String s2){
        if (s1.length()!= s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.equals(s2)){
                return true;
            }
            s2 = rotateRight(s2);
        }
        return false;
    }


}
