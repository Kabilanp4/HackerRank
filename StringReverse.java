import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] str=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=str[i];
            i++;
            j--;
        }
        if(s.equals(String.valueOf(str))){
        System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }   
        
}

