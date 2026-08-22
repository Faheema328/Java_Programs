//Basic Programs-1
import java.util.*;


//1.Login Authentication
    /* public class BasicPrograms1{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the users' name and password:");
        String name=sc.nextLine();
        String password=sc.nextLine();//Gets the whole string
        String actualname="Shaik Faheemunnisa";
        String actualpassword="2228";
        if(actualname.equals(name) && actualpassword.equals(password)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Unsucessful Login");
        }
    }
}*/
    
    
//2.Factorial of a number
    /* public class BasicPrograms1{
    public static void main(String[]args){
    System.out.println("Enter a number:");
            int n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            System.out.println("The factorial of "+n+" is "+fact);
        }
    } */
    
    
//3.Swapping two numbers

//A)Without using temp variable
    /* public class BasicPrograms1{
    public static void main(String[]args){
    System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swap the numbers are: "+a+" , "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap the numbers are: "+a+" , "+b);
}
} */
    

//B)With using temp variable
    /* public class BasicPrograms1{
    public static void main(String[]args){
    System.out.println("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Before swap the numbers are:"+a+","+b);
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println("After swap the numbers are:"+a+","+b);
}
} */
    

//4.Prime number or not
    /* public class BasicPrograms1{
    public static void main(String[]args){
    System.out.println("Enter a number:");
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
    }
}
} */
    

//5.Fibonacci Series
    /* public class BasicPrograms1{
    public static void main(String[]args){
    int a=0;
        int b=1;
        System.out.println("The fibonacci series is:");
        for(int i=1;i<=10;i++){
        System.out.print(a+" ");//a-->Current;b-->Next;c-->Future
        int c=a+b;
        a=b;
        b=c;
        }
    }
} */
    
    
//6.Reversing a number
    /* public class BasicPrograms1{
    public static void main(String[]args){
    System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rev=0;//Initially,the reversed number is 0-->It will be built digit by digit
        while(n>0){
            int digit=n%10;//Extracts the last digit(remainder when divided by 10)
            rev=rev*10+digit;//Moves the previous digits left(To make space for the new digit)and adds it to the reversed number
            n=n/10;//Removes the last digit(quotient after division by 10)
        };
        System.out.println("The reverse of the number is:");
        System.out.println(rev);
    }
} */
    
    
//7.Palindrome or not
    /* public class BasicPrograms1{
    public static void main(String[]args){
    System.out.println("Enter a number:");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;//Initially,No rev yet!
        while(n>0){
            int digit=n%10;//Extracts the last digit
            rev=rev*10+digit;//Build reverse
            n/=10;//Removes the digit from the original number
        };
        if(temp==rev){
            System.out.println(temp+" is a palindrome");
        }
        else{
            System.out.println(temp+" is not a palindrome");
        } 
    }
} */
    
    
//8.Armstrong Number
    /* public class BasicPrograms1{
    public static void main(String[]args){
    System.out.println("Enter a number:");
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
            }
        }
    } */
    
    
//9.Length of an array
    /* public class BasicPrograms1{
    public static void main(String[]args){
    int a[]={2,8,5,4,9};
        int count=a.length;
        System.out.println("The length of the array is:"+count);
    }
}
 */    


//10.Sum of the elements in an array
    /* public class BasicPrograms1{
    public static void main(String[]args){
    int a[]={1,2,3,4,5};
    int sum=0;
    for(int i=0;i<a.length;i++){
        sum=sum+a[i];
    }
    System.out.println("The sum of array is:"+sum);
}
    } */
    

//11.Smallest in an array
    /* public class BasicPrograms1{
    public static void main(String[]args){
    int a[]={8,2,7,3,6,9,4,5,};
    int min=a[0];//Assumption
    for(int i=1;i<a.length;i++){
        if(a[i]<min){//Checking 
            min=a[i];
        }
    }
    System.out.println("The smallest number in the array is:"+min);
}
} */
    

//12.Largest in an array
    /* public class BasicPrograms1{
    public static void main(String[]args){
    int a[]={7,3,5,8,1,4,6};
    int max=a[0];//Assuming
    for(int i=1;i<a.length;i++){
    if(a[i]>max){
        max=a[i];
    }
}
System.out.println("The largest number in the array is:"+max);
    }
} */
    
    
//13.Sum of the digits in a number
    /* public class BasicPrograms1{
    public static void main(String[]args){
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int sum=0;
    while(n>0){
    int digit=n%10;
    sum=sum+digit;
    n/=10;
}
System.out.println("The sum of the digits of the number is:"+sum);
}
} */
    

//14.Printing the table of a number using switch
    /* public class BasicPrograms1{
    public static void main(String[]args){
   System.out.println("Enter a number:");
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
}
}
} */


//15.Work of a traffic signal using switch
    /* public class Basic {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter a signal(r/y/g):");
char ch=sc.next().charAt(0);//Character at index 0 is taken
switch(ch){
    case 'r':
        System.out.println("Stop");
        break;
    case 'y':
        System.out.println("Wait");
        break;
    case 'g':
        System.out.println("Go");
        break;
    default:
        System.out.println("Invalid Signal");
        break;
}
    }
} */

        