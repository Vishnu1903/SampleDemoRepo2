/**
 * 
 */
package core_java_deepdrive;

import java.util.*;

/**
 * Creating collection called HashMap and storing objects in it and fetching according to the user's input
 * @author vravichandran2
 * Date 06/05/2023
 */
public class CheckHashMap {
	public static void main(String[] args) {
		
		//creating HashMap
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		// getting input from the user
        Scanner input =new Scanner(System.in);
        
        //getting the size of key-value pairs
        System.out.println("Enter the home many pairs: ");
        int n = input.nextInt();
        for(int i=0; i < n; i++) {
        	System.out.println("Enter the Name and Number" +" " +(i+1));
        	hm.put(input.next(),input.nextInt());
        }
       
        //displaying the input data
        System.out.println(hm);
        System.out.println("****************");
        
        //Checking name whether it is present or not
        System.out.println("Enter the name to check whether the name is present or not: ");
        if(hm.containsKey(input.next())){
        	System.out.println("YES!! it is there");
        	}
        else {
	        System.out.println("OOPS !!! Unavaible");
	    }
        
        //Checking value whether it is present or not
        System.out.println("*****************");
        System.out.println("Enter the number to check wheather the number is present or not: ");
        if(hm.containsValue(input.nextInt())) {
        	System.out.println("YES !! its there");
        	}
        else {
	         System.out.println("OOPS !! Unavailable");
	    }
        System.out.println("*****************");
        
        //Iterating over a map entry set
        for (Map.Entry<String,Integer> entry : hm.entrySet()) 
        	System.out.println("Key: " + entry.getKey() + ", Value: "+ entry.getValue());
        
        input.close();
	}
}

