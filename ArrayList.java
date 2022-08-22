import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      List<List<Integer>> arr = new ArrayList<List<Integer>>();
      for(int i=0;i<n;i++){
          List<Integer> arr1=new ArrayList<Integer>();
          int d=sc.nextInt();
          for(int j=0;j<d;j++){
              arr1.add(sc.nextInt());
          }
          arr.add(arr1);
      }
      int num=sc.nextInt();
      for(int j=0;j<num;j++){
          int a=sc.nextInt();
          int b=sc.nextInt();
          if(b>arr.get(a-1).size()){
              System.out.println("ERROR!");
          }
          else{
              System.out.println(arr.get(a-1).get(b-1));
          }
      }
      
    }
}

