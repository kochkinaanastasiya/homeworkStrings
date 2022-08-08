import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задача 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // Задача 3
        fullName = "Иванов Семён Семёнович";
        String words = fullName.replace("ё", "е");
        System.out.println(words);

        // Делала еще вот так, но не получилось

        //String [] words = fullName.split(" ");
        //System.out.println(Arrays.toString(words));

        //if(fullName.contains("ё") == true) {
        //System.out.println("е");
        // }
      }
}