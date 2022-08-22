import java.io.*;
import java.util.*;

public class StringSplit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        String[] words=str.split("[^a-zA-Z]+");
        
        for(int i=0;i<words.length;i++){
            if(words[i].length()>0){
                count++;
            }
        }
        System.out.println(count);
        for(String w:words){
            System.out.println(w);
        }
        
        
    }
}

