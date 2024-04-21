// Name:    Michael Hudson
// Email:   hudmy010@mymail.unisa.edu.au
// S_ID:    110369255
// jre:     17.0.10.v20240120-1143
// Eclipse: 2024-03 (4.31.0)

package ca1.task4;

public class CarProcessing 
{
	public static void main(String[] args) 
	{
		
		CarProcessing cp = new CarProcessing();
		
		Car[] cars = 
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
		
		Car[] noDuplicates = cp.removeDuplicates(cars);
		
		for(Car c : noDuplicates ) 
		{
			System.out.println(c);
		}
		
		// Testing toString method.
		Car testCar = new Car("Lamborghini", "Revuelto", "Nero Noctis");
		String result = testCar.toString();
		System.out.println(result);
		
	} // ==========end of psvm==========
	
	public Car[] removeDuplicates(Car[] inputArray) 
	{
		boolean[] carDuplicates = new boolean[inputArray.length];
		
		for (int i = 0; i < inputArray.length - 1; i++)
		{
			for (int j = i + 1; j < inputArray.length; j++)
			{
				if (inputArray[i].equals(inputArray[j]) && i != j)
				{
					carDuplicates[i] = true;
					carDuplicates[j] = true;
				}
			}
		}
		
		int countTrue = 0;
		for (int i = 0; i < carDuplicates.length; i++)
		{
			if (carDuplicates[i] == true)
			{
				countTrue++;
			}
		}
		
		Car[] noDups = new Car[inputArray.length - countTrue];
		
		int noDupsIndex = 0;
		
		for (int i = 0; i < inputArray.length; i++)
		{
			if (carDuplicates[i] == false)
			{
				noDups[noDupsIndex] = inputArray[i];
				noDupsIndex++;
			}
		}
		
		return noDups;
		
	} // ==========end of removeDuplicates==========
	
} // ==========end of class CarProcessing==========
