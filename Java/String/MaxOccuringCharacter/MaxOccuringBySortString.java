import java.util.Arrays;

public class MaxOccuringBySortString
{

    // Driver Method
    public static void main(String[] args)
    {
        String s = "R";
        System.out.println(maxOccuringChar(s));
    }
// This method will sort the string Alphabetically
    public static String sortString(String s){
        char[] revString = s.toCharArray();
        Arrays.sort(revString);

        return new String(revString);
    }

    public static char maxOccuringChar(String s){
        String sortedString = sortString(s);
        char currentChar = s.charAt(0),maxChar = currentChar,prevChar = currentChar;
        int count=1,maxCount = count;

        for (int i = 1; i < sortedString.length(); i++) {
            currentChar = sortedString.charAt(i);
            if (currentChar == prevChar){
                count++;
                if (count>maxCount){
                    maxCount=count;
                    maxChar = currentChar;
                }
            }else {
                count = 1;
            }
            prevChar = currentChar;
        }
        return maxChar;
    }
}
