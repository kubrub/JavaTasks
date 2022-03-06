import java.util.Comparator;

public class Building {
        public String name;
        public String address;
        public int year;

        public Building(String name, String address, int year) {
            this.name = name;
            this.address = address;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
}


class SortByYear implements Comparator<Building>{
    public int compare(Building a, Building b){
        return b.year - a.year;
    }
}

