package accessories;

import base.cars;

public class SensorParqueo extends AccessoryDecorator {
    public SensorParqueo(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", sensor de parqueo";
    }

    @Override
    public double cost() {
        return 150000.0 + base.cost();
    }
}
