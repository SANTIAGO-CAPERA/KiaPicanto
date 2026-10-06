package accessories;

import base.cars;

public class MalladeCarga extends AccessoryDecorator {
    public MalladeCarga(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", malla de carga";
    }

    @Override
    public double cost() {
        return 110000.0 + base.cost();
    }
}
