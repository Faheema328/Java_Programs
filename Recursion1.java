import java.util.*;


//1.Printing numbers from n to 1
    /* public class Recursion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(n);
        // Prints current n, then recursively prints (n-1 to 1)    
            printNumbers(n-1);
        }
    }
} */


//2.Printing numbers from 1 to n
    /* public class Recursion1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int current=1;
        printNumbers(n,current);
    }
    public static void printNumbers(int n,int current){
        if(current>n){
            return;
        }
        else{
            System.out.print(current+" ");
            printNumbers(n,current+1);
        }
    }
} */


//3.Print the sum of n numbers(1 to n)
    /* public class Recursion1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int sum=0;
    int i=1;
    printSum(n,sum,i);
    }
    public static void printSum(int n,int sum,int i){
        if(i>n){
            System.out.println("The sum of 1st "+n+" numbers is:"+sum);//Print the sum and then return
            return;
        }
    else{
    sum+=i;
    printSum(n,sum,i+1);
}
}
} */


//4.Print factorial of n
    /* public class Recursion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int factorial=calFac(n);
        System.out.println("The factorial of "+n+" is:"+factorial);
    }
    public static int calFac(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
        int fac_nm1=calFac(n-1);//Fac(n)=n*Fac(n-1)--->Fac(5)=5*4!
        int fac_n=n*fac_nm1;
        return fac_n;
        }
}
} */


//5.Fibonacci Series
    /* public class Recursion1 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of fibonacci terms:");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println("The fibonacci series is:");
        if(n==1){
            System.out.println(0);
        }
        else if(n>=2){
            System.out.println(a);
            System.out.println(b);
        }
        fib(a,b,n-2);
}
public static void fib(int a,int b,int n){
    if(n<=0){
        return;
    }
    else{
        int c=a+b;
        System.out.print(c);
        fib(b,c,n-1);//n-1-->Reduces remaining terms by 1
    }
}
} */


//6.Print x^n(Stack Height=n)
    /* public class Recursion1 {
    public static void main(String[] args) {
        //Here,
        //No.of stacks=6(Excluding Main)
        //n=5
        //Approximately both are considered as equal
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of x and n:");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int power=calPow(x,n);
        System.out.print("The value of "+x+"^"+n+" is:"+power);
}
public static int calPow(int x,int n) {
    if(n==0){//x^0=1
        return 1;
    }
    if(x==0){//0^n=0
        return 0;
    }
    int xpownm1=calPow(x,n-1);
    int xpown=x*xpownm1;//x^n=x*x^n-1
    return xpown;
    
}
}*/


//7.Print x^n(Stack Height=Log n)
    /* public class Recursion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of x and n:");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int pow=calPow(x,n);
        System.out.print("The value of "+x+"^"+n+" is:"+pow);
}
public static int calPow(int x,int n) {
    if(n==0){//x^0=1
        return 1;
    }
    if(x==0){//0^n=0
        return 0;
    }
    int half=calPow(x,n/2);
    if(n%2==0){
        return half*half;
    }
    else{
        return half*half*x;
    }
}
} */



