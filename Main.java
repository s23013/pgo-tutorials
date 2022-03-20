package PJATK;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        Telephone telephone = new Telephone("Samsung", 2.3, 123456789);
        telephone.message(241521122, "hejka");

        //Zadanie 3
        Car car = new Car("czarny", "skoda", 2.0);
        car.information();
        car.engine(2.2);
        car.highspeed();
    }
}