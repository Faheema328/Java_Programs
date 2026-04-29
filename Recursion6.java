import java.util.*;
//Checking if an array is sorted(Strictly Increasing)
//Time Complexity--->O(n),n=arr.length()
public class Recursion6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* System.out.println("Enter the elements of an array:");
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();//Getting array elements from the user
        }
        boolean s=isSorted(arr,0);
        if(s==true){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        } */
    }
    /* public static boolean isSorted(int arr[],int index){//int[]--->This is the acutal declaration format for an array
        if(index==arr.length-1){
            return true;
        //If the index reaches the last element of an array,then it means that the before part is sorted
        }
        if(arr[index]<arr[index+1]){//Array is sorted till now
            return isSorted(arr,index+1);
        }
        else{//arr[index]>arr[index+1] or arr[index]=arr[index+1]
            return false;
        }
    } */
    
}
