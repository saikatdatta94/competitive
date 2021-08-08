public class FirstNonRepeating {
    public static void main(String[] args) {
        System.out.println(firstNonRepeating("saikat"));
    }

    public static char firstNonRepeating(String str){
        int[] table = new int[256];
        for (int i = 0; i < str.length(); i++) {
            table[str.charAt(i)]++;
        }

        for (int i = 0; i <str.length() ; i++) {
            if (table[str.charAt(i)]==1){
                return str.charAt(i);
            }
        }
        return '0';
    }
}
