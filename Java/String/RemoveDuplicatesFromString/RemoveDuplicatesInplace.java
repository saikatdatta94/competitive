import java.util.Arrays;

public class RemoveDuplicatesInplace
{

    // Driver Method
    public static void main(String[] args)
    {
        String s = "gaadbbaaggaij";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s){
        int[] arr= new int[255];
        char[] str = s.toCharArray();
        int i=0,j=0;
        while(i<str.length && j<str.length){
            if(arr[str[j]]==0){
                arr[str[j]]=1;
                str[i] = str[j];
                i++;
            }
            j++;
        }
        return new String(str).substring(0,i);
    }

   
}

