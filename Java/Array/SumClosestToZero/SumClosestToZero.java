public static void sumClosestToZero(int[] arr,int size){

  int[] sortedArray = arr; 
  Arrays.sort(sortedArray);
  
  int leftIndex = 0, rightIndex = size - 1;
  int minLeftIndex = leftIndex, minRightIndex = rightIndex;
  int index,currentSum,closestSum = Integer.MAX_VALUE;
  
  while(leftIndex < rightIndex){
    currentSum = sortedArray[leftIndex] + sortedArray[rightIndex];  
    
    if(Math.abs(currentSum) < Math.abs(closestSum)){
      closestSum = currentSum;
      minLeftIndex = leftIndex;
      minRightIndex = rightIndex;
    }
    
    if(currentSum < 0){
      leftIndex++;
    }else{
      rightIndex--;
    }
  
  }
  
  System.out.printf("%d   %d",sortedArray[minLeftIndex],sortedArray[minRightIndex]);

}
