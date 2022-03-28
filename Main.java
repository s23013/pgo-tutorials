public class Main {
    public static void main(String[] args) {
        User u1 = new User("test1@wp.pl");
        User u2 = new User("test2@wp.pl");
        User u3 = new User("Andrzej","Nowak","test3@wp.pl","test",true);

        System.out.println(u1.toString());
        u1.changeStatus("Stefan","Kowalski","Test321",true);
        System.out.println(u1.toString());

        Product p1 = new Product("Mleko", "123566", 2.50);
        Product p2 = new Product("Woda","654321",1.50,20);
        Product p3 = new Product("Change","123321",120,30);

        System.out.println(p3.toString());
        p3.changePrice(250,5);
        System.out.println(p3.toString());
    }
}
