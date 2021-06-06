public static int findTriplet(int[] arr, int size, int sum){

  int leftIndex,rightIndex,tripletSum,index;
  int[] sortedArray = arr;
  Arrays.sort(sortedArray);
  
  for(index=0; index<size-1; index++){
    leftIndex = index+1;
    rightIndex = size-1;
    while(leftIndex < rightIndex){
      tripletSum = sortedArray[index] + sortedArray[leftIndex] + sortedArray[rightIndex];
      
      if(tripletSum == sum){
        System.out.println(sortedArray[index]+ " " + sortedArray[leftIndex]+ " " + sortedArray[rightIndex]);
        return 1;
      }
      
      if(tripletSum < sum){
        leftIndex++;
      }else{
        rightIndex--;
      }
     
    }
  }
  
  return -1;

}
