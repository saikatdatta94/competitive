public class Main {
    public static void main(String[] args){

        int[] myArr = {1,2,3,4,6,8,9};

        System.out.println(binarySearchRecursive(myArr,0,myArr.length-1,7));


    }

    public static int binarySearchIterative(int[] arr, int leftIndex, int rightIndex,int target){
        int middle;
        while (leftIndex<=rightIndex){
            middle = (leftIndex+rightIndex)/2;
            if (arr[middle] == target){
                return middle;
            }
            if (arr[middle]>target){
                rightIndex = middle-1;
            }else {
                leftIndex = middle+1;
            }
        }
        return -1;
    }


    public static int binarySearchRecursive(int[] arr,int leftIndex, int rightIndex,int target){
        if (leftIndex<=rightIndex){
            int middle = (leftIndex+rightIndex)/2;
            if (arr[middle] == target){
                return middle;
            }
            if (arr[middle]>target){
                return binarySearchRecursive(arr,leftIndex,middle-1,target);
            }else {
                return binarySearchRecursive(arr,middle+1,rightIndex,target);
            }
        }

        return -1;

    }
}
