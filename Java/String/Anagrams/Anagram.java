public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("angel","glean"));
    }

    public static boolean isAnagram(String str1,String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        int length = str1.length();
        int[] table1 = new int[256];
        int[] table2 = new int[256];
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        for (int i = 0; i < length; i++) {
            table1[charArr1[i]]++;
            table2[charArr2[i]]++;
        }

        for (int i = 0; i < 256; i++) {
            if (table1[i]!=table2[i]){
                return false;
            }
        }

        return true;
    }
}
