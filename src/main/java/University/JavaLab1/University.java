public class University extends Building {
    public int level;
    public int amountOfFacilites;

    public University(String name, String addres, int year, int level, int amountOfFacilites) {
        super(name, addres, year);
        this.level = level;
        this.amountOfFacilites = amountOfFacilites;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAmountOfFacilites() {
        return amountOfFacilites;
    }

    public void setAmountOfFacilites(int amountOfFacilites) {
        this.amountOfFacilites = amountOfFacilites;
    }
}
