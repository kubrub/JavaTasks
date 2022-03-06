import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Task3Labka1 {

    public static <T> T isInstanceOf(Class<T> t, Object o) {
        return t.isInstance(o) ? t.cast(o) : null;
    }

    public static void main(String[] args) throws IOException {
        FileReader dataFile = new FileReader("src/main/java/data.txt");
        BufferedReader dataBufferedReader = new BufferedReader(dataFile);

        String dataLine;
        int sum = 0;
        while ((dataLine = dataBufferedReader.readLine()) != null){
            sum += Integer.parseInt(dataLine);
        }
        dataBufferedReader.close();
        dataFile.close();
        //////////////////////////////
        Building[] buildings = new Building[sum];
        //////////////////////////////
        FileReader schoolFile = new FileReader("src/main/java/task3school.txt");
        BufferedReader schoolBufferedReader = new BufferedReader(schoolFile);
        String schoolLine = "";
        String[] schoolArrs = null;
        int num = 0;
        while ((schoolLine = schoolBufferedReader.readLine()) != null) {
            schoolArrs=schoolLine.split(" ");
            buildings[num] = new School(schoolArrs[0], schoolArrs[1], Integer.valueOf(schoolArrs[2]), Integer.valueOf(schoolArrs[3]), Integer.valueOf(schoolArrs[4]));
            num++;
        }
        schoolBufferedReader.close();
        schoolFile.close();
        //////////////////////////////
        FileReader universityFile = new FileReader("src/main/java/task3university.txt");
        BufferedReader universityBufferedReader = new BufferedReader(universityFile);
        String universityLine = "";
        String[] universityArrs = null;

        while ((universityLine = universityBufferedReader.readLine()) != null) {
            universityArrs = universityLine.split(" ");
            buildings[num] = new University(universityArrs[0], universityArrs[1], Integer.valueOf(universityArrs[2]), Integer.valueOf(universityArrs[3]), Integer.valueOf(universityArrs[4]));
            num++;
        }
        universityBufferedReader.close();
        universityFile.close();

        for (int i = 0; i < buildings.length; i++) {
            School school = isInstanceOf(School.class, buildings[i]);
            if (school == null) {
                University university = isInstanceOf(University.class, buildings[i]);
                System.out.println(buildings[i].name + " " + buildings[i].address + " " + buildings[i].year + " " + university.level + " " + university.amountOfFacilites);
            } else {
                System.out.println(buildings[i].name + " " + buildings[i].address + " " + buildings[i].year + " " + school.numberOfSchool + " " + school.amountOfStudents);
            }
        }
        Arrays.sort(buildings, new SortByYear());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("----------- Task 1 -----------");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Sorted by year:");
        for (int i = 0; i < buildings.length; i++) {
            School school = isInstanceOf(School.class, buildings[i]);
            if (school == null) {
                University university = isInstanceOf(University.class, buildings[i]);
                System.out.println(buildings[i].name + " " + buildings[i].address + " " + buildings[i].year + " " + university.level + " " + university.amountOfFacilites);
            } else {
                System.out.println(buildings[i].name + " " + buildings[i].address + " " + buildings[i].year + " " + school.numberOfSchool + " " + school.amountOfStudents);
            }
        }

        //Second
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("----------- Task 2 -----------");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("School with a minimum number of students:");
        School schoolWithAMinimalAmountOfStudents = new School("", "", 2000, 1, 2000);
        for (Building building: buildings) {
            School school = isInstanceOf(School.class, building);
            if (school != null) {
                if (schoolWithAMinimalAmountOfStudents.year > school.year) {
                    schoolWithAMinimalAmountOfStudents = school;
                }
            }
        }
        System.out.println(schoolWithAMinimalAmountOfStudents.name + " " + schoolWithAMinimalAmountOfStudents.address + " " + schoolWithAMinimalAmountOfStudents.year + " " + schoolWithAMinimalAmountOfStudents.numberOfSchool + " " + schoolWithAMinimalAmountOfStudents.amountOfStudents);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("----------- Task 3 -----------");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int theLevelOfAccreditation;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the level of accreditation: ");
        theLevelOfAccreditation = scanner.nextInt();

        scanner.close();

        for (Building building: buildings) {
            University universityTask3 = isInstanceOf(University.class, building);
            if (universityTask3 != null) {
                if (universityTask3.level == theLevelOfAccreditation) {
                    System.out.println("University with the " + theLevelOfAccreditation +" level of accreditation");
                    System.out.println(universityTask3.name + " " + universityTask3.address + " " + universityTask3.year + " " + universityTask3.level + " " +universityTask3.amountOfFacilites);
                }
            }

        }
    }
}
