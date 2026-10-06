package accessories;

import base.cars;

public class AlarmaMatrix extends AccessoryDecorator {
    public AlarmaMatrix(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", alarma matrix 2 controles";
    }

    @Override
    public double cost() {
        return 205000.0 + base.cost();
    }
}
