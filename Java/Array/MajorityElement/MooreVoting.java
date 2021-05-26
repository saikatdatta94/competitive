public class Main {
    public static void main(String[] args){

        int[] myArrTwo = {2,1,2,3,2,4,2};

        int candidate = findMajorityCandidate(myArrTwo,myArrTwo.length);
        if (isMajority(myArrTwo,myArrTwo.length,candidate)){
            System.out.println(candidate);
        }else {
            System.out.println("None");
        }

    }


    public static int findMajorityCandidate(int arr[], int size){
        int voter=0,votes=1;
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] == arr[voter]){
                votes++;
            }else {
                votes --;
            }
            if (votes==0){
                voter = index;
                votes = 1;
            }
        }
        return arr[voter];
    }

    public static boolean isMajority(int[] arr,int size,int candidate){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == candidate){
                count++;
            }
        }
        return (count>size/2);
    }


}
