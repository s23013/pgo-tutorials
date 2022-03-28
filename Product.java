public class Product {
    String pn,code;
    double price;
    int count;

    public Product(String pn, String code, double price) {
        this.pn = pn;
        this.code = code;
        this.price = price;
    }

    public Product(String pn, String code, double price, int count) {
        this.pn = pn;
        this.code = code;
        this.price = price;
        this.count = count;
    }

    public void changePrice(double price, int count) {
        this.price = price;
        this.count = count;

    }

    @Override
    public String toString() {
        return "Product{" +
                "pn='" + pn + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
