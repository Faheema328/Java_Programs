//Basic Patterns
import java.util.*;


//1.4x5 Rectangle
    /* public class BasicPatterns {
    public static void main(String[]args){
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */
       

//2.Hollow Rectangle
    /* public class BasicPatterns {
    public static void main(String[]args){
       for(int i=1;i<=4;i++){
        for(int j=1;j<=5;j++){
            if(i==1 || i==4 || j==1 || j==5){
                System.out.print("*");//prints stars at the boundary of the rectangle
            }
            else{
                System.out.print(" ");//prints spaces in the inner part of the rectangle
            }
        }
        System.out.println();
       }
    }
} */
    
    
//3.Half pyramid(Left Aligned)
    /* public class BasicPatterns {
    public static void main(String[]args){
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    } */
    
    
//4.Half Pyramid(Right Aligned)
    /* public class BasicPatterns {
    public static void main(String[]args){
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4-i;j++){//prints spaces
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){//prints stars
            System.out.print("*");
        }
        System.out.println();
    }
}
    } */
        
        
//5.Inverted Half Pyramid(Left Aligned)
    /* public class BasicPatterns {
    public static void main(String[]args){
    for(int i=1;i<=4;i++){
        for(int j=4;j>=i;j--){
            System.out.print("*");
        }
        System.out.println();
    }
    }
} */
    
    
//6.Inverted Half Pyramid(Rotated by 180 deg)
    /* public class BasicPatterns {
    public static void main(String[]args){
     for(int i=1;i<=4;i++){
        for(int j=1;j<i;j++){//Prints Spaces
            System.out.print(" ");
        }
            for(int j=4;j>=i;j--){//Prints Stars
                System.out.print("*");
            }
        System.out.println();
    }
}
        } */
   
   
//7.Half Pyramid(left Aligned)with Numbers
    /* public class BasicPatterns {
    public static void main(String[]args){
   for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j+" ");
    }
    System.out.println();
   }
}
    } */
  
  
//8.Inverted Half Pyramid(Left Aligned) with Numbers
    /* public class BasicPatterns {
    public static void main(String[]args){
     for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    } 
    }
} */
   
   
//9.Floyd's Triangle
    /* public class BasicPatterns {
    public static void main(String[]args){
        int num = 1;
        for (int i = 1; i <= 5; i++) 
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    } */
    
    
//10.0-1 Triangle
    /* public class BasicPatterns {
    public static void main(String[]args){
     for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            int sum=i+j;
            if(sum%2==0){//Even
                System.out.print("1"+" ");
            }
            else{
                System.out.print("0"+" ");
            }
        }
        System.out.println();
    } 
}
} */
    
    
//11.Pyramid Pattern
    /* public class BasicPatterns {
    public static void main(String[]args){
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
        System.out.println();
    }
}
} */
    
    
//12.Inverted Half Pyramid(Numbers)
    /* public class BasicPatterns {
    public static void main(String[]args){
    for(int i=1;i<=4;i++){
        for(int j=4;j>=i;j--){
            System.out.print(i);
        }
        System.out.println();
    }
}
} */
