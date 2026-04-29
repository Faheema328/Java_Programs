import java.util.*;
//Time Complexity--->O(n),Where 'n' is String Length
public class Recursion5{
    /* //Finding the 1st and last occurance of an element in a string
    public static int firstOccur=-1;//-1--->Invalid Index(Occurance not found yet)
    //static variables(first & last)-->Their value exists for the whole class
    //[Their value won't reset for every recursive call]
    //In case of non-static variables the value of the variable resets for every recursive call
    //Each recursive call is independant 
    public static int lastOccur=-1; */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /* System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("Enter a character:");
        char reqElement=sc.nextLine().charAt(0);//Takes 1st character of input string
        //nextLine--->Takes String
        //charAt(0)--->Exact Char
        findOccurance(str,0,reqElement); */
    }
    /* public static void findOccurance(String str,int index,char reqElement){
        if(index==str.length()){//We should stop(return)only after properly finishing the work  
            System.out.println("First occurance of "+reqElement+" is:"+firstOccur);
            System.out.println("Last occurance of "+reqElement+" is:"+lastOccur);
            return;
        }
        char currChar=str.charAt(index);
        if(reqElement==currChar){
            if(firstOccur==-1){
                firstOccur=index;//1st time we see the target char and store its index
                lastOccur=index;
            }
            else{
                lastOccur=index;
            //If the reqElement appears only once:LastOccur stays -1 ❌
            //So,F.O=L.O=Index(Same Index)
            }
        }
        findOccurance(str,index+1,reqElement);
    } */
}