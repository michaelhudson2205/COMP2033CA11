package ca1.task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest
{

	@Test
	void testToString()
	{
		// given (arrange)
		Car testCar1 = new Car("Lamborghini", "Revuelto", "Nero Noctis");
		
		// when (act)
		String result = testCar1.toString();
		String expected = "Lamborghini, Revuelto, Nero Noctis";
		
		// then (assert)
//		assertTrue(expected.equals(result));
		assertEquals(expected, result);
	}

	@Test
	void testEqualsCar_should_ReturnTrue()
	{
		// given
		Car testCar2 = new Car("Chevrolet", "Suburban", "Blue");
		Car testCar3 = new Car("Plymouth", "Suburban", "Blue");
		
		// when
		boolean result = testCar2.equals(testCar3);
		boolean expected = true;
		
		// then
		assertEquals(expected, result);
	}
	
	@Test
	void testEqualsCar_should_ReturnFalse()
	{
		// given
		Car testCar2 = new Car("Chevrolet", "Suburban", "Green");
		Car testCar3 = new Car("Plymouth", "Suburban", "Blue");
		
		// when
		boolean result = testCar2.equals(testCar3);
		boolean expected = false;
		
		// then
		assertEquals(expected, result);
	}

}
