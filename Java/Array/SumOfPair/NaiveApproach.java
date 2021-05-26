public class Main {
    public static void main(String[] args){

        int[] myArr = {1,4,3,3,5,2,6};
       
        System.out.println(findAllPairsOfSum(myArr,0,myArr.length-1,9);
    }

   



    public static void findAllPairsOfSum(int[] arr,int size,int sum){
        int i,j;
        for (i=0;i<size;i++){
            for (j=i+1;j<size;j++){
                if (arr[i]+arr[j]==sum){
                    System.out.println("("+arr[i]+","+arr[j]+"="+sum);
                }
            }
        }
    }

  

}
