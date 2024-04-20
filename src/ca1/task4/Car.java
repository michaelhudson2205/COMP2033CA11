package ca1.task4;

import java.util.Objects;

public class Car 
{
	private String make;
	private String model;
	private String colour;
	
	
	public Car(String make, String model, String colour) 
	{
		this.make = make;
		this.model = model;
		this.colour = colour;
	} // ==========end of Car constructor==========

	public String toString()
	{
		return make + ", " + model + ", " + colour;
	} // ==========end of toString==========

	public int hashCode()
	{
		return Objects.hash(colour, model);
	}

//	public boolean equals(Object obj)
//	{
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Car other = (Car) obj;
//		return Objects.equals(colour, other.colour) && Objects.equals(model, other.model);
//	}
	
	public boolean equals(Car that)
	{
		return this.model.equals(that.model) && this.colour.equals(that.colour);
	} // ==========end of equals==========

//	public String getMake()
//	{
//		return make;
//	}
//
//	public String getModel()
//	{
//		return model;
//	}
//
//	public String getColour()
//	{
//		return colour;
//	}
//
//	public void setMake(String make)
//	{
//		this.make = make;
//	}
//
//	public void setModel(String model)
//	{
//		this.model = model;
//	}
//
//	public void setColour(String colour)
//	{
//		this.colour = colour;
//	}
	
} // ==========end of class Car==========
