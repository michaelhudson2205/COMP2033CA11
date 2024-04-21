// Name:    Michael Hudson
// Email:   hudmy010@mymail.unisa.edu.au
// S_ID:    110369255
// jre:     17.0.10.v20240120-1143
// Eclipse: 2024-03 (4.31.0)

package ca1.task4;

import java.util.Objects;

public class Car 
{
	// instance variables
	private String make;
	private String model;
	private String colour;
	
	
	// constructor
	public Car(String make, String model, String colour) 
	{
		this.make = make;
		this.model = model;
		this.colour = colour;
	} // ==========end of Car constructor==========

	// instance method: overrides the class method.
	public String toString()
	{
		return make + ", " + model + ", " + colour;
	} // ==========end of toString==========

	// instance method: overrides the class method.
	public int hashCode()
	{
		return Objects.hash(colour, model);
	} // ==========end of hashCode==========
	
	// instance method: overrides the class method.
	public boolean equals(Car that)
	{
		return this.model.equals(that.model) && this.colour.equals(that.colour);
	} // ==========end of equals==========
	
} // ==========end of class Car==========
