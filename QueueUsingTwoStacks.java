import java.util.Stack;

public class Main {

    public static char[][] TOKENS= {{'(',')'},{'{','}'},{'[',']'}};

    public static void main(String[] args){

        System.out.println(isBalanced("}{}{"));

    }

    public static boolean isOpen(char c){
        for(char[] token: TOKENS){
            if (c==token[0]){
                return true;
            }
        }
        return false;
    }

    public static boolean isBalanced(String parList){
        Stack<Character> stack = new Stack<>();
        for (char c : parList.toCharArray()){
            if (isOpen(c)){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
//              if top open is not matched with closed return false
                if (!matched(stack.pop(),c)){
                    return false;
                }
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }

    private static boolean matched(char open, char closed) {
        for (char[] token: TOKENS){
            if (open == token[0] && closed == token[1] ){
                return true;
            }
        }
        return false;
    }


}
