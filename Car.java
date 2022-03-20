package PJATK;

class Car {

    String color;
    String brand;
    double capacity;

    public Car(String color, String brand, double capacity) {
        this.color = color;
        this.brand = brand;
        this.capacity = capacity;
    }

    public void information() {
        System.out.println("Kolor: " + color + ", Marka : " + brand);
    }

    public void engine(double cap) {
        this.capacity = cap;
    }

    public void highspeed() {
        if (capacity >= 2) {
            System.out.println("Silnik wysokoobrotowy");
        }else {
            System.out.println("Silnik nie jest wysokoobrotowy");
        }
    }

}