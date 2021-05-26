import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        int[] myArr = {1,4,3,3,5,2,6};
       
        System.out.println(findAllPairsOfSumHash(myArr,myArr.length-1,9);
    }

   



    public static void findAllPairsOfSumHash(int[] arr,int size,int sum){
        HashSet<Integer> hash = new HashSet<>();
        int b,index;
        for( index = 0 ;index< size;index++){
           b = sum - arr[index];
           if( b>=0 && hash.contains(b)){
              System.out.println("("+arr[index]+","+temp+")"+ " Sum:"+sum);
           } 
           hash.add(arr[index]); 
        }
        
    }

  

}
