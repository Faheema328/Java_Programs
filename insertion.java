public class insertion {
    //3.Insertion Sort--->Dividing the array into two parts(Sorted&Unsorted)
    //Time Complexity=
    public static void main(String[] args) {
        /* int arr[]={7,8,3,1,2};
        for(int i=1;i<arr.length;i++){//Un Sorted part
            int current=arr[i];
            int j=i-1;//Sorted Part-->j=Last index of sorted part
            //Assuming the 1st element of the array(Index=0)is sorted
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];//Move the digit to right-->Provide space for the smallest digit(If found)
                j--;//After moving again start comparing with the elements on the left
            }
            arr[j+1]=current;//If the current element is larger then place it immediately after the last element of the sorted array(Correct Position)
        }
        printArray(arr);//Fun-Call */
    }
    /* public static void printArray(int[]arr){//Fun Def
        System.err.println("The array after insertion sorting is:");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    } */
}