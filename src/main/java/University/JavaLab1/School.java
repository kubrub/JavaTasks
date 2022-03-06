public class School extends Building {
    public int numberOfSchool;
    public int amountOfStudents;

    public School(String name, String addres, int year, int numberOfSchool, int amountOfStudents) {
        super(name, addres, year);
        this.numberOfSchool = numberOfSchool;
        this.amountOfStudents = amountOfStudents;
    }

    public int getNumberOfSchool() {
        return numberOfSchool;
    }

    public void setNumberOfSchool(int numberOfSchool) {
        this.numberOfSchool = numberOfSchool;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }
}
