/**
 * 
 */
package core_java_deepdrive;

/**
 * Sorting the names by using the Tree set 
 * @author vravichandran2
 * Date : 06/05/2023
 */
import java.util.*;

//Creating a class and implementing the interface
class Person implements Comparable<Person>{
	private String name;

    //Constructor
	public Person(String name) {
		this.name = name;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//to string method to display the sorted list
	@Override
	public String toString() {
		return name;
	}

	//Comparing the names 
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
}
//Driver class
public class DisplaySortedResults {
	public static void main(String args[]) {
		
		//Creating TreeSet
		TreeSet<Person> ts=new TreeSet<Person>();
		
		//getting input from the user
		Scanner input=new Scanner(System.in);
		
		//getting how many names going to be entered
		System.out.print("Enter the number of persons:");
		int len=input.nextInt();
		
		//getting the names
		System.out.println("Enter the persons names:");
		for(int i=1;i<=len+1;i++) {
			ts.add(new Person(input.nextLine()));
		}
		
		//Iterator is used
		System.out.println("The sorted TreeSet is:");
		Iterator<Person> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		input.close();
	}
}
