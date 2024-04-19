package ca1.task3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayCountTest
{

	@Test
	void testCount0()
	{
		ArrayCount ac = new ArrayCount();
		
		String[] input = {"Apple", "Banana", "Orange", "Apple", "Pear", "Orange", "Pear", "Pear"};
		int expected = 0;
		
		assertEquals(expected, ac.count(input, "Grape"), "The count does not work as expected");
	}
	
	@Test
	void testCount1()
	{
		ArrayCount ac = new ArrayCount();
		
		String[] input = {"Apple", "Banana", "Orange", "Apple", "Pear", "Orange", "Pear", "Pear"};
		int expected = 1;
		
		assertEquals(expected, ac.count(input, "Banana"), "The count does not work as expected");
	}
	
	@Test
	void testCount2()
	{
		ArrayCount ac = new ArrayCount();
		
		String[] input = {"Apple", "Banana", "Orange", "Apple", "Pear", "Orange", "Pear", "Pear"};
		int expected = 2;
		
		assertEquals(expected, ac.count(input, "Apple"), "The count does not work as expected");
	}

} // ==========end of class ArrayCountTest==========
