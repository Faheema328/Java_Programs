import java.util.*;
public class Recursion4{
    //Tower of Hanoi
    //Time Complexity--->O(2^n-1)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* System.out.println("Enter the number of disks:");
        int n=sc.nextInt();
        towerOfHanoi(n,"S","H","D"); */  
    }
    /* public static void towerOfHanoi(int n,String src,String help,String dest){
        if(n==1){//n=No.of disks
            System.out.println("Transfer disk 1 "+"from "+src+" to "+dest);
            return;
        }
    towerOfHanoi(n-1,src,dest,help);//n-1 disks from S to H(Dest)(D-Help)
    System.out.println("Transfer disk "+n+" from "+src+" to "+dest);//nth disk from S to D
    towerOfHanoi(n-1,help,src,dest);//n-1 disks from H(Src) to D(S-Helper)
    }  */
}
/* n = 2
1. First recursive call → n becomes 1 → base case runs → print disk 1
2. Return to n = 2 → print disk 2
3. Second recursive call → new call with n = 1 → base case runs again → print disk 1
4.---Recursion End---*/

/* When n=2-->At 1st rec call n becomes n-1(2 becomes 1)and now here n=1(Base Case executes)
After that for n=2 the print stmt under 1st rec call executes
Now the execution goes to the 3rd rec call and again here n becomes n-1(2 becomes 1)and now here again
n becomes(2 becomes 1)(Base Case executes again)
Finally,the recursive call for n=2 is completed */

/* ---For n=2----
Base case(1),Prints 2,Base case(1)--->1+2+1
---For n=3---
(n-2)+3+(n-2)
So totally,
1,2,1+3+1,2,1
 */