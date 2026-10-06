package accessories;

import base.cars;

public class RinAluminio14 extends AccessoryDecorator {
    public RinAluminio14(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", rin aluminio 14 negro mecanizado";
    }

    @Override
    public double cost() {
        return 500000.0 + base.cost();
    }
}
