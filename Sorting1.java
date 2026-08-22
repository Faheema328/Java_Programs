import java.util.*;


//1.Bubble Sort
    /*public class Sorting1{
    //Bubble Sort--->Moves largest numbers to their correct position
    //Time Complexity=O(n^2)--->Worst&Average Case
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
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
        printArray(arr);//Function Call,Passing array values
    }
    public static void printArray(int arr[]){//Fun-Def,int[]--->Data Type
        System.out.println("The array after bubble sorting in ascending order is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}
 */


//2.Selection Sort
    public class Sorting1{
    //Selection Sort--->Finds the smallest element and places it at its correct position
    //Time Complexity=O(n^2)
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){//i-->Current position to fill the correct element
            int min=i;//min-->Index
            for(int j=i+1;j<arr.length;j++){//j-->Searching the element
            if(arr[j]<arr[min]){//arr[min]-->Current smallest Value(Assumption)
            min=j;//Index of min=Index of j(Smallest element found)
        }
    }
    int temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp;
}
printArray(arr);//Fun-Call
    }
    public static void printArray(int arr[]){//Fun-Def
        System.out.println("The array after selection sorting is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
} 


//3.Insertion Sort
    /*public class Sorting1{
    //Insertion Sort--->Dividing the array into two parts(Sorted&Unsorted) and then sorting it
    //Time Complexity=
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
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
        printArray(arr);//Fun-Call 
    }
    public static void printArray(int[]arr){//Fun Def
        System.err.println("The array after insertion sorting is:");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    } 
} */


//4.Merge Sort
    /*public class Sorting1 {
    //Time Complexity--->O(nLogn)
    //Logn-->Division of array; n-->Conquering(merging) work each level
    public static void main(String[]args){
    int arr[]={6,3,9,5,2,8};
    int n=arr.length;
    int original[]=arr.clone();//arr.clone()-->Creates seperate copy of array
    divide(arr,0,n-1);
    //Not the copy but original array(Non-Primitive) is sent(Changes made to the array in main & divide methods also changes original array directly)
    System.out.println("The array "+Arrays.toString(original)+" after merge sorting is:");
    //Arrays.toString(original)-->Prints original array in readable form
    for(int i=0;i<n;i++){//By the time this loop runs,arr already became sorted,due to recursive modifications
    System.out.print(arr[i]+" ");
    }
}
public static void divide(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
    divide(arr,si,mid);
    divide(arr,mid+1,ei);
    //Recursion stops when only 1 element remains
    conquer(arr,si,mid,ei);//Runs only after both the recursive calls finish
}
public static void conquer(int arr[],int si,int mid,int ei){
    //Same original array is passed every time.'si' and 'ei' decide which portion to process
    int merged[]=new int[ei-si+1];//ei-si+1-->Creates exact required space but not extra space
    //Merged-->Temporary array
    int index1=si;//1st array
    int index2=mid+1;//2nd array
    int x=0;
    while(index1<=mid && index2<=ei){
        if(arr[index1]<arr[index2]){
            merged[x]=arr[index1];
            x++;
            index1++;
        }
        else{
            merged[x]=arr[index2];
            x++;
            index2++;
        }
    }
    while(index1<=mid){
        merged[x]=arr[index1];
        x++;
        index1++;
    }
    while(index2<=ei){
        merged[x]=arr[index2];
        x++;
        index2++;
    }
    for(int i=0,j=si;i<merged.length;i++,j++){
        arr[j] = merged[i];//It stores only one value not whole
        //Actual sorting must happen in the original array
    }
}
} */
    

//5.Quick Sort
    /*public class Sorting2{
//Time Complexity--->
//Worst case:O(n^2)-->When pivot is always the smallest or the largest element(Only one side gets reduced)(Uneven division)
//Average case:O(nlogn)[Equal division]
//Logn-->Array division into smaller parts
//n-->Checking n elements at every level
    public static void main(String[]args){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        int original[]=arr.clone();
        quickSort(arr,0,n-1);
        System.out.println("The array "+Arrays.toString(original)+"after quick sorting is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int low,int high){//Calls partition again and again using recursion
        if(low<high){//Existence of atleast two elements
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);//Recursively sorts left part
            quickSort(arr,pi+1,high);//Recursively sorts right part
        }
    }
    public static int partition(int arr[],int low,int high){//Arranges elements around the pivot & Places pivot correctly
        int pivot=arr[high];
        int i=low-1;//Initially no smaller elements exist
        for(int j=low;j<high;j++){//j →checks elements one by one 
            if(arr[j]<pivot){
                i++;//i →keeps track of position for smaller elements
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;

        return i;
    }
}*/


