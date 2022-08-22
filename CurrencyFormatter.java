import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        sc.close();
        Locale l=new Locale("en","IN");
        NumberFormat a=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat b=NumberFormat.getCurrencyInstance(l);
        NumberFormat c=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat e=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: "+a.format(d));
        System.out.println("India: "+b.format(d));
        System.out.println("China: "+c.format(d));
        System.out.println("France: "+e.format(d));
        
    }
}

