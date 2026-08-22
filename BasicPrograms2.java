//Basic Programs-2
import java.util.*;


//1.Finding the no.of even digts in number of long type(Big Number)
    /* public class Basic {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a big number:");
    long num=sc.nextLong();
    long original=num;
    int digit;
    int even=0;
    long evenDigit=0;
    while(num>0){
    digit=(int)num%10;//Since num is long,num%10 also gives long result irrespective of the single digit fits in int
    //So,We must explicitly cast long-->int or declare digit as long
    if(digit%2==0){
        even++;
        evenDigit=evenDigit*10+digit;//Digits get stored in the form of a number
    }
    num=num/10;
   }
   System.out.println("The no.of even digits in "+original+" are:"+even);
   System.out.println("The even digits in "+original+" are:");
   System.out.print(evenDigit);
}
} */
  

//2.Building a simple calculator using switch
   /* public class Basic {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();//nextInt() doesn't consume the new line(\n)
    sc.nextLine();//Consume leftover newline
    System.out.println("Enter the operator:");
    String operator=sc.nextLine();
    //If both nextInt() or nextDouble() and nextLine()are together a buffer will occur 
    //i.e nextLine() gets trapped by the Leftover Enter.To prevent this sc.nextLine is used just after sc.nextInt()
    //or just before sc.nextline() to clear the buffer
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
                int div=a/b;//If it is written at the very start and(When b=0)--->Program Crashes
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
}
}
}*/


//3.Taking an array of numbers as input from the user and printing its elements
   /* public class Basic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arrNumbers[]=new int[size];
        System.out.println("Enter the numbers into the array:");
        for(int i=0;i<arrNumbers.length;i++){                                                   
            arrNumbers[i]=sc.nextInt();
        }
        System.out.println("The resultant array of numbers is:");
        System.out.print("{");
        for(int i=0;i<arrNumbers.length;i++){
            System.out.print(arrNumbers[i]+",");
        }
        System.out.print("}");
    }
}  */


//4.Taking an array of names as input from the user and printing them
   /* public class Basic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        sc.nextLine();//Flushes leftover newline
        String arrNames[]=new String[size];
        System.out.println("Enter names into the array:");
        for(int i=0;i<arrNames.length;i++){
            arrNames[i]=sc.nextLine();
        }
        System.out.println("The resultant array of names is:");
        System.out.print("{");
        for(int i=0;i<arrNames.length;i++){
            System.out.print(arrNames[i]+",");
        }
        System.out.print("}");
    }
} */


//5.Finding max and min number in an array of integers
   /* public class Basic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arrNum[]=new int[size];
        System.out.println("Enter numbers into the array:");
        for(int i=0;i<arrNum.length;i++){
            arrNum[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        System.out.print("{");
        for(int i=0;i<arrNum.length;i++){
            System.out.print(arrNum[i]+",");
        }
        System.out.println("}");
        int originalArr[]=arrNum.clone();
        int min=Integer.MAX_VALUE;//Start with largest value so that any of the input can replace it
        int max=Integer.MIN_VALUE;//Start with smallest value so that any of the input can replace it
        for(int i=0;i<arrNum.length;i++){
            if(arrNum[i]<min){
                min=arrNum[i];
            }
            if(arrNum[i]>max){
                max=arrNum[i];
            }
        }
        System.out.println("The min number in the array "+Arrays.toString(originalArr)+" is:"+min);
        System.out.println("The max number in the array "+Arrays.toString(originalArr)+" is:"+max);
    }
        //Without Arrays.toString(originalArr)--->We'll get garbage value being printed
} */

    
//6.Taking an array of numbers as input from the user and checking whether the array is sorted in ascending order 
    /* public class Basic{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int size=sc.nextInt();
            int arrNum[]=new int[size];
            System.out.println("Enter numbers into the array:");
            for(int i=0;i<arrNum.length;i++){
                arrNum[i]=sc.nextInt();
            }
            System.out.println("The elements of the array are:");
            System.out.print("{");
            for(int i=0;i<arrNum.length;i++){
                System.out.print(arrNum[i]+",");
            }
            System.out.println("}");
            int originalArr[]=arrNum.clone();
            boolean isAscending=true;
            for(int i=0;i<arrNum.length-1;i++){//Length-1-->To avoid comparing last element with out-of-bounds index
                if(arrNum[i]>arrNum[i+1]){
                    isAscending=false;
                }
            }
            if(isAscending==true){
                System.out.println("The array "+Arrays.toString(originalArr)+" is in ascending order");
            }
            else{
                System.out.println("The array "+Arrays.toString(originalArr)+" is not in ascending order");
            }
        }
    } */
   
   
//7.Taking a matrix as input from the user and then printing the matrix
    /* public class Basic{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no. of rows:");
            int rows=sc.nextInt();
            System.out.println("Enter the no. of coloumns:");
            int cols=sc.nextInt();
            int numMat[][]=new int[rows][cols];//2-D array
            System.out.println("Enter elements into the matrix:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    numMat[i][j]=sc.nextInt();
                }
            }
            System.out.println("The resultant matrix is:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                System.out.print(numMat[i][j]+" ");
                }
                System.out.println();
            }
        }
    } */


//8.Searching for an element 'x' in a matrix
    /* public class BasicPrograms2{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no. of rows:");
            int rows=sc.nextInt();
            System.out.println("Enter the no. of coloumns:");
            int cols=sc.nextInt();
            int numMat[][]=new int[rows][cols];
            System.out.println("Enter elements into the matrix:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    numMat[i][j]=sc.nextInt();
                }
            }
            System.out.println("The resultant matrix is:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    System.out.print(numMat[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Enter an element that is need to be fetched:");
            int x=sc.nextInt();
            boolean found=false;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(numMat[i][j]==x){
                        System.out.println("The element "+x+" is found in the matrix at: "+"("+i+","+j+")");
                        found=true;
                    }
                }
            }
            if(found==false){
            System.out.println("The element "+x+" is not found in the matrix");
            }
        }
    } */


//9.Transposing a matrix of order nxm
    /* public class BasicPrograms2{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of m(Rows):");
            int m=sc.nextInt();//n-->rows
            System.out.println("Enter the value of n(Cols):");
            int n=sc.nextInt();//m-->cols
            int arr[][]=new int[m][n];
            System.out.println("Enter elements into  the matrix:");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("The resultant matrix is:");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            int original[][]=arr.clone();
            //Transposing the matrix
            System.out.println("The transpose of matrix "+Arrays.toString(original)+" is:");
            //Every [i][j] became [j][i] in position-->whole transpose logic
            for(int j=0;j<n;j++){
                for(int i=0;i<m;i++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    } */


