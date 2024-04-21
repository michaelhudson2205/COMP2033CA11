// Name:    Michael Hudson
// Email:   hudmy010@mymail.unisa.edu.au
// S_ID:    110369255
// jre:     17.0.10.v20240120-1143
// Eclipse: 2024-03 (4.31.0)

package ca1.task1;

public class CaesarCypher
{
	
	// Note: There is no psvm for this task.

	// A method for encoding
	public char[] encode(char[] input, int offset)
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
	
	// A method for decoding
	public char[] decode(char[] input, int offset)
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
