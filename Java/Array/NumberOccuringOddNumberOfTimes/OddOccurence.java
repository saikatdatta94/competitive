public static int getOddOccuranceNumber(int arr[],int size){

  int index,result=0;
  
  for(index=0; index<size ;index++){
  
    result = result ^ arr[index];
  
  }
  
  return result;
}
