// Name:    Michael Hudson
// Email:   hudmy010@mymail.unisa.edu.au
// S_ID:    110369255
// jre:     17.0.10.v20240120-1143
// Eclipse: 2024-03 (4.31.0)

package ca1.task3;

public class ArrayCount 
{
	// Note: There is no psvm for this task.
	
	// A method for counting the number of occurrences
	// of a given target within an array.
	public int count(String[] array, String target) 
	{
		int res = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (target.equals(array[i]))
			{
				res++;
			}
		}
		return res;
	} // ==========end of count==========
} // ==========end of class ArrayCount==========
