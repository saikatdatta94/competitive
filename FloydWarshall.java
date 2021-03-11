public class Main {
    public static void main(String[] args){
        int[][] prev = {{0,11,1,6},{11,0,7,3},{1,7,0,2},{6,3,2,0}};
        int[][] next = prev;
        int node = 0;
        while (node<prev.length){
            for (int i = 0; i < prev.length ; i++) {
                for (int j = 0; j < prev.length ; j++) {
                    if(prev[i][j]>prev[i][node]+prev[node][j]){
                        next[i][j] = prev[i][node]+prev[node][j];
                    }
                }
            }
            prev = next;
            node++;
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(next[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(prev.length);
    }
}
