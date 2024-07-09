package Chapter4;

public class Vehicle {
    int passengers, fuelcap, mpg;
    String model;


    int range() {
        return mpg * fuelcap;
    }

    void sout() {
        System.out.println(model + " может перевезти " + passengers + " пассажиров на расстояние " + range() + " миль");
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    class VehicleDemo {
        public static void main(String[] args) {
            Vehicle minivan = new Vehicle();
            Vehicle sportscar = new Vehicle();

            // minivan
            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;
            minivan.model = "Мини-фургон";
            // sportscar
            sportscar.passengers = 2;
            sportscar.fuelcap = 14;
            sportscar.mpg = 12;
            sportscar.model = "Спорт-авто";

            sportscar.sout();
            minivan.sout();
            System.out.println();
            if (minivan.mpg > sportscar.mpg) {
                System.out.println(minivan.model + " быстрее, чем " + sportscar.model);
            } else System.out.println(sportscar.model + " быстрее, чем " + minivan.model);
        }
    }
}