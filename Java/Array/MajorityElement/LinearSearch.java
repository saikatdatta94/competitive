public class Main {
    public static void main(String[] args){

        int[] myArr = {1,1,1,1,2,3,4};
        System.out.println(findNth(myArr,myArr.length))
    }

    public static int findNth(int[] arr,int size){
        for (int i=0; i<=size/2; i++){
            if (arr[i] == arr[i+size/2]){
                return arr[i];
            }
        }
        return -1;
    }



}
