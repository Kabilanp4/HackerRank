import java.io.*;
import java.util.*;

public class Map {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Map<String,Integer> map=new HashMap();
          while(n--!=0){
            String name=sc.nextLine();
            int phone=Integer.parseInt(sc.nextLine());
            map.put(name,phone);  
            
        }
        while(sc.hasNext()){
            String str=sc.nextLine();
             if(map.containsKey(str)){
            System.out.println(str+"="+map.get(str));
             }
           else{
            System.out.println("Not found");
            }
        
        }
    }
}

