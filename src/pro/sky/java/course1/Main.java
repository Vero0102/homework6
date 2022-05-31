package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        int[] randomExpenditure = generateRandomArray();

        //Задание №1
        int monthExpenditure = 0;
        for (int j : randomExpenditure) {
            monthExpenditure = monthExpenditure + j;
        }
        System.out.println("Сумма трат за месяц составила " + monthExpenditure + " рублей.");

        //Задание№2
        int minDayExpenditure = 200_001;
        int maxDayExpenditure = 99_999;
        for (int j : randomExpenditure) {
            if (j < minDayExpenditure) {
                minDayExpenditure = j;
            }
            if (j > maxDayExpenditure) {
                maxDayExpenditure = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDayExpenditure + " рублей. Максимальная сумма трат за день составила " + maxDayExpenditure + " рублей.");

        //Задание№3
        double averageMonthExp = (double) monthExpenditure / randomExpenditure.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthExp + " рублей.");

        //Задание№4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expenditure = new int[30];
        for (int i = 0; i < expenditure.length; i++) {
            expenditure[i] = random.nextInt(100_000) + 100_000;
        }
        return expenditure;
    }
}