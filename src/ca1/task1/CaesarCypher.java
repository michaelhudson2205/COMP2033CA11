// Michael Hudson

package ca1.task1;

public class CaesarCypher
{

	public static void main(String[] args)
	{
		// Driver code for testing (**not unit testing**)
		
		char [] message_to_encode = {'a', 'b', 'c',};
		char [] encoded_massage = encode(message_to_encode, 2);
		for (char c : encoded_massage)
		{
			System.out.print(c);
		}
		
		System.out.println();
		
		char [] message_to_decode = {'c', 'd', 'e'};
		char [] decoded_massage = decode(message_to_decode, 2);
		for (char c : decoded_massage)
		{
			System.out.print(c);
		}
	} // ==========end of psvm==========

	public static char[] encode(char[] input, int offset)
	{
		char[] temp = new char[input.length];
		for (int i = 0; i < input.length; i++)
		{
			char c = input[i];
			if ((int) c >= 97 && (int) c <= 122)
			{
				c = (char) ((c - 'a' + offset + 26) % 26 + 'a');
				temp[i] = c;
			}
			else if ((int) c >= 65 && (int) c <= 90)
			{
				c = (char) ((c - 'A' + offset + 26) % 26 + 'A');
				temp[i] = c;
			}
			else
			{
				temp[i] = c;
			}
			
		}
		
		return temp;
	} // ==========end of encode==========
	
	public static char[] decode(char[] input, int offset)
	{
		char[] temp = new char[input.length];
		for (int i = 0; i < input.length; i++)
		{
			char c = input[i];
			if ((int) c >= 97 && (int) c <= 122)
			{
				c = (char) ((c - 'a' - offset + 26) % 26 + 'a');
				temp[i] = c;
			}
			else if ((int) c >= 65 && (int) c <= 90)
			{
				c = (char) ((c - 'A' - offset + 26) % 26 + 'A');
				temp[i] = c;
			}
			else
			{
				temp[i] = c;
			}
			
		}
		
		return temp;
	} // ==========end of decode==========

} // ==========end of class CaesarCypher==========
