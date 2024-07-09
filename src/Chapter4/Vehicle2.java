package Chapter4;

import static Chapter4.Vehicle2.*;

public class Vehicle2 {
    int passengers, fuelcap, mpg;
    public static int dist = 252;
    String model;
    Vehicle2(int p, int f, int m, String model) {
        passengers = p;
        fuelcap = f;
        mpg = m;
        this.model = model;
    }

    int range() {
        return mpg * fuelcap;
    }

     double  fuelneeded(int miles) {
        return (double) miles / mpg;

    }

    void show() {
        System.out.println("Для преодоления " + dist + " миль " + model + " нужно " + " галлонов топлива");
    }
}

class VehConsDemo {
    public static void main(String[] args) {
        Vehicle2 minivan = new Vehicle2(7, 16, 21, "минивэн");
        Vehicle2 sportscar = new Vehicle2(2, 14, 12, "спорт-авто");
double gallons1,gallons2;
        sportscar.show();
        gallons1 = sportscar.fuelneeded(dist);

        minivan.show();
        gallons2 = minivan.fuelneeded(dist);
    }
}
