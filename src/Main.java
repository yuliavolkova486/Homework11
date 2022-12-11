import java.time.LocalDate;

public class Main {
    public static boolean LeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printLeapYearOrNotLeapYear(int year) {
        if (LeapYear(year)) {
            System.out.println(year + " — високосный год");
            return;
        }
        System.out.println(year + " — не високосный год");
    }

    public static void printCalculationOfDeliveryTime(int deliveryDistance) {
        if (deliveryDistance > 0) {
            System.out.println("Потребуется дней " + ((deliveryDistance + 20) / 40 + 1));
        }
    }

    public static String getVersionOS(int versionOS) {
        if (versionOS == 0) {
            return "IOS";
        } else if (versionOS == 1) {
            return "Android";
        }
        return "Такой операционной системы не существует";
    }

    public static void printClientDeviceYear (int year, int versionOS) {
        if (year >= 2015 && year <= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для " + (getVersionOS(versionOS)) + " по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для " + (getVersionOS(versionOS)) + " по ссылке");
        }
    }

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        printLeapYearOrNotLeapYear(2020);

        // Задание 2
        System.out.println("Задание 2");
        printClientDeviceYear(2015, 0);

        // Задание 3
        System.out.println("Задание 3");
        printCalculationOfDeliveryTime(95);
    }
}