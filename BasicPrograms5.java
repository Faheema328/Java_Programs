//Basic Programs-5
//Bit Manipulation-->Directly operating on individual bits(0s and 1s)of a number instead of the whole number

//1.Get Bit(Knowing the bit(1 or 0)at the specific position)
/* public class BasicPrograms5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int pos=2;
        int bitMask=1<<pos;// Shift 1 to the left by 'pos' bits to create a mask
        if((bitMask & n)==0){//&-->BitWise AND
        //AND with n isolates the bit at 'pos'(only position 2 survives,everything else becomes 0)
            System.out.println("The bit was 0");
        }
        else{
            System.out.println("The bit was not zero");
        }
    }
} */

//2.Set Bit(Setting 1 at the place of 0 (at the specific position))
/* public class BasicPrograms5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int pos=1;
        int bitMask=1<<pos;
        int newNum=bitMask | n;//|-->BitWise OR
        // OR forces bit at 'pos' to 1, all other bits stay unchanged
        System.out.println("The new number after setting 1 at position "+pos+" is:"+newNum);
    }
} */

//3.Clear Bit(Fixing 0 at the place of 1(at the specific position))
/* public class BasicPrograms5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int pos=2;
        int bitMask=1<<pos;
        int newBitMask=~(bitMask);// Flip all bits → targeted position becomes 0, rest become 1
        int newNum=newBitMask & n;
        //AND with n → only position 'pos' is forced to 0, rest unchanged
        System.out.println("The new number after clearing a bit(Clear 1 and put 0) at position "+pos+" is:"+newNum);
    }
} */

//4.Update Bit(Update '1' to '0' (or) '0' to '1')-->Combination of SET bit and CLEAR bit
/* public class BasicPrograms5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int pos=1;
        int bitMask=1<<pos;
        System.out.println("Enter the operation that needs to be performed:");
        //1-->SET bit ; 0-->CLEAR bit
        int operation=sc.nextInt();
        if(operation==0){
            //CLEAR bit
            int newBitMask=~(bitMask);
            int newNum=newBitMask & n;
            System.out.println("The new number after clearing a bit(Clear 1 and fix 0)at position "+pos+" is:"+newNum);
        }
        else{
            //SET bit
            int newNum=bitMask | n;
            System.out.println("The new number after setting 1 at position "+pos+" is:"+newNum);
        }
    }
} */
import java.util.*;

//5.ArrayList-->A dynamic array in Java that stores objects in heap memory,allows indexed access and automatically changes its' size
    /* public class BasicPrograms5{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();

        //1.Adding elements into the ArrayList-->'.add()' function is used
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println("The array list of integers is:");
        System.out.println(list);

        //2.Getting  elements of the array list-->'.get()' function is used
        int element1=list.get(1);//1-->Index
        int element3=list.get(3);
        System.out.println("The element at index 1 is: "+element1);
        System.out.println("The element at index 3 is: "+element3);

        //3.Adding an element in between the array list-->'.add( , )' function is used
        list.add(1,1);//(1,1)-->(index,element)
        list.add(3,3);
        list.add(5,5);
        list.add(7,7);
        list.add(9,9);
        System.out.println("The array list after adding the elements in between is:");
        System.out.println(list);

        //4.Setting an element(Replacing) in the array list-->'.set( , )' function is used
        list.set(1,0);
        list.set(3,2);
        list.set(5,4);
        list.set(7,6);
        list.set(9,8);
        System.out.println("The array list after replacing certain elements is:");
        System.out.println(list);

        //5.Deleting an element in the array list-->'.remove()' function is used
        list.remove(0);//After each removal list shrinks
        list.remove(1);
        list.remove(3);
        list.remove(4);
        list.remove(4);
        System.out.println("The array list after deleting few elements is:");
        System.out.println(list);

        //6.Finding the size of the array list-->'list.size()'--> function is used
        int size=list.size();
        System.out.println("The size of the current array list is:");
        System.out.println(size);

        //7.Applying loop on the array list
        System.out.println("The elements of the array list are:");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();

        //8.Sorting the array list
        Collections.sort(list);//Sorting in ascending order
        //Collections =utility class, sort() = static method
        System.out.println("The array list after sorting is:");
        System.out.println(list);
    }
} */


//6.A function to return greatest among two numbers
    /* public class BasicPrograms5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int g=findGreater(a,b);
    System.out.println("The greater number is:"+ g);
    }
    public static int findGreater(int a,int b){
        if(a>b){
            return a;
        }
        else if(b>a){
            return b;
        }
        else{
            System.out.println("Both "+a+" and "+b+" are equal");
            return a;//Here a=b
        } 
    }
} */


//7.Factorial of a number using function
    /* public class BasicPrograms5 {
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int fact=1;
        int factorial=calFac(n,fact);
        System.out.println("The factorial of "+n+" is:"+factorial);

    }
    public static int calFac(int n,int fact){
        if(n==0 || n==1){
            return 1;
        }
        if(n<0){
            System.out.println("Invalid Factorial");
            return -1;
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
} */


//8.Checking whether a number is prime or not using function
    /* public class BasicPrograms5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        boolean result=primeOrNot(n);
        if(result==true){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
    public static boolean primeOrNot(int n){
        if(n<2){//Prime numbers start from 2
            return false;
        }
        for(int i=2;i<n;i++){//A prime number is not divisible by any number between 2 and n-1
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
} */


//9.Checking whether a number is composite or not using function
    /* public class BasicPrograms5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        boolean result=compositeOrNot(n);
        if(result==true){
            System.out.println(n+" is a composite number");
        }
        else{
            System.out.println(n+" is not a composite number");
        }
    }
    public static boolean compositeOrNot(int n){
        if(n<4){//Composite numbers start from 4
            return false;
        }
        for(int i=2;i<n;i++){//A composite number is divisible by any number between 2 and n-1
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
} */



//10.Program to Convert a String to Uppercase Using 'toUpperCase()'
    /* public class BasicPrograms5{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string:");
            String str=sc.nextLine();
            String newStr=str.toUpperCase();
            System.out.println("The new string after converting the old string to upper case is:");
            System.out.println(newStr);
            sc.close();//It closes the Scanner object after we're done using it
            //This is done to free the resource java was using to save the memory
        }
    }  */


//toUpperCase() and toLowerCase() return a new String object
//If we assign the returned String to the same variable (s = s.toLowerCase())
//The variable 's' starts pointing to the new String object instead of the old one
//The original String object is never modified because "Strings are immutable"
//The returned String can be stored in the same variable or a different String variable.


//11.Program to Convert a String to Lowercase Using 'toLowerCase()'
    /* public class BasicPrograms5{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string:");
            String str=sc.nextLine();
            String newStr=str.toLowerCase();
            System.out.println("The new string after converting the old string to lower case is:");
            System.out.println(newStr);
            sc.close();//Saves memory by freeing the resource java was using(Unnecessarily,Though after the work is completed)
        }
    } */

        
//12.Using ternary operator to find whether a number is odd or even
    /* public class BasicPrograms5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        String result=(n%2==0)?"Even":"Odd";//The ternary operator returns a value that must be stored or passed to a method
        System.out.println("The number "+n+" is:"+result);
    }
} */


//13.Printing emojis' and a name using Unicodes
    /* public class BasicPrograms5{
    public static void main(String[] args) {
        String heart="\uD83E\uDE77";
        String star="\u2B50";
        String eyes="\uD83D\uDC40";

        System.out.println("Heart: "+heart);
        System.out.println("Star: "+star);
        System.out.println("Eyes: "+eyes);
        System.out.println("\u0046\u0061\u0068\u0065\u0065\u006D\u0061");//Prints "Faheema"
    }
} */


//14.Reversing a number using String conversion
    /* public class BasicPrograms5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a long number:");
    long n=sc.nextLong();

    String str1=Long.toString(Math.abs(n));//Number to string
    //Math.abs(n)-->Returns +ve value
    StringBuilder sb=new StringBuilder(str1);//Creates a StringBuilder object that stores a copy of str1(To modify it)
    String str2=sb.reverse().toString();//toString() is called because reverse() returns a StringBuilder,but str2 must store a String
    Long result=Long.parseLong(str2);//String to number
    System.out.println("The reverse of "+n+" using string builder is:"+result);

    //Long class contains toString method
    //String class does not contain toLong method
}
} */


//

