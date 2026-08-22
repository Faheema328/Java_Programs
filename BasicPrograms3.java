//Basic Programs-3
import java.util.*;


//1.Finding the area of a circle
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of a circle:");
        int r=sc.nextInt();
        int area=(int)(3.14*r*r);
        System.out.println("The area of the circle of radius "+r+" is:"+area);
    }
} */
    
    
//2.Printing the table of a number using loop 
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    System.out.println("Enter the table:");
    int n=sc.nextInt();
    System.out.println("The table of "+n+" is:");
    for(int i=1;i<=10;i++){
        System.out.println(n+"x"+i+"="+n*i);
    }
}
} */
    

//3.A Simple Calculator 
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    System.out.println("Enter 2 numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int add=a+b;
    System.out.println("The addition of "+a+" and "+b+" is:"+add);
    int sub=a-b;
    System.out.println("The subraction of "+a+" and "+b+" is:"+sub);
    int mul=a*b;
    System.out.println("The multiplication of "+a+" and "+b+" is:"+mul);
    int div=a/b;
    System.out.println("The division of "+a+" and "+b+" is:"+div);
    int mod=a%b;
    System.out.println("The modulo of "+a+" and "+b+" is:"+mod);
    }
} */
    
    
//4.Printing the months of a year using switch
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    System.out.println("Enter a month:");
    String mon=sc.nextLine();
    switch(mon){
        case "j":
            System.out.println("January");
            break;
        case "f":
            System.out.println("February");
            break;
        case "m":
                System.out.println("March");
                break;
        case "a":
            System.out.println("April");
            break;
        case "may":
            System.out.println("May");
            break;
        case "ju":
            System.out.println("June");
            break;
        case "jul":
            System.out.println("July");
            break;
        case "au":
            System.out.println("August");
            break;
        case "s":
            System.out.println("September");
            break;
        case "o":
            System.out.println("October");
            break;
        case "n":
            System.out.println("November");
            break;
        case "d":
            System.out.println("December");
            break;
        default:
            System.out.println("Invalid Month");
            break;
    }
}
} */
    

//5.Average of 3 numbers
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    System.out.println("Enter 3 numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int avg=(a+b+c)/3;
    System.out.println("The avg of "+a+","+b+" and "+c+" is:"+avg);
}
} */      
    

//6.Printing all the even numbers till n
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    System.out.println("The even numbers from 0 to "+n+" are:");
    for(int i=0;i<=n;i++){
        if(i%2==0){
        System.out.print(i+" ");
    }
    }
}
} */
    

//7.Menu Driven Program
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    int n;
    do{
        System.out.println("Enter the mark:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Grade S");
        }
        else if(marks>=60 && marks<=89){
            System.out.println("Grade A");
        }
        else if(marks>=0 && marks<=59){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Invalid Marks");
        }
        System.out.println("Enter a number(Either 1 or 0):");
        //1-->To continue further
        //0-->To stop
        n=sc.nextInt();
    }while(n==1);
    if(n==0){
        System.out.println("Stop");
    }
}
} */
    

//8.Value of one number raised to the power of other(Finding Power)

//A)Using Loop
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    System.out.println("Enter two numbers:");
    int x=sc.nextInt();
    int n=sc.nextInt();
    int pow=1;
    for(int i=1;i<=n;i++){
        //Here n=power of x(How many times that the number x should multiply by itself)
        pow=pow*x;//1x2,2x2,4x2,8x2,16x2=32(For n(5) iterations)
    }
    System.out.println("The value of "+x+"^"+n+" is: "+pow);
    }
} */


//B)Without using loop[Using Power Function]
    /* public class BasicPrograms3{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int x=sc.nextInt();
    int n=sc.nextInt();
    System.out.println("The vale of "+x+"^"+n+" is:");
    int power=(int)Math.pow(x,n);
    System.out.println(power);

    //int power=(int)Math.power(x,n)-->Converts double to int  (or)
    //double power=Math.pow(x,n)--->Power returns double 
        }
    } */
    
    
//9.Reversing a string(Using StringBuilder)
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    System.out.println("Enter a string:");
    String str=sc.nextLine();//Takes every character
    String rev=new StringBuilder(str).reverse().toString();
    //StringBuilder creates a mutable(Changes can be made) copy of the string,reverses it efficiently,and returns it as a new String(To Rev)
    System.out.println("The string "+str+" after reversing is: "+rev);
    }
} */
    
    
//10.Reversing a string(Using Loop)
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    String revString="";
    for(int i=str.length()-1;i>=0;i--){
        revString=revString+str.charAt(i);
    }
    System.out.println("The string "+str+" after reversing is: "+revString);
    }
} */
    
    
//11.Creating an infinite loop using do-while condition
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    do{
        System.out.println("Iam Faheema");
    }while(true);
    }
} */
    
    
//12.Entering the numbers(+ve,-ve,0)till the user wants and then displaying their count
    /* public class BasicPrograms3 {
    public static void main(String[]args){
    int choice;
    int pos=0,neg=0,zero=0;
    do{
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num>0){
            pos++;
        }
        else if(num<0){
            neg++;
        }
        else{
            zero++;
        }
        System.out.println("Enter a choice to stop(0) or to continue(1)");
        choice=sc.nextInt();
        }while(choice==1);
        System.out.println("The pos count is: "+pos);
        System.out.println("The neg count is: "+neg);
        System.out.println("The zero count is: "+zero);
    }
} */


//13.Sum of odd numbers from 1 to n using function
    /* public class BasicPrograms3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int sum=0;
        int s=sumOfOdd(n,sum);
        System.out.print("\nThe sum of all the odd numbers from 1 to "+n+" is:"+s);
    }
    public static int sumOfOdd(int n,int sum){
    System.out.println("The odd numbers from 1 to "+n+" are:");
    for(int i=1;i<=n;i++){
    if(i%2 != 0){
    System.out.print(i+" ");
    sum+=i;
    }
    }
    return sum;
}
} */


//14.A function to take the radius of a circle as input and then return the circumference
    /* public class BasicPrograms3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius:");
    int r=sc.nextInt();
    double c=findCircum(r);
    System.out.println("The circum with radius"+ r+" is:"+c);
    }
    public static double findCircum(int r){
        double circumference=2*3.14*r;//Circum of a circle is 2*pie*radius
        return circumference;
    }
} */


//15.Returning if a person is eligible to vote or not
    /* public class BasicPrograms3{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age:");
    int age=sc.nextInt();
    boolean a=eligVote(age);
    if(a==true){
        System.out.println("Eligible to vote");
    }
    else{
        System.out.println("Not eligible to vote");
    }
}
    public static boolean eligVote(int age){
        if(age>=18){
            return true;//1--->Eligible to vote
        }
        else{
            return false;//0--->Not eligible to vote
        }
    }
} */


//16.GCD of two numbers
    /* public class BasicPrograms3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=findGcd(a,b);
        System.out.println("The GCD of "+a+" and "+b+" is:"+gcd);
}
public static int findGcd(int a,int b){
    //Keep replacing (a,b) with (b,a%b) until a%b=0
    //If a num divides both a&b then it also divides its remainder 
    while(b!=0){//Runs until rem!=0(when rem=0,GCD is found)
        int temp;//Reducing the numbers until GCD is found(Until rem=0)
        temp=b;
        b=a%b;
        a=temp;
    }
    return a;//(a=GCD now)
}
} */




    

