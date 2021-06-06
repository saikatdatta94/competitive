public static int maxSubArrSum(int[] arr,int size){
  int index;
  int max_sum_so_far = 0;
  for(index = 1;index<size;index++){
      if(arr[index-1] > 0){
        arr[index] = arr[index] + arr[index-1];
      }
      max_sum_so_far = max_sum_so_far > arr[index] ? max_sum_so_far : arr[index] ;
  }
  
  return max_sum_so_far;
}
