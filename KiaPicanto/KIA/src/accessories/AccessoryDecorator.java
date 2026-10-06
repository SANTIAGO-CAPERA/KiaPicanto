package accessories;

import base.cars;

public abstract class AccessoryDecorator extends cars {
    protected final cars base;

    public AccessoryDecorator(cars base) {
        this.base = base;
    }

    @Override
    public abstract String getdescription();
}
