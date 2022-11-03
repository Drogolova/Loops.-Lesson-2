public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        double depositPerMonth = 15_000;
        double total = 2_459_000;
        double amountNow = 0;
        double counter = 0;
        while (total >= amountNow) {
            amountNow = amountNow + amountNow / 100 + depositPerMonth;
            counter++;
            System.out.println("Месяц " + counter + " : " + amountNow + " рублей");
        }
        System.out.println("Месяц " + Math.round(counter) + ", сумма накоплений равна " + Math.round(amountNow) + " рублей");

        System.out.println("Задание 1.2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Задание 1.3");
        int country = 12_000_000;
        int birthPerYear = country / 1000 * 17;
        int deathPerYear = 8;
        for (int m = 2022; m <= 2032; m++) {
            country = country + birthPerYear - deathPerYear;
            System.out.println("Год " + m + " численность населения составляет " + country);
        }
        System.out.println("Задание 2.1");
        double money = 15_000;
        double goal = 12_000_000;
        int count = 0;
        while (money < goal) {
            money = money + money * 0.07;
            count++;
            System.out.println("Месяц " + count + " сумма " + Math.round(money) + " рублей");
        }
        System.out.println("Задание 2.2");
        double money2 = 15_000;
        double goal2 = 12_000_000;
        int count2 = 0;
        while (money2 < goal2) {
            money2 = money2 + money2 * 0.07;
            count2++;
            if (count2 % 6 == 0)
                System.out.println("Месяц " + count2 + " сумма " + Math.round(money2) + " рублей");
        }
        System.out.println("Задание 2.3");
        double money3 = 15_000;
        for (int month = 1; month <= 108; month++) {
            money3 = money3 + money3 * 0.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + Math.round(money3));
            }
        }
        System.out.println("Задание 2.4");
        int friday = 3;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
            friday = friday + 7;
        } while (friday <= 31);


        System.out.println("Задание 3.1");
        for (int cometYear = 0; cometYear <= 2022 + 79; cometYear = cometYear + 79) {
            if (cometYear > 1822) {
                System.out.println(cometYear);
            }
        }
            System.out.println("Задание 3.2");
            for (int d = 1; d <= 10; d++) {
                int f = d * 2;
                System.out.println("2 * " + d + " = " + f);
        }
    }
}
