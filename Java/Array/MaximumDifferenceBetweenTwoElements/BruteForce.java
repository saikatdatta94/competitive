public class Main {
    public static void main(String[] args){

        int[] myArr = {1,2,3,4,6,8,9};

        System.out.println(findMaxDifference(myArr,myArr.length);


    }
    public static int findMaxDifference(int[] arr,int size){
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      int index;
      for(index = 0; index < size; index++){
        if(arr[index]< min){
          min = arr[index];
        }
        if(arr[index] > max){
          max = arr[index];
        }
      }
      
      return max-min;
    }
}
