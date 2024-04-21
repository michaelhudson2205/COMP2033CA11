package ca1.task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarProcessingTest
{
	

	@Test
	void testRemoveDuplicates_2Duplicates_at_Start()
	// Test that two duplicates at first two places in array are removed.
	{
		CarProcessing cp = new CarProcessing();
		
		Car[] input = 
			{ 
					new Car("Honda", "Civic", "Red"),
					new Car("Holden", "Civic", "Red"),
					new Car("Jeep", "Wrangler", "Blue"),
					new Car("Jeep", "Wrangler", "Green"),
					new Car("Holden", "Falcon", "Yellow"),
					new Car("Honda", "Civic", "Blue"),
					new Car("Honda", "Falcon", "Blue"),
					new Car("Honda", "Civic", "Purple")
					
					
			};
		
		Car[] expected = 
			{ 
					input[2],
					input[3],
					input[4],
					input[5],
					input[6],
					input[7]
			};
		
		Car[] result = cp.removeDuplicates(input);
		
		assertArrayEquals(expected, result);
	}
	
	@Test
	void testRemoveDuplicates_2Duplicates_at_End()
	// Test that two duplicates at last two places in array are removed.
	{
		CarProcessing cp = new CarProcessing();
		
		Car[] input = 
			{ 
					new Car("Honda", "Civic", "Yellow"),
					new Car("Holden", "Civic", "Red"),
					new Car("Jeep", "Wrangler", "Blue"),
					new Car("Jeep", "Wrangler", "Green"),
					new Car("Holden", "Falcon", "Yellow"),
					new Car("Honda", "Civic", "Blue"),
					new Car("Honda", "Falcon", "Blue"),
					new Car("Honda", "Falcon", "Blue")
					
					
			};
		
		Car[] expected = 
			{ 
					input[0],
					input[1],
					input[2],
					input[3],
					input[4],
					input[5]
			};
		
		Car[] result = cp.removeDuplicates(input);
		
		assertArrayEquals(expected, result);
	}
	
	@Test
	void testRemoveDuplicates_0Duplicates()
	// Test that entire array is returned when there are no duplicates.
	{
		CarProcessing cp = new CarProcessing();
		
		Car[] input = 
			{ 
					new Car("Honda", "Civic", "Yellow"),
					new Car("Holden", "Civic", "Red"),
					new Car("Jeep", "Wrangler", "Blue"),
					new Car("Jeep", "Wrangler", "Green"),
					new Car("Holden", "Falcon", "Yellow"),
					new Car("Honda", "Civic", "Blue"),
					new Car("Honda", "Falcon", "Blue"),
					new Car("Honda", "Falcon", "White")
					
					
			};
		
		Car[] expected = 
			{ 
					input[0],
					input[1],
					input[2],
					input[3],
					input[4],
					input[5],
					input[6],
					input[7]
			};
		
		Car[] result = cp.removeDuplicates(input);
		
		assertArrayEquals(expected, result);
	}
	
	@Test
	void testRemoveDuplicates_All_Duplicates()
	// Test that empty array returned when all input elements are duplicates.
	{
		CarProcessing cp = new CarProcessing();
		
		Car[] input = 
			{ 
					new Car("Honda", "Civic", "Yellow"),
					new Car("Holden", "Civic", "Yellow"),
					new Car("Jeep", "Civic", "Yellow"),
					new Car("Toyota", "Civic", "Yellow"),
					new Car("Ford", "Civic", "Yellow"),
					new Car("Kia", "Civic", "Yellow"),
					new Car("Mazda", "Civic", "Yellow"),
					new Car("Hyundai", "Civic", "Yellow")
					
					
			};
		
		Car[] expected = 
			{ 

			};
		
		Car[] result = cp.removeDuplicates(input);
		
		assertArrayEquals(expected, result);
	}

}
