import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Programmer extends Person implements PersonAble {
    private String iazyk;

    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, String iazyk) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.iazyk = iazyk;
    }

    public String getIazyk() {
        return iazyk;
    }

    public void setIazyk(String iazyk) {
        this.iazyk = iazyk;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "iazyk='" + iazyk + '\'' +
                "} " + super.toString();
    }

    @Override
    public void favoriteSport() {
        System.out.println("tennis");
    }

    @Override
    public String favoriteLanguage() {
        return getFullName() + " favorite language kyrgyz ";
    }

    @Override
    public Month favoriteMouth() {
        return null;
    }

    @Override
    public Month favoriteMouth(int i) {
        System.out.println(getFullName() + " favorite month");
        return Month.of(i);

    }

    @Override
    public String getLastName() {
        return getFullName();
    }

    @Override
    public LocalDate getDateOfBrith(int year, int month, int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getPhoneNumber() + " " + getEmail();
    }

    @Override
    public void getPeopleOfAllAges(Person[] people) {
        int[] age = new int[people.length];
        int counter = 0;
        for (Person person : people) {
            age[counter] = person.getAge();
            counter++;
        }
        Arrays.sort(age);

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
}