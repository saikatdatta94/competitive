public class Main {
    public static void main(String[] args){

        int[] myArr = {1,2,3,4,6,8,9};

        System.out.println(findMaxDifference(myArr,myArr.length);


    }
    public static int findMaxDifference(int[] arr,int size){
      int index,j,maxDifference = 0;
      for(index=0;index<size-1;index++){
        for(j=index+1;j <size; j++){
          if((arr[index]<arr[j]) && (maxDifference < (arr[j]-arr[index]))){
            
                maxDifference = arr[j]-arr[index];
            
          }
        }
      }
      
      return maxDifference;
    }
}
