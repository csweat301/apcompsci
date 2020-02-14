package classesCont.labs;

import base.Lab;

public class Car implements Lab {

    private int milesSinceOilChange, milesTillNextOilChange;

    public Car(int milesSinceOilChange, int milesTillNextOilChange) {
        this.milesSinceOilChange = milesSinceOilChange;
        this.milesTillNextOilChange = milesTillNextOilChange;
    }

    @Override
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
