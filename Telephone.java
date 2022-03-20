package PJATK;

public class Telephone {
    private String brand;
    private double resolution;
    private int number;

    public Telephone(String brand, double resolution, int number) {
        this.brand = brand;
        this.resolution = resolution;
        this.number = number;
    }

    public void message(int number, String text) {
        System.out.println("Wysylam wiadomosc " + text + " na numer " + number);
    }
}