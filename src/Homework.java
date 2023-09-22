import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {
        int year = 2024;
        task1(year);
        int clientOC = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        task2(clientOC,clientDeviceYear);
        int deliveryDistance = 71;
        task3(deliveryDistance);

    }

    public static void task1(int year) {
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year > 1584) {
            System.out.println(year+" - високосный год");
        } else {
            System.out.println(year+" -не високосный год ");
        }
    }
    public static void task2(int clientOC, int clientDeviceYear){
        if (clientOC == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOC == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOC == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    public static void task3(int deliveryDistance){
        if (deliveryDistance < 20) {
            System.out.println("Доставка будет осуществлена в течение суток");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Доставка будет осуществлена в течение 2 дней");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка будет осуществлена в течение 3 дней");
        } else {
            System.out.println("Ваше расположение не входит в зону обслуживания нашей компании.");
        }
    }
}
