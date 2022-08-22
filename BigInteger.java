import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BigInteger {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       BigInteger b=sc.nextBigInteger();
       BigInteger c=sc.nextBigInteger();
       sc.close();
       BigInteger d=b.add(c);
       BigInteger e=b.multiply(c);
       System.out.println(d);
        System.out.println(e);
       
    }
}

