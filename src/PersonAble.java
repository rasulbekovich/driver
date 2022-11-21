import java.time.LocalDate;
import java.time.Month;

public interface PersonAble {
    void favoriteSport();
    String favoriteLanguage();
    Month favoriteMouth();
    String getLastName();
    LocalDate getDateOfBrith(int year,int month,int day);
    String getPhoneNumberAndEmail();
    void getPeopleOfAllAges(Person[] people);
}
