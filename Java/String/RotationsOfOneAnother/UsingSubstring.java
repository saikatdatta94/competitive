public class UsingSubstring
{

    // Driver Method
    public static void main(String[] args)
    {
        System.out.println(isRotation("SAIKAT","TSAIKA"));
    }



    public static boolean isRotation(String s1,String s2){
        if (s1.length()!= s2.length()){
            return false;
        }
        s1 = s1+s1;
        if (s1.contains(s2)){
            return true;
        }
        return false;
    }


}
