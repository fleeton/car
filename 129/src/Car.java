/**
 * 
 * @author fleeton
 * @version (1)
 * creates a class for the class car
 * <p>
 * This is to stimulate the working of the Car,
 * this does two things
 * it checks speed and model
 *
 */
public class Car {
	String model;
	int speed;
	
	/**
	 * this is the constructor that initializes the attributes model and car
	 * @param model it tells the model of the car
	 * @param speed it tells the speed of the car
	 */
	
	Car(String model, int speed)
	{
		this.model=model;
		this.speed=speed;
	}
	
	/**
	 * this is the method used to increment the speed
	 * @param it increments the speed
	 */
	
	void go_faster (int increment)
	{
		speed=speed+increment;
	}
	
	/**
	 * this is the method used to decrement the speed
	 * @param decrement it decrements the speed
	 */
	
	void go_slower(int decrement)
	{
		speed=speed-decrement;
	}
	
	/**
	 * this method sets the car speed to 0
	 */
	
	void stop_car()
	{
		speed=0;
	}
	
	/**
	 * this is the method used to get the speed of the car
	 * @return - gets the speed of the car
	 */
	int get_speed()
	{
		return speed;
	}
	
	/**
	 * this is the method to display the following: <p>
	 * 1) speed of the car
	 * 
	 * @see get_speed()
	 */
	void display()
	{
		System.out.println("speed is "+speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
