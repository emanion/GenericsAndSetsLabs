

package lab2;

import java.util.*;

/**
 *
 * @author emanion
 */
public class Startup {
    
    public static void main(String[] args) {
        
        List employees = new ArrayList();
        
        Employee emp1 = new Employee("Duck", "Donald", "111-11-1111");
        Employee emp2 = new Employee("Sparrow", "Jack", "222-22-2222");
        Employee emp3 = new Employee("Mouse", "Mickey", "111-11-1111");
        Employee emp4 = new Employee("Dilinger", "John", "333-33-3333");
        Employee emp5 = new Employee("WerberManJensen", "Smity", "444-44-4444");
        
        employees.add(emp1); 
        employees.add(emp2); 
        employees.add(emp3); 
        employees.add(emp4);  
        employees.add(emp5);   

        System.out.println("Size of the list is..." + employees.size());
        
        //NOTE -  CAST is required here.  No generics used
        Employee empTemp = (Employee)employees.get(1);
        System.out.println("Second employee in list is... " + 
                empTemp.toString());
        System.out.println("\n");
        
        
        for(int i=0;i < employees.size();i++){
            System.out.println("employees " + i + " = " + 
                    employees.get(i).toString());
            
        }
        
        employees.remove(emp4);
        
        System.out.println("\nAfter removing emp4..(Dilinger)..");
        for(int i=0;i < employees.size();i++){
            System.out.println("employees " + i + " = " + 
                    employees.get(i).toString());
            
        }
        
        employees.remove(1);
        
        System.out.println("\nAfter removing the second item.");
        for(int i=0;i < employees.size();i++){
            System.out.println("employees " + i + " = " + 
                    employees.get(i).toString());
            
        }
        
        
    }
    
}
