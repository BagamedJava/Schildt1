package Chapter7;

// упражнение 7.1
// создание подкласса класса Vehicle для грузовиков
class Vehicle {
    private int passengers; // кол-во пассажиров
    private int fuelcap; // объем топливного бака(галлоны)
    private int mpg; // потребление топлива (мили на галлон)

    // конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Дальность поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    /*
    Вычисление объема топлива, требуемого для прохождения
    заданного пути
     */
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}
// расширение класса Vehicle для грузовиков
class Truck extends Vehicle{
    private int cargocap; // грузоподъемность(фунты)
    // Конструктор класса Truck
    Truck(int p, int f, int m, int c) {
    // инициализация членок класса Vehicle
    // с использованием конструктора этого класса
    super(p,f,m);
    cargocap = c;
    }
    // методы доступа к переменным cargocap
    int getCargocap(){return cargocap;}
    void putCargo(int c){cargocap = c;}
}

public class TruckDemo {
    public static void main(String[] args) {
        // Создание ряда новых объектов типа Truck

        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);
        double gallons;
        int dist = 252;
        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " + semi.getCargocap()
        + " фунтов");
        System.out.println("Для преодоления " + dist +
                " миль грузовику требуется " + gallons +
                " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Пикап может перевезти " + pickup.getCargocap() +
                " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " +
                gallons + " галлонов топлива");






    }
}
