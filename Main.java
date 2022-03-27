package PGO;

public class Main {
    public static void main(String[] args) {

        //Zadanie
        Airplane airplane = new Airplane(30000, 2000, "Wizzer", 100);
        System.out.println("Marka samolotu: " + airplane.getBrand());

        airplane.setPlaces(150);
        System.out.println("Zmiana miejsc: " + airplane.getPlaces());

        System.out.println("Rok produkcji silnika: " + airplane.getYear());

        System.out.println("Ilosc koni mechanicznych: " + airplane.getHp());

        airplane.eco();
    }
}
