package accessories;

import base.cars;

public class RinAluminio14_2 extends AccessoryDecorator {
    public RinAluminio14_2(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", rin aluminio 14 negro mecanizado 2";
    }

    @Override
    public double cost() {
        return 500000.0 + base.cost();
    }
}
