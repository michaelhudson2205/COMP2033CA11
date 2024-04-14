// Michael Hudson

package ca1.task1;

import java.util.Scanner;

public class CaesarCypher
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a message to encrypt: ");
		String input = sc.nextLine();

		System.out.print("Enter the shift value for the message: ");
		int offset = sc.nextInt();
		
		String encodedMessage = encode(input, offset);
		
		System.out.println("Encoded message:" + encodedMessage);

	} // ==========end of psvm==========

//	public char[] encode(char[] input, int offset) 
	public static String encode(String input, int offset)
	{
		StringBuilder encodedMessage = new StringBuilder();

		input = input.toLowerCase();

		for (int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);

			if (Character.isLetter(c))
			{
				c = (char) ((c - 'a' + offset + 26) % 26 + 'a');
			}

			encodedMessage.append(c);
		}

		return encodedMessage.toString();

	} // ==========end of encode==========

	public char[] decode(char[] input, int offset)
	{
		return null;
	} // ==========end of decode==========

} // ==========end of class CaesarCypher==========
