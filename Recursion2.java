import java.util.*;


//1.Tower of Hanoi
    /* public class Recursion2{
    //Time Complexity--->O(2^n-1)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of disks:");
        int n=sc.nextInt();
        towerOfHanoi(n,"S","H","D");  
    }
    public static void towerOfHanoi(int n,String src,String help,String dest){
        if(n==1){//n=No.of disks
            System.out.println("Transfer disk 1 "+"from "+src+" to "+dest);
            return;
        }
    towerOfHanoi(n-1,src,dest,help);//n-1 disks from S to H(Dest)(D-Help)
    System.out.println("Transfer disk "+n+" from "+src+" to "+dest);//nth disk from S to D
    towerOfHanoi(n-1,help,src,dest);//n-1 disks from H(Src) to D(S-Helper)
    } 
} */
/* n = 2
1. First recursive call → n becomes 1 → base case runs → print disk 1
2. Return to n = 2 → print disk 2
3. Second recursive call → new call with n = 1 → base case runs again → print disk 1
4.---Recursion End---

When n=2-->At 1st rec call n becomes n-1(2 becomes 1)and now here n=1(Base Case executes)
After that for n=2 the print stmt under 1st rec call executes
Now the execution goes to the 3rd rec call and again here n becomes n-1(2 becomes 1)and now here again
n becomes(2 becomes 1)(Base Case executes again)
Finally,the recursive call for n=2 is completed

---For n=2----
Base case(1),Prints 2,Base case(1)--->1+2+1
---For n=3---
(n-2)+3+(n-2)
So totally,
1,2,1+3+1,2,1 */


//2.Reversing a String using recursion
//Time Complexity--->O(n),Where 'n' is String Length
    /* public class Recursion2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    int index=str.length()-1;
    revString(str,index);
}
public static void revString(String str,int index){
    if(index<0){//No char is found at index<0(Beyond the limits)
        return;
    }
    else{
        System.out.print(str.charAt(index));//str.charAt(index)-->Prints the char 
        revString(str,index-1);
    }
}
} */


//3.Finding the 1st and last occurance of an element in a string
//Time Complexity--->O(n),Where 'n' is String Length
    /* public class Recursion2{ 
    public static int firstOccur=-1;//-1--->Invalid Index(Occurance not found yet)
    //static variables(first & last)-->Their value exists for the whole class
    //[Their value won't reset for every recursive call]
    //In case of non-static variables the value of the variable resets for every recursive call
    //Each recursive call is independant 
    public static int lastOccur=-1;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("Enter a character:");
        char reqElement=sc.nextLine().charAt(0);//Takes 1st character of input string
        //nextLine--->Takes String
        //charAt(0)--->Exact Char
        findOccurance(str,0,reqElement);
    }
    public static void findOccurance(String str,int index,char reqElement){
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
    }
} */


//4.Checking if an array is sorted(Strictly Increasing)
//Time Complexity--->O(n),n=arr.length()
    /* public class Recursion2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of an array:");
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
        }
    }
    public static boolean isSorted(int arr[],int index){//int[]--->This is the acutal declaration format for an array
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
    }
} */


//5.Moving all 'x' to the end of the string 
//Time Complexity--->O(n+count)-->O(n+n)-->O(2n)-->O(n),n=str.length()
    /* public class Recursion2 {
    public static void main(String[] args) {
        String str="axbcxxd";
        moveallX(str,0,0,"");
    }
    public static void moveallX(String str,int idx,int count,String newStr){
        if(idx==str.length()){//Jab hamara work complete hogaya ho(When we finished the string)
            for(int i=0;i<count;i++){
                newStr+='x';
            }
            System.out.println("The new string after moving all x to the end is: "+newStr);
            return;
        }
        char currChar=str.charAt(idx);//Getting the current char
        if(currChar=='x'){
            count++;
            moveallX(str,idx+1,count,newStr);
        }
        else{//currChar != 'x'
        newStr=newStr+currChar;
        moveallX(str,idx+1,count,newStr);
        }
    }
} */


//6.Removing duplicates in a string
//Time Complexity--->O(n)
    /* public class Recursion2 {
    public static boolean arr[]=new boolean[26];//Stores:Have i seen this character before?
    //Array is created by us and then filled with a default boolean value(False)by java and then we update its value
    //static-->All  rec calls share the same array
    //Non-Static-->For every call the array will reset to false
    public static void main(String[] args) {
        String str="abbccda";
        System.out.println("The string with duplicates is: "+str);
        removeDupli(str,arr,0,"");
    }
    public static void removeDupli(String str,boolean arr[],int idx,String newStr){
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
    }
} */


//7.Printing all the subsequences of a string
//Time Complexity--->O(2^n)(Calculated from G.P)
    /* public class Recursion2 {
    //Subsequences-->The characters in the new string must be in the same order
    public static void main(String[] args) {
        String str="abc";//Total no.of subsequences=2^n[No.of choices to the power of no.of elements]
        System.out.println("The subsequences of the string "+str+" are:");
        printSubseq(str,0,"");
    }
    //Totally 8(2^3) paths each path processes all 3 char(through recur levels0
    //And,each path reaches the base case(Exactly once)
    public static void printSubseq(String str,int idx,String newStr){
        if(idx==str.length()){//Base Call-->All indices are processed
            System.out.println(newStr);//Prints current subsequence(Each Path)
            return;
        }
        char currChar=str.charAt(idx);
        //If the currChar wants to be included in the new string
        printSubseq(str,idx+1,newStr+currChar);
        //If the currChar does not want to be included in the new string
        printSubseq(str,idx+1,newStr);
    }
} */


import java.util.HashSet;
//8.Printing all the unique subsequences of a string
//Time Complexity--->O(2^n)
    /* public class Recursion2{
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        //HashSet<String>--->Prevents printing duplicate subsequences
        printUniqueSub(str,0,"",set);
    }
    public static void printUniqueSub(String str,int idx,String newStr,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newStr)){//Checks if this subsequence was already generated before(If any duplicates )
            //If yes → Avoid printing again(Avoid Duplicates)
            return;
            }
            else{
                System.out.print(newStr);//Else prints  the string and adds  to the set(HashSet)
                return;
            }
            
        }
        char currChar=str.charAt(idx);
        //If currChar wants to be included in the newStr
        printUniqueSub(str, idx+1,newStr+currChar,set);//set is a shared memory(HashSet)across all the rec calls                                        
        //If currChar does not want to be included in the newStr
        printUniqueSub(str,idx+1,newStr,set);
    }
} */
    
    
//9.Printing Keypad Combination
//Time Complexity--->O(4^n),n=String length & 4-->Max choices per level
    /* public class Recursion8 {
    //static-->Can be accessible across the entire program(No object needed)
    //non-static-->Object is necessary
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};//A list that stores letters for each digit
    public static void main(String[]args){
        String str="23";
        System.out.println("The keypad combination for "+str+" is:");
        printComb(str,0,"");
    }
    public static void printComb(String str,int idx,String comb){
        if(idx==str.length()){//idx==2
            System.out.println(comb);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];
        //'0' is the starting point of digits in ASCII-->digit_char-'0'=actual number        
        //'0'=48,'1'=49,'2'=50
        for(int i=0;i<mapping.length();i++){//For loop waits until recursion finishes
            printComb(str,idx+1,comb+mapping.charAt(i));
        }
        //Program does not restart from beginning each time
        //It finishes all combinations of one branch (like d → dg dh di) before moving to next (e)
    }
    //For each letter:-->Go complete recursion
    //Then come back
    //Then next letter
} */


 
