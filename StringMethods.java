import java.util.Scanner;
import javax.swing.JOptionPane;


public class StringMethods
{
	public static void main(String[] args)
	{
		//declare variables
		String msg1, msg2;
		
		//define variables
		msg2 = JOptionPane.showInputDialog("Enter message 2.");
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter message 1: ");
		msg1 = keyboard.next();
		keyboard.close();
		
		//get msg2 max length
		int msgMax = msg2.length() - 1;

		//print variables
		System.out.println(msg1.toUpperCase());
		System.out.println(msg2.toLowerCase());
		System.out.println(msg1.length());
		System.out.println(msg2.length());
		System.out.println(msg1.charAt(0));
		System.out.println(msg2.charAt(msgMax));
		
		System.exit(0);
		
	}
}
