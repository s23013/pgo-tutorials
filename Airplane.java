package PGO;

    class Airplane extends Engine {

       private String brand;
       private int places;

        public Airplane(int hp, int year, String brand, int places) {
            super(hp, year);
            this.brand = brand;
            this.places = places;
        }

        void eco(){
            if (getHp() <= 20000 && getYear() > 2000){
                System.out.println("Silnik jest ekologiczny");
            }else {
                System.out.println("Silnik jest nieekologiczny");
            }
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getPlaces() {
            return places;
        }

        public void setPlaces(int places) {
            this.places = places;
        }
    }
