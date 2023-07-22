public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        }
        System.out.println();

    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2016;
        int clientOS = 1;
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2023;
        if (year % 400 == 0) {
            System.out.println(year + " год являтся високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год являтся високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 9;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Принадлежит сезону зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Принадлежит сезону весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Принадлежит сезону осень");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Принадлежит сезону лето");
                break;
            default:
                System.out.println();

        }
    }
}

