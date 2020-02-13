package classes.labs;

public class Car {
	
	private int milesSinceOilChange = 0, milesTillNextOilChange;

	public Car(int milesSinceOilChange, int milesTillNextOilChange) {
		this.milesSinceOilChange = milesSinceOilChange;
		this.milesTillNextOilChange = milesTillNextOilChange;
	}
	
	public void go() {
		System.out.println(timeForOilChange());

		addMiles(2000);

		System.out.println(timeForOilChange());

		addMiles(2000);

		System.out.println(timeForOilChange());
	}
	
	public void addMiles(int miles) {
		this.milesSinceOilChange += miles;
	}
	
	public boolean timeForOilChange() {
		boolean oilChange = milesSinceOilChange > milesTillNextOilChange;
		
		if (oilChange) milesSinceOilChange = 0;
		
		return oilChange;
	}

}
