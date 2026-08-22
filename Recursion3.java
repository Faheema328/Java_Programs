import java.util.*;


//1.Printing all the permutations of a string
//Time Complexity--->O(n!)-->n(n-1)(n-2).....1-->Neglecting constants-->O(n!)
    /* public class Recursion3 {
    public static void main(String[]args){
        String str="abc";
        printPerm(str,"");
    }
    public static void printPerm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){// Loop to fix each character one by one
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);//Remove current character from string(Default is abc)
        //substring(0,i) → Get left part
        //substring(i+1) → Get right part
        //combine → Skips currChar
            printPerm(newStr,permutation+currChar);
        //newStr → Remaining characters (not used yet)
        //permutation+currChar → adds chosen character to result(Default is " ")
        }
    }
} */


//2.Counting total paths in a maze to move from (0,0) to (n,m) i.e (3,3)
    /* public class Recursion3{
    public static void main(String[] args) {
        int totalPaths=countPath(0,0,3,3);
        System.out.println("The total no. of paths required to move from (0,0) to (n,m) i.e (3,3) is:");
        System.out.println(totalPaths);
    }
    public static int countPath(int i,int j,int n,int m){
        //i,j-->Indices of rows and coloumns
        //n,m-->Total no. of rows and coloumns
        if(i==n || j==m){//We crossed the matrix boundary
            return 0;
        }
        if(i==n-1 && j==m-1){//Reached the destination(Bottom Right)
            return 1;
        }
        int downPath=countPath(i+1,j,n,m);
        int rightPath=countPath(i,j+1,n,m);
        int total=downPath+rightPath;
        return total;
    }
    //Valid Indices for n=m=3 are: 0,1,2
    //So,the grid becomes:
       //(0,0) (0,1) (0,2)
       //(1,0) (1,1) (1,2)
       //(2,0) (2,1) (2,2)
} */


//3.Placing tiles of size 1xm(1x2) in a floor of size nxm(4x2)
    /* public class Recursion3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n and m:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ways=placeTiles(n,m);
        System.out.println("The tile of size 1x"+m+" is placed in a floor of size "+n+"x"+m+" in: "+ways+" ways");
    }
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;//All ver or All hor
        }
        if(n<m){
            return 1;//Only hor placement
        }
        //Vertically placed tile occupies "m" rows        
        int vertPlacements=placeTiles(n-m,m);//Remaining floor-->(n-m)xm
        //Horizontally placed tile occupies "1" row
        int horPlacements=placeTiles(n-1,m);//Remaining floor-->(n-1)xm;
        int totalWays=vertPlacements+horPlacements;
        return totalWays;
    }
} */
       
    
//4.Finding the no. of ways in which i can invite n people to my party(Single or in Pairs)
    /* public class Recursion3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int ways=invitePeople(n);
        System.out.println("Total no. of ways to invite "+n+" people to my party(Single or in Pairs) is:");
        System.out.println(ways);
    }
    public static int invitePeople(int n){
        //n<1-->When no body left(0)-->1 valid arrangement(Do nothing)-->Empty Arrangement=1 valid way
        if(n<=1){
        return 1;
        }
        //Single
        int way1=invitePeople(n-1);//Choose one person as single-->Remaining (n-1) ppl can arrange among themselves recursively
        //Pairs
        int way2=(n-1)*invitePeople(n-2);//Chosing partner for 1st person(n-1 choices)*Remaining (n-2) ppl can arrange among themselves recursively
        int totalWays=way1+way2;
        return totalWays;
    }
} */
    

//5.Printing all the subsets of a set of 1st 'n' natural numbers
//Time Complexity--->O(n*2^n)--->Total no. of subsets = 2^n
//O(n)-->Printing Subsets;O(2^n)-->Total Subsets
    /* public class Recursion3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        ArrayList<Integer> subset=new ArrayList<>();
        //ArrayList-->When size changes dynamically(Adding&Removing)
        //ArrayList=A dynamic array that stores objects of integer type
        //new-->Creates an object in the memory
        //ArrayList<>()-->Creates an empty ArrayList
        System.out.println("The subsets of a set from 1 to "+n+" are:");
        findSubsets(n,subset);
    }
    public static void findSubsets(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubsets(subset);
            return;
        }
        //Jab add hoga
        subset.add(n);
        findSubsets(n-1,subset);
        //Jab add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1,subset);
    }
    public static void printSubsets(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();//Moves to next line after printing the entire subset
    }
} */


    
    
    

