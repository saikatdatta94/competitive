public class Main {
    public static void main(String[] args){

        int[] myArr = {7,5,9,2,10};
        System.out.println(linearSearch(myArr,myArr.length,10));



    }
    public static int linearSearch(int[] arr,int size,int target){
        for(int i=0; i<size; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
