import java.util.*;
//Advance Patterns
public class Advance {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //1.Butterfly Pattern
        /*for(int i=1;i<=4;i++){//1st Half
            for(int j=1;j<=i;j++){//1st Part
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//2nd Part
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){//1st Part
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//2nd Part
                System.out.print("*");
            }
            System.out.println();
        }*/
    //2.Solid Rhombus
    /* for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    } */
        //3.Number Pyramid
        /* for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){//Spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }  */
    //4.Palindrome Pattern
    /* for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){//1st Half Numbers
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){//2nd Half Numbers
            System.out.print(j);
        }
        System.out.println();
    } */
        //5.Diamond Pattern
        /* for(int i=1;i<=4;i++){//1st Half
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    for(int i=4;i>=1;i--){//2nd Half
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } */
    //6.Pascals Triangle
    /* for(int i=0;i<5;i++){//i=0--->Fixed
        for(int j=1;j<=5-i;j++){//To print spaces in L.H.S
            System.out.print(" ");
        }
        int num=1;
        for(int j=0;j<=i;j++){//j=0--->Fixed
            System.out.print(num+" ");
            num=num*(i-j)/(j+1);
        }
        System.out.println();
    } */
}
}