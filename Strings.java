import java.io.*;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in);
       String a=sc.nextLine();
       String b=sc.nextLine();
       String c=a.concat(b);
       System.out.println(c.length());
       if(a.compareTo(b)<=0){
           System.out.println("No");
       }
       else{
           System.out.println("Yes");
       }
       System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));
       
    }
}

