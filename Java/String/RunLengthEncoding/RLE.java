public class RLE {
    public static void main(String[] args) {
        System.out.println(runLengthEncoding("ssmmmaaarrrrtt"));
    }

    public static String runLengthEncoding(String str){
        char[] charArr = str.toCharArray();
        String encoded = "";
        int charCount = 1;
        encoded+=charArr[0];
        char current = charArr[0];

        for (int i = 1; i < charArr.length; i++) {
            if (current==charArr[i]){
                charCount++;
            }else {
                encoded+= charCount;
                charCount = 1;
                encoded+= charArr[i];
                current = charArr[i];
            }
        }
        encoded+=charCount;

        return encoded;
    }
}
