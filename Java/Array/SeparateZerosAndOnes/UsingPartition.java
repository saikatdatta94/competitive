class Main{

  public static void Main(String[] args){
    int[] arr = {0,1,1,0,1,1,0};
    int[] separated = usingPartition(arr,arr.length);
    for(int i=0;i<separated.length;i++){
      System.out.println(arr[i]);
    }
  
  }

//   Using two pointers
  public static int[] usingPartition(int[] arr,int size){
    int leftIndex=0,rightIndex=size-1;
    
    while(leftIndex < rightIndex){
      while(leftIndex < rightIndex && arr[leftIndex]==0 ){
        leftIndex++;
      }
      
      while(leftIndex < rightIndex && arr[rightIndex]==1 ){
        rightIndex--;
      }
      
      if(leftIndex < rightIndex){
        arr[leftIndex++] = 0;
        arr[rightIndex--] = 1;
      }
      
    }
    
    return arr;
    
  }
}
