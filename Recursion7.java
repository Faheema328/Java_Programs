import java.util.*;
//Removing duplicates in a string
//Time Complexity--->O(n)
public class Recursion7 {
    public static boolean arr[]=new boolean[26];//Stores:Have i seen this character before?
    //Array is created by us and then filled with a default boolean value(False)by java and then we update its value
    //static-->All  rec calls share the same array
    //Non-Static-->For every call the array will reset to false
    public static void main(String[] args) {
        /* String str="abbccda";
        System.out.println("The string with duplicates is: "+str);
        removeDupli(str,arr,0,""); */
    }
    /* public static void removeDupli(String str,boolean arr[],int idx,String newStr){
        //Since arr is public static(Shared for the entire prgm)even if not passed here-->No prblm
        if(idx==str.length()){//When we finished the entire string
            System.out.println("The string after removing all the duplicates in it is: "+newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(arr[currChar-'a']==true){//currChar-'a'-->Position in the array
        //Index(currChar)=currChar(ASCII Value)-startChar(ASCII Value)
        // Arrays only use numeric indices, but we get characters (string position(0,1,2..,25)≠ alphabet position)
        // So,we convert each char to its alphabet index (0–25) using 'char - 'a''
        //true-->The char has already seen
            removeDupli(str,arr,idx+1,newStr);

        }
        else{//Index(currChar)==false(Haven't seen yet)
            newStr=newStr+currChar;
            arr[currChar-'a']=true;//Mark this character(Value)as seen for future duplicate checks
            removeDupli(str,arr,idx+1,newStr);
        }

    } */
}
