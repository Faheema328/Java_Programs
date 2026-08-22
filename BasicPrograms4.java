//Basic Programs-4
import java.util.*;

//String--->Immutable(Once a String is created in memory,its value can never be changed — any modification creates a new String instead)

//1.Concatenating two strings
    /* public class BasicPrograms4 {
    public static void main(String[]args){
        String firstname="Shaik ";
        String secondname="Faheemunnisa";
        String fullname=firstname+secondname;
        System.out.println("Concatenation of string 1 "+firstname+" and string 2 "+secondname+" gives:");
        System.out.println(fullname);    
    }
} */


//2.Printing the length of a string
    /* public class BasicPrograms4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd string:");
        String str2=sc.nextLine();
        String fullString=str1+str2;
        System.out.println("The string is: "+fullString);
        int strLen=fullString.length();
        System.out.println("The length of "+fullString+" is:"+strLen);
    }
} */


//3.Accessing characters of a string
    /* public class BasicPrograms4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("The string is: "+str);
        System.out.println("The characters of the string "+str+" are:");
        for(int i=0;i<str.length();i++){
            char charStr=str.charAt(i);
            System.out.println(i+1+". "+charStr);
        }    
    }
} */


//4.Comparing two strings
    /* public class BasicPrograms4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd string:");
        String str2=sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("String 1-"+str1+" and String 2-"+str2+" are equal");
        }
        else{
            System.out.println("String 1-"+str1+" and String 2-"+str2+" are not equal");
        }
        //if(str1 == str2)--->WRONG - compares references,not values
    }
} */


//5.Taking an array of strings as input from the user and find the cumulative(combined) length of all those strings in the array
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        sc.nextLine();//Flushes out left over buffer
        String strArr[]=new String[size];//Allocating memory to the string array
        System.out.println("Enter strings into the array:");
        for(int i=0;i<strArr.length;i++){
            strArr[i]=sc.nextLine();
        }
        System.out.println("The resultant string array is:");
        System.out.print("{");
        for(int i=0;i<strArr.length;i++){
            System.out.print(strArr[i]+",");
        }
        System.out.println("}");
        int cumLen=0;
        for(int i=0;i<strArr.length;i++){//Loop for calculating cumulative length
            cumLen+=strArr[i].length();
        }
        System.out.println("The cumulative length of all the strings in the array is: "+cumLen);
    }
} */


//6.Inputing a string from the user and replacing the letter 'e' in the string with 'i'
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String reqStr="";
        for(int i=0;i<str.length();i++){//Loop to replace letter 'e' with 'i' in the string
            if(str.charAt(i)=='e'){
                reqStr+='i';
            }
            else{
                reqStr+=str.charAt(i);
            }
        }
        System.out.println("The string "+str+" after replacing the letter 'e' with 'i' is: "+reqStr);
    }
} */


//7.Inputing an email from the user and then creating a username from the e-mail by deleting the part that comes with @
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an e-mail(string):");
        String email=sc.nextLine();
        String reqUsername="";
        for(int i=0;i<email.length();i++){//Loop to delete the part that comes after '@'
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                reqUsername+=email.charAt(i);
            }
        }
        System.out.println("The e-mail(string) "+email+" after deleting the part after '@' is: "+reqUsername);
        System.out.println("So, the username is "+reqUsername);
    }
}
*/


//StringBuilder--->Unlike string this is mutable(It can be modified without creating a new object)


//8.Declaring a stringbuilder
    /* public class BasicPrograms4{
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Faheema");
        System.out.println("The string created using stringbuilder is: "+sb);
    }
} */


//9.Getting characters through the indices
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("The characters at different indices are:");
        for(int i=0;i<sb.length();i++){
            System.out.println("The character at index "+i+" is:"+sb.charAt(i));
        }
    }
} */


//10.parseInt-String to int
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string of numbers:");
        String str=sc.nextLine();
        int num=Integer.parseInt(str);//Converts String "123" to int 123
        //"123" is text, 123 is a number — same digits but completely different types
        System.out.println("The number is:"+num);
    }
} */


//11.toString-int to String
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        String str=Integer.toString(num);// Converts int 123 to String "123"
        System.out.println("The string of numbers is:"+num);
        System.out.println("The length of the converted number string is:"+str.length());
    }
} */


//12.Setting a char at some index(Replacing the current char)
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Enter a index:");
        int idx=sc.nextInt();
        System.out.println("Enter a character:");
        char character=sc.next().charAt(0);
        sb.setCharAt(idx,character);//Setting char
        System.out.println("The new string after setting(replacing) the char at index "+idx+" with "+character+" is:"+sb);
    }
} */


//13.Inserting a char at some index(Not replacing)
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Enter a index:");
        int idx=sc.nextInt();
        System.out.println("Enter a character:");
        char character=sc.next().charAt(0);
        sb.insert(idx,character);
        System.out.println("The string after inserting the char "+character+" at index "+idx+" is:"+sb);
    }
} */


//14.Deleting a char at some index
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Enter a index:");
        int idx=sc.nextInt();
        sb.delete(idx,idx+1);//Starts deleting from si to ei excluding 'ei'
        System.out.println("The string after deleting the char at index "+idx+" is:"+sb);
    }
}*/


//15.Appending a char(Adding smtg at the end)
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Enter a string that needs to be appended:");
        String appStr=sc.nextLine();
        sb.append(appStr);
        System.out.println(str+" after being appended with "+appStr+" is:"+sb);
    }
} */


//16.Printing the length of a string using StringBuilder
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("The length of "+sb+" is:"+sb.length());
    }
} */


//17.Reversing a string using StringBuilder
    /* public class BasicPrograms4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length()/2;i++){//Loop only goes till halfway — swapping both ends covers the full string
            int frontIndex=i;
            int backIndex=sb.length()-1-i;// Mirror index of front from the other end
            char frontChar=sb.charAt(frontIndex);
            char backChar=sb.charAt(backIndex);
            //Swap:place each char at the opposite position
            sb.setCharAt(frontIndex,backChar);
            sb.setCharAt(backIndex,frontChar);
        }
        System.out.println("The string "+str+" after being reversed using stringbuilder is: "+sb);
    }
} */

