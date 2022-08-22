
import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{ 
    public static < E > void printArray(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         
 
}
}

public class Generics {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        
    }
}

