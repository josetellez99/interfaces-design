package _05_.Classes;

public class Van implements _05_.Interfaces.Vehicles {

        private String plate, name;
        private short year;

        public void show() {
            System.out.println("Van plate: " + plate);
            System.out.println("Van name: " + name);
            System.out.println("Van year: " + year);
        }

        public void assign(String plate, String name, short year) {
            setPlate(plate);
            setName(name);
            setYear(year);
        }

        // setters

        public void setPlate(String plate) {
            this.plate = plate;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setYear(short year) {
            this.year = year;
        }


}
