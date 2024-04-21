// Name:    Michael Hudson
// Email:   hudmy010@mymail.unisa.edu.au
// S_ID:    110369255
// jre:     17.0.10.v20240120-1143
// Eclipse: 2024-03 (4.31.0)

package ca1.task2;

public class Loops
{
	public static void main(String[] args)
	{
		// Instantiate a new Loops object.
		Loops myLoops = new Loops();
		
		// Call the printWords method of the Loops object
		// and pass in a value for the required argument.
		myLoops.printWords(5);
		
	} // ==========end of psvm==========

	// A method for printing the word \"words\" a given number of times.
	public void printWords(int numberOfTimes)
	{
		for (int i = 0; i < numberOfTimes; i++)
		{
			System.out.println("words");
		}
	} // ==========end of printWords==========
} // ==========end of class Loops==========
