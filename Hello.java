/*This program will print the name of the person
 * who is running it.
 */
import java.util.Scanner;
public class Hello {//open class
	public static void main(Scanner keyboard){//opening main
		System.out.println("Enter your name: ");
		String name = keyboard.nextLine();
		String name2 = keyboard.nextLine();
		System.out.println("You have entered your name as: "+name);
		System.out.println("You have entered your name as: "+name2);
	}//closing main
}//close class
