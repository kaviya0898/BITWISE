package strings;
import java.util.*;

public class Strings {

    
    public static void main(String[] args) {
   int i=3,j=5;
        
        System.out.println("unary:");
        System.out.println(-i);
        System.out.println(-j);
        System.out.println("-----------------------------------");
        System.out.println(13>>2);
        System.out.println(13<<2);
        System.out.println("-----------------------------------");
        System.out.println("swap numbers");
        
        i=i^j;
        j=i^j;
        i=i^j;
        System.out.println("-----------------------------------");
        
        System.out.println(i+" "+j);
        System.out.println("-----------------------------------");
        System.out.println("even or odd without using another variable");
        int res=i&1;
        String s=res!=1?"even":"odd";
       if((i|1)==i)
       {
         System.out.println("even");  
       }
       else
       {
           System.out.println("odd");  
       }
         System.out.println("-----------------------------------");
       if((i^1)==i+1)
       {
           System.out.println("even");
       }
       else
       {
           System.out.println("odd");
       }
    }
}