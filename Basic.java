import java.util.*;
//Basic Programs
public class Basic {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    //16.Work of a traffic signal using switch
   /* System.out.println("Enter a signal(r/y/g):");
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
} */
   //17.Finding the no.of even digts in number of long type(Big Number)
   /* System.out.println("Enter a big number:");
   long num=sc.nextLong();
   long original=num;
   long digit;
   int even=0;
   long evendigit=0;
   while(num>0){
    digit=num%10;
    if(digit%2==0){
        even++;
        evendigit=evendigit*10+digit ;
    }
    num=num/10;
   }
   System.out.println("The no.of even digits in "+original+" are:"+even);
   System.out.println("The even digits in "+original+" are:");
   System.out.print(evendigit); */
    //18.Building a simple calculator using switch
/*     System.out.println("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();//nextInt() doesn't consume the new line(\n)
    sc.nextLine();//Consume leftover newline
    System.out.println("Enter the operator:");
    String operator=sc.nextLine();
    //If both nextInt() or nextDouble() and nextLine()are together a buffer will occur 
    //i.e nextLine() gets trapped by the Leftover Enter.To prevent this sc.nextLine is used just after sc.nextInt()
    //or just before sc.nextline() 
    switch(operator){
        case "+":
            int add=a+b;
            System.out.println("The sum of "+a+" and "+b+" is:"+add);
            break;
        case "-":
            int sub=a-b;
            System.out.println("The diff of "+a+" and "+b+" is:"+sub);
            break;
        case "*":
            int mul=a*b;
            System.out.println("The product of "+a+" and "+b+" is:"+mul);
            break;
        case "/":
            if(b==0){
                System.out.println("Invalid Division");
                break;
            }
            else{
                int div=a/b;//If it is written at the very start(When b=0)--->Program Crashes
                System.out.println("The div of "+a+" and "+b+" is:"+div);
                break;
            }
        case "%":
        if(b==0){
            System.out.println("Invalid Division");
            break;
        }
        else{
            int mod=a%b;//If it is written at the very start(When b=0)--->Program Crashes
            System.out.println("The remainder when "+a+" is divided with "+b+" is:"+mod);
            break;
        }
} */

    }
}
