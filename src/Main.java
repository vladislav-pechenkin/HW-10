import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");

        String lastName = "Ivanov", firstName = "Ivan", middleName = "Ivanovich", fullName = "";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println();
        System.out.println("Задача № 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println();
        System.out.println("Задача № 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);
    }
}