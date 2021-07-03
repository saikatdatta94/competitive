public class MaxOccuringBruteForce
{
    // Driver Method
    public static void main(String[] args)
    {
        String s = "SAAAAIKAT";
        System.out.println(maxOccuringChar(s));
    }

    public static char maxOccuringChar(String s){
        char current_char=s.charAt(0),max_char=current_char;
        int current_count=1,max_count=1;

        for (int i = 0; i < s.length()-1; i++) {
            current_char = s.charAt(i);
            current_count = 1;
            for (int j = i+1; j <s.length() ; j++) {
                if (current_char == s.charAt(j)){
                    current_count++;
                }
            }
            if (current_count>max_count){
                max_count= current_count;
                max_char = current_char;
            }
        }
        return max_char;
    }


}

