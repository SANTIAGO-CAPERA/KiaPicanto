package accessories;

import base.cars;

public class AlfombraTresPiezas extends AccessoryDecorator {
    public AlfombraTresPiezas(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", tapete tres piezas alfombra";
    }

    @Override
    public double cost() {
        return 92000.0 + base.cost();
    }
}
