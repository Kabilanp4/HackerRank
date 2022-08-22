import java.io.*;
import java.util.*;

public class HashSet {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       String[]str=new String[T];
       String[]str1=new String[T];
       HashSet<String> set=new HashSet();
       for(int i=0;i<T;i++){
           str[i]=sc.next();
           str1[i]=sc.next();
       }
       for(int i=0;i<T;i++){
           set.add(str[i]+" "+str1[i]);
           System.out.println(set.size());
       }
    }
}

