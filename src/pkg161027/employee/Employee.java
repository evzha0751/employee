
package pkg161027.employee;

import java.util.*;
public class Employee {

         /* Returns a name of faculty or staff.
	 * pre: none
	 * post: A name of faculty or staff is returned.
	 */
    public static UEmployee assign(int x) {
   
        if(x==0){
            return(new faculty());
        }else{
            return(new staff());
        }
    }
    
    
    public static void main(String[] args) {
        String choice="";
        UEmployee ue;
        Scanner input=new Scanner(System.in);
        int times=0;
        int timesS=1;
        
        while(!choice.equalsIgnoreCase("N")){
            if(times==0){
                ue = assign(times);
                System.out.println("Your faculty name is :" +ue);
                times+=1;
            }else{
                while(!choice.equalsIgnoreCase("N")){
                    ue = assign(times);
                    System.out.println("   Staff No."+timesS+" is : "+ue);
                    timesS+=1;
                    System.out.println("");
                    System.out.print("More staff?  <Y/N>");
                    choice=input.next();
                }
            }
        }
        
        
        
    }
    }
