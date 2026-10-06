package accessories;

import base.cars;

public class RinAluminio13 extends AccessoryDecorator {
    public RinAluminio13(cars base) {
        super(base);
    }

    @Override
    public String getdescription() {
        return base.getdescription() + ", rin aluminio 13";
    }

    @Override
    public double cost() {
        return 350000.0 + base.cost();
    }
}
