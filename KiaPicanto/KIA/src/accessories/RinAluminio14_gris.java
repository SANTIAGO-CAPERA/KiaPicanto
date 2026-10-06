package accessories;

import base.cars;

public class RinAluminio14_gris extends AccessoryDecorator {
    public RinAluminio14_gris(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", rin aluminio 14 gris mecanizado";
    }

    @Override
    public double cost() {
        return 500000.0 + base.cost();
    }
}
