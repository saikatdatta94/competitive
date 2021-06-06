public static int findMaxDiff(int arr[],int size){

  int index;
  int min_ele_so_far = arr[0];
  int max_diff_so_far = arr[1]-arr[0];
  int current_diff = arr[1]-arr[0];
  
  for(index=1 ; index<size; index++){
    if(arr[index] < min_ele_so_far){
       min_ele_so_far = arr[index];
    }else{
      current_diff = arr[index] - min_ele_so_far;
      if(current_diff > max_diff_so_far){
        max_diff_so_far = current_diff;
      }
    }
  }
  
  return max_diff_so_far;

}
