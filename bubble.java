public class bubble{
    //1.Bubble Sort--->Moves largest numbers are found and placed at the correct position
    //Time Complexity=O(n^2)--->Worst&Average Case
    public static void main(String[] args) {
        /* int arr[]={7,8,3,1,2};
        //arr.length-1--->Last remaining element is automatically sorted.So outer loop goes only for 4 times(0-3)
        for(int i=0;i<arr.length-1;i++){
            //arr.length-1-i--->No need to work again upon the elements which are sent to last(Already Sorted)
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1]; 
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);//Function Call,Passing array values */
    }
    /* public static void printArray(int arr[]){//Fun-Def,int[]--->Data Type
        System.out.println("The array after bubble sorting in ascending order is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } */
}



