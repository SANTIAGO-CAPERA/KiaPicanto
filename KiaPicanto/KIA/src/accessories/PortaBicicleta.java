package accessories;

import base.cars;

public class PortaBicicleta extends AccessoryDecorator {
    public PortaBicicleta(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", portabicicletas x2 puestos";
    }

    @Override
    public double cost() {
        return 910000.0 + base.cost();
    }
}
