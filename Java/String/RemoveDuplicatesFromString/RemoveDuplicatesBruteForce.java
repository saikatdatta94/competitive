import java.util.Arrays;

public class RemoveDuplicatesBruteForce
{

    // Driver Method
    public static void main(String[] args)
    {
        String s = "gaadbbaaggaij";
        System.out.println(removeDuplicates(s));
    }

   

    public static String removeDuplicates(String str){
        String noDup = "";
        boolean contains;
        for (int i = 0; i < str.length(); i++) {
            contains = false;
            for (int j = 0; j < noDup.length(); j++) {
                if (str.charAt(i) == noDup.charAt(j)){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                noDup+= str.charAt(i);
            }
        }
        return noDup;
    }
}

