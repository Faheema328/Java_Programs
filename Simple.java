import java.util.*;
//Basic Programs
public class Simple {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    //1.Login Authentication
    /* System.out.println("Enter the users' name and password:");
        String name=sc.nextLine();
        String password=sc.nextLine();//Gets the whole string
        String actualname="Shaik Faheemunnisa";
        String actualpassword="2228";
        if(actualname.equals(name) && actualpassword.equals(password)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Unsucessful Login");
        } */
    //2.Factorial of a number
    /* System.out.println("Enter a number:");
            int n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            System.out.println("The factorial of "+n+" is "+fact); */
    //3.Swapping two numbers without using temp variable
    /* System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swap the numbers are: "+a+" , "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap the numbers are: "+a+" , "+b); */
    //4.Swapping using temp variable
    /* System.out.println("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Before swap the numbers are:"+a+","+b);
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println("After swap the numbers are:"+a+","+b); */
    //5.Prime number or not
    /* System.out.println("Enter a number:");
    int n=sc.nextInt();
    boolean isprime=true;
    for(int i=2;i<n;i++){
        if(n%i==0)
             isprime=false;
        break;
    }
    if(isprime && n>1){
        System.out.println(n+" is a prime number");
    }
    else{
        System.out.println(n+" is not a prime number");
    } */
    //6.Fibonacci Series
    /* int a=0;
        int b=1;
        System.out.println("The fibonacci series is:");
        for(int i=1;i<=10;i++){
        System.out.print(a+" ");//a-->Current;b-->Next;c-->Future
        int c=a+b;
        a=b;
        b=c;
        } */
    //7.Reversing a number
    /* System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int digit=n%10;//Getting the digit
            rev=rev*10+digit;//Building reverse
            n=n/10;//Removing the last digit
        };
        System.out.println("The reverse of the number is:");
        System.out.println(rev); */
    //8.Palindrome or not
    /*System.out.println("Enter a number:");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(n>0){
            int digit=n%10;//Get the digit
            rev=rev*10+digit;//Build reverse
            n/=10;//Remove the digit
        };
        if(temp==rev){
            System.out.println(temp+" is a palindrome");
        }
        else{
            System.out.println(temp+" is not a palindrome");
        }  */
    //9.Armstrong Number
    /* System.out.println("Enter a number:");
            int n=sc.nextInt();
            int temp=n;
            int arm=0;
            while(n>0){
            int digit=n%10;
            arm=arm+digit*digit*digit;//Building an armstrong number
            n=n/10;
            }
            if(temp==arm){
                System.out.println(temp+" is an armstrong number");
            }
            else{
                System.out.println(temp+" is not an armstrong number");
            } */
    //10.Counting the number of elements in an array
    /* int a[]={2,8,5,4,9};
        int count=a.length;
        System.out.println("The length of the array is:"+count); */
    //11.Sum of the elements in an array
    /* int a[]={1,2,3,4,5};
    int sum=0;
    for(int i=0;i<a.length;i++){
        sum=sum+a[i];
    }
    System.out.println("The sum of array is:"+sum); */
    //12.Smallest in an array
    /* int a[]={8,2,7,3,6,9,4,5,};
    int min=a[0];//Assumption
    for(int i=1;i<a.length;i++){
        if(a[i]<min){//Checking 
            min=a[i];
        }
    }
    System.out.println("The smallest number in the array is:"+min); */
    //13.Largest in an array
    /* int a[]={7,3,5,8,1,4,6};
    int max=a[0];//Assuming
    for(int i=1;i<a.length;i++){
    if(a[i]>max){
        max=a[i];
    }
}
System.out.println("The largest number in the array is:"+max); */
    //14.Sum of the digits in a number
    /* System.out.println("Enter a number:");
    int n=sc.nextInt();
    int sum=0;
    while(n>0){
    int digit=n%10;
    sum=sum+digit;
    n/=10;
}
System.out.println("The sum of the digits of the number is:"+sum);*/
    //15.Printing the table of a number using switch
   /* System.out.println("Enter a number:");
    int n=sc.nextInt();
    System.out.println("The table of "+n+" is:");
    switch(n){
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
        break;
    default:
    System.out.println("Invalid Case");
    break;
} */
}
    }
        