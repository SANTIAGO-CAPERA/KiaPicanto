package accessories;

import base.cars;

public class PernosdeSeguridad extends AccessoryDecorator {
    public PernosdeSeguridad(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", pernos de seguridad starlock";
    }

    @Override
    public double cost() {
        return 156100.0 + base.cost();
    }
}
