import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class List {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
         List<Integer> list = new ArrayList();
        for(int i=0;i<N;i++){
            int value=sc.nextInt();
            list.add(value);
        }
      
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            String str=sc.next();
            if(str.equals("Insert")){
                int index=sc.nextInt();
                int value=sc.nextInt();
               list.add(index,value);
            }
            else{
                int ind=sc.nextInt();
                 list.remove(ind);
            }
        }
       for(Integer n:list){
           System.out.print(n+" ");
       }
    }
}

