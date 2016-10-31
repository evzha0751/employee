
package pkg161027.employee;

import java.util.*;

/**
 * Faculty class.
 */
public class faculty extends UEmployee {
    Scanner input = new Scanner (System.in);
    private String name;
    
         /**
	 * constructor
	 * pre: none
	 * post: A name of faculty has been created.
	 */
    public faculty (){
        System.out.print("Please enter the name of facuty");
        name = input.nextLine();
}
         /** 
	 * Returns a String of the name of faculty.
	 * pre: none
	 * post: A string of the name of faculty has 
	 * been returned.
	 */
    public String toString(){
        return(name);
    }
    
}
