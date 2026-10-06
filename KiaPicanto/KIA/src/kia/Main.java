package kia;

import accessories.AlarmaMatrix;
import accessories.KitBoton;
import accessories.MalladeCarga;
import accessories.RinAluminio13;
import accessories.SensorParqueo;
import accessories.TirodeArrastre;
import base.cars;
import versions.GTLineAT;
import versions.VibrantMT;
import versions.ZenithMT;

public class Main {

    public static void main(String[] args) {
        cars car = new VibrantMT();
        System.out.println(car.getdescription()
                + " $" + String.format("%.0f", car.cost()));

        cars car2 = new ZenithMT();
        car2 = new MalladeCarga(car2);
        car2 = new SensorParqueo(car2);
        car2 = new SensorParqueo(car2);
        car2 = new AlarmaMatrix(car2);
        System.out.println(car2.getdescription()
                + " $" + String.format("%.0f", car2.cost()));

        cars car3 = new GTLineAT();
        car3 = new RinAluminio13(car3);
        car3 = new TirodeArrastre(car3);
        car3 = new KitBoton(car3);
        System.out.println(car3.getdescription()
                + " $" + String.format("%.0f", car3.cost()));
    }
}