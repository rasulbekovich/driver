import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /*** 1.Person деген абстрактный класс тузунуз.
                Анын полялары :
        private int id;
        private String fullName;
        private byte age;
        private char gender;
        private String email;
        private String phoneNumber;
        private double governmentsSalary;
        2.Person классын мурастаган 3 класс тузунуз.
        Алар:
        "Programmer Driver жана Doctor"
        ар бирине озунчо уникальный поле кошунуздар.
        3.PersonAble деген интерфейс ачып анын ичине
        void favoriteSport();

        String favoriteLanguage();

        Month favoriteMouth();

        String getLastName();

        LocalDate getDateOfBrith();

        String getPhoneNumberAndEmail();

        long[] getPeopleOfAllAges(Person[] people);
        деген методдорду тузунуз.Жана алардын реализацияларын кылуу учун
        "Programmer Driver жана Doctor" класстары impiliment кылсын.
        4.Main класста алардын ар бирине 3 тон обеъкт тузуп жазган логиканыз
        туура иштедиби текшериiz***/
        Doctor doctor1 = new Doctor(220020121,"jenishbekov yntymak",(byte) 20,'M',"jenidbekov7@gamil.com","+996501032602",40000,"stamatolog");
        Doctor doctor2 = new Doctor(220001108,"asangaziev jenishbek",(byte) 21,'M',"asangaziev@gmail.com","+996500000000",40000,"lor");
        System.out.println(doctor2);
        Doctor[]doctors={doctor1,doctor2};
        System.out.println(doctor1);
        System.out.println(doctor1.favoriteMouth(7));
        System.out.println(doctor1.favoriteLanguage());
        doctor1.favoriteSport();
        System.out.println(doctor1.getLastName());
        System.out.println(doctor1.getDateOfBrith(2002,3,22));
        System.out.println(doctor1.getPhoneNumberAndEmail());
        doctor1.getPeopleOfAllAges(doctors);
        System.out.println("==================================================================");

        Driver driver1=new Driver(23456,"balanchaev tukuncho",(byte) 20,'M',"asdfghjk@gmail.com","+99612345678",20000,'B');
        Driver driver2=new Driver(23456,"tukunchoev balancha",(byte) 21,'M',"qwerty@gmail.com","+1234567678",25000,'C');
        Driver[]drivers={driver1,driver2};
        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver1.favoriteMouth(5));
        System.out.println(driver1.favoriteLanguage());
        driver1.favoriteSport();
        System.out.println(driver1.getLastName());
        System.out.println(driver1.getDateOfBrith(2001,1,19));
        System.out.println(driver1.getPhoneNumberAndEmail());
        driver1.getPeopleOfAllAges(drivers);
        System.out.println("==================================================================");

        Programmer programmer1=new Programmer(1234567,"safsfg assdfg",(byte) 22,'M',"qwertyui@gmail.com","+996123456",80000,"java");
        Programmer programmer2=new Programmer(123456789,"asdfgh asdfghjk",(byte) 12,'M',"asdfgh@gmail.com","+996654324321",75000,"javasprip");
        Programmer[]programmers={programmer1,programmer2};
        System.out.println(programmer1);
        System.out.println(programmer2);
        System.out.println(programmer1.favoriteMouth(2));
        System.out.println(programmer1.favoriteLanguage());
        programmer1.favoriteSport();
        System.out.println(programmer1.getLastName());
        System.out.println(programmer1.getDateOfBrith(2000,5,1));
        System.out.println(programmer1.getPhoneNumberAndEmail());
        driver1.getPeopleOfAllAges(programmers);
        System.out.println("==================================================================");
    }
    }