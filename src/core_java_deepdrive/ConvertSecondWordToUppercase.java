/**
 * 
 */
package core_java_deepdrive;

import java.util.Scanner;

/**
 * Get input from the user if the user input is more than one word then the second word is converted to upper case.
 * @author vravichandran2
 * Date 06/05/2023
 */
public class ConvertSecondWordToUppercase {
	//Driver 
	public static void main(String args[]) {
		
		// To get the input from the user
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		//splitting the words 
		String secondWord[] = str.split(" ");
		
		//checking conditions length of the sentence
		if(secondWord.length<2)
			System.out.println("LESS");
		else
			// The second word is converted to upper case
			System.out.println(secondWord[1].toUpperCase());
		
		input.close();
	}

}
