/**
 * 
 */
package core_java_deepdrive;

/**
 * Check whether two strings are anagrams of each other
 * @author vravichandran2
 * Date 06/05/2023
 */
import java.util.*;
public class CheckAnagramOrNot {
		//Function to check whether two strings are anagram of each other 
		static boolean checkAnagram(char[] str1, char[] str2) {
			// Get lengths of both strings
			int n1 = str1.length;
			int n2 = str2.length;

			// If length of both strings is not same, then they cannot be anagram
			if (n1 != n2)
				return false;

			// Sort both strings
			Arrays.sort(str1);
			Arrays.sort(str2);

			// Compare sorted strings
			for (int i = 0; i < n1; i++)
				if (str1[i] != str2[i])
					return false;

			return true;
		}

		// Driver Code
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			String st1 = new String(input.nextLine());
			String s1 = st1.toLowerCase();
			String st2 = new String(input.nextLine());
			String s2 = st2.toLowerCase();
			char str1[] = s1.toCharArray();
			char str2[] = s2.toCharArray();
		
			// Function Call
			if (checkAnagram(str1, str2))
				System.out.println(
				"The given two strings are" + " Anagram");
			else
				System.out.println(
				"The given two strings are not an" + " Anagram");
			input.close();
		}
}
