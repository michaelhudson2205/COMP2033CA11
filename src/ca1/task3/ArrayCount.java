package ca1.task3;

public class ArrayCount 
{
//	public static void main(String[] args)
//	{
//		// Driver code for testing (**not unit testing**)
//		String[] arr1 = {"Apple", "Banana", "Orange", "Apple", "Pear", "Orange", "Pear", "Pear"};
//		System.out.println(count(arr1, "Grape"));
//	} //==========end of psvm==========
	
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
