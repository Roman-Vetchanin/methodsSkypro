import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {
        int year = 2024;
        leapYear(year);
        int clientOC = 0;
        int clientDeviceYear = 2022;
        clienApp(clientOC, clientDeviceYear);
        int deliveryDistance = 0;
        cardDelivery(deliveryDistance);

        periodDelivery(cardDelivery(deliveryDistance));

    }

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year > 1584) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void clienApp(int clientOC, int clientDeviceYear) {
        if (clientOC == 0 && clientDeviceYear >= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOC == 0 && clientDeviceYear <= LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOC == 1 && clientDeviceYear >= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    public static int cardDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
    public static void periodDelivery (int deliveryTime){
        if (deliveryTime == 1){
            System.out.println("Доставка будет осуществлена в течение суток");
        } else if (deliveryTime == 2) {
            System.out.println("Доставка будет осуществлена в течение 2 дней");
        } else if (deliveryTime == 3) {
            System.out.println("Доставка будет осуществлена в течение 3 дней");
        } else {
            System.out.println("Ваше расположение не входит в зону обслуживания нашей компании.");
        }
    }
}