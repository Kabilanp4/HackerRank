import java.io.*;
import java.util.*;

public class StaticBlock {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
        if(0<a && 0<b){
            System.out.println(a*b);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
x
