package p300739743;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome743 {
	
	public static boolean isPalindrome743(String sentence)
	{
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();
		
		for (int i = 0; i < sentence.length(); i++) 
		{
			stack.push(sentence.charAt(i));
            queue.offer(sentence.charAt(i));
        }

		 while (queue.isEmpty() == false)
		 {
            if (queue.poll().equals(stack.pop()) == false)
            {
                return false;
            }
	     }
			
        return true;
	}
  	       
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String sentence;
		
		do 
		{
			System.out.println("Please enter a string (hit Enter to exit program):");
			sentence = input.nextLine();
			String str = sentence.replaceAll("[^a-zA-Z]+", "");
			str = str.toLowerCase();
			
			if (sentence.equals("")) { }
			else if (str.equals(""))
			{
				System.out.println("String does not contain any letters.");
			}
			else
			{
				if (isPalindrome743(str) == true)
					System.out.println("The given string \"" + str + "\" is a palindrome.");
				else
	            	System.out.println("The given string \"" + str + "\" is not a palindrome.");
			}
			System.out.println();
		} while (sentence.equals("") == false);
	
		input.close();
		System.out.println("Program ended.");
		
	}

}
