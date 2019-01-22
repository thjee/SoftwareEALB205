/*This program will print the name of the person
 * who is running it.
 */
import java.util.Scanner;
public class Hello {//open class
	public static void main(Scanner keyboard){//opening main
		System.out.println("Enter your name: ");
		String name = keyboard.nextLine();
		System.out.println("Name is: "+name);
	}//closing main
}//close class
