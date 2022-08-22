import java.io.*;
import java.util.*;

public class LoopTwo {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        for(int i=0;i<r;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int n=s.nextInt();
          int res=a;
        for(int j=0;j<n;j++){
            res+=(int)(Math.pow(2,j)*b);
            System.out.print(Integer.toString(res)+' ');
        }
         System.out.print("\n");
        }
        s.close();
    }
}

