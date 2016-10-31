
package pkg161027.employee;

import java.util.*;

/**
 * Staff class.
 */
public class staff extends UEmployee{
  Scanner input = new Scanner (System.in);
    private String name;
    
         /**
	 * constructor
	 * pre: none
	 * post: A Name of staff has been created.
	 */
    public staff (){
        System.out.print("Please enter the name of staffs");
        name = input.nextLine();
}
         /** 
	 * Returns a String of the name of staff.
	 * pre: none
	 * post: A string of the name of staff has 
	 * been returned.
	 */    
    public String toString(){
        return(name);
    }  
}
