class Main{

  public static void Main(String[] args){
    int[] arr = {0,1,1,0,1,1,0};
    int[] separated = separate(arr,arr.length);
    for(int i=0;i<separated.length;i++){
      System.out.println(arr[i]);
    }
  
  }

  public static int[] separate(int[] arr,int size){
    int index,count = 0;
    for( index=0; index<size; index++){
      if(arr[index]==0){
        count++;
      }
    }
    
    for( index=0; index<count; index++){
      arr[index] = 0;
    }
    
    for(index=count; index<size; index++){
      arr[index] = 1;
    }
    
    return arr;
    
  }
}
