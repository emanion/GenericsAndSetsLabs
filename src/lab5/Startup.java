

package lab5;

import lab4.*;
import lab3.*;
import lab2.*;
import java.util.*;

/**
 *
 * @author emanion
 */
public class Startup {
    
    public static void main(String[] args) {
        
        
        Map employees = new HashMap();
        
        Employee emp1 = new Employee("Duck", "Donald", "111-11-1111");
        Employee emp2 = new Employee("Sparrow", "Jack", "222-22-2222");
        Employee emp3 = new Employee("Mouse", "Mickey", "111-11-1111");
        Employee emp4 = new Employee("Dilinger", "John", "333-33-3333");
        Employee emp5 = new Employee("WerberManJensen", "Smity", "444-44-4444");
        
        employees.put("Duck", emp1); 
        employees.put("Sparrow", emp2); 
        employees.put("Mouse", emp3); 
        employees.put("Dilinger", emp4);  
        employees.put("WerberManJensen", emp5);   

        System.out.println("Size of the list is..." + employees.size());
        
        //NOTE -  CAST is REQUIRED -  no generics are used.
        //get "Sparrow"
        Employee empTemp = (Employee)employees.get("Sparrow");
        System.out.println("Second employee in list is... " + 
                empTemp.toString());
        System.out.println("\n");
        
        
        //loop through the MAP by KEYS.....
        System.out.println("\nUsing a keyset, get the employees...");
        Set keys = employees.keySet();
        for(Object key : keys) {
            empTemp = (Employee)employees.get(key);
            System.out.println(empTemp.toString());
        }
                
        
        
        
    }
    
}
