package accessories;

import base.cars;

public class KitBoton extends AccessoryDecorator {
    public KitBoton(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", kit boton encendido con alarma y 2 controles";
    }

    @Override
    public double cost() {
        return 1500000.0 + base.cost();
    }
}
