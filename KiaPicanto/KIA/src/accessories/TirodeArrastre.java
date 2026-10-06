package accessories;

import base.cars;

public class TirodeArrastre extends AccessoryDecorator {
    public TirodeArrastre(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", tiro de arrastre";
    }

    @Override
    public double cost() {
        return 810000.0 + base.cost();
    }
}
