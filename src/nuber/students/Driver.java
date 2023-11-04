package nuber.students;

public class Driver extends Person {
    private Passenger currentPassenger;
    private int maxSleep;

	
	public Driver(String driverName, int maxSleep)
	{
		super(driverName, maxSleep);
        this.maxSleep = maxSleep;
	}
	
	/**
	 * Stores the provided passenger as the driver's current passenger and then
	 * sleeps the thread for between 0-maxDelay milliseconds.
	 * 
	 * @param newPassenger Passenger to collect
	 * @throws InterruptedException
	 */
	public void pickUpPassenger(Passenger newPassenger) throws InterruptedException
	{
        this.currentPassenger = newPassenger;
        Thread.sleep((long) (Math.random() * maxSleep));
	}

	/**
	 * Sleeps the thread for the amount of time returned by the current 
	 * passenger's getTravelTime() function
	 * 
	 * @throws InterruptedException
	 */
	public void driveToDestination() throws InterruptedException {
        Thread.sleep(currentPassenger.getTravelTime());
	}
	
}
