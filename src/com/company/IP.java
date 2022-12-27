package com.company;

import java.util.Scanner;

public class IP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать ситему налогооблажения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int earnings = 0;    // доходы
            int spendings = 0;   // расходы
            int resultat = 0;
            int operation = Integer.parseInt(input);
            switch (operation)
            {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr1 = scanner.nextLine(); // Не используйте тут nextInt (!)
                    int money1 = Integer.parseInt(moneyStr1);
                    earnings += money1;
                   // resultat = earnings + earnings;
                   // profit(earnings);
                 //   System.out.println("Доходы ИП: " + earnings + earnings + "=" + profit(earnings) + " рублей");
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneyStr2 = scanner.nextLine(); // Не используйте тут nextInt (!)
                    int money2 = Integer.parseInt(moneyStr2);
                    spendings += money2;
                    consumption(spendings);
                    break;
                case 3:
                    System.out.println("Выбрать ситему налогооблажения");
                    if ("".equals(input)) {
                    //1    profit(earnings);
                        System.out.println("Доходы ИП: " + earnings + " + " + earnings + " = " + profit(earnings) + "рублей \n" +
                                "Расходы ИП: " +  spendings + "рублей\n" +
                                "УСН доходы: 6% от " + resultat + "рублей = " + 60 + "рублей\n" );
//            УСН доходы минус расходы: 15% от 1000-100 рублей = 135 рублей
//            Экономия: 135 - 60 = 75 рублей");
                        break;
                    }
//                default:
//                    System.out.println("Такой операции нет");
            }

        }
        System.out.println("Программа завершена!");
    }
    public static int profit(int earnings) {
        int tax1 = earnings + earnings ;
        if (tax1 >=0) {
        //    System.out.println("Доходы ИП: " + earnings + earnings + "=" + tax1 + " рублей");
            return tax1;

        }
            return 0;
    }
    public static int consumption(int spendings) {
        int tax2 = (spendings) ;
        if (tax2 >=0) {
            return tax2;
        }
        return 0;
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }


}
