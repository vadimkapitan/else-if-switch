public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
        else
            System.out.println("Обратитесь в тех поддержку.");
    }

    public static void task3() {
        int year = 2024;
        if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0) {
            System.out.println(year + " является високосным.");
        } else
            System.out.println(year + " не является високосным.");
    }

    public static void task4() {
        int deliveryDistance = 94;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает " + day + " день.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка занимает " + (day + 1) + " дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка занимает " + (day + 2) + " дня.");
        } else
            System.out.println("Доставки нет");
    }

    public static void task5() {
        int monthNumber = 13;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Нет такого времени года");
        }
    }
}