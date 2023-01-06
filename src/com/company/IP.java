package com.company;

import java.util.Scanner;

public class IP {

    public static void main(String[] args) {
         int operation = 0;
         int earnings = 0;    // доходы
         int spendings = 0;   // расходы
         int usn_r = 0;
         int usn_d_r = 0;
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать ситему налогооблажения\n" +
                    "для завершения работы нажмите - end");
            input = scanner.nextLine();

            if ("end".equals(input)) {
                //1    profit(earnings);
                System.out.println("Доходы ИП: " + earnings + " рублей");
                System.out.println("Расходы ИП: " + spendings + " рублей");
                System.out.println("УСН доходы: " + usn_r(earnings) + " рублей");
                System.out.println("УСН доходы минус расходы: " + usn_d_r(earnings, spendings) + " рублей");
                System.out.println("Экономия: " + (usn_d_r(earnings, spendings) - usn_r(earnings)) + " рублей");
                break;
            }

            operation = Integer.parseInt(input);
            switch (operation)
            {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    input = scanner.nextLine(); // Не используйте тут nextInt (!)
                    earnings = earnings + Integer.parseInt(input);
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    input = scanner.nextLine(); // Не используйте тут nextInt (!)
                    spendings = spendings + Integer.parseInt(input);
                    break;
                case 3:
                    System.out.println("Выбрать ситему налогооблажения");
                    int usn_r1 = usn_r(earnings);
                    int usn_d_r1 = usn_d_r(earnings, spendings);
                    if ( usn_r1 < usn_d_r1) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + usn_r1 + " рублей");
                        System.out.println("Налог на другой системе: " + usn_d_r1 + " рублей");
                        System.out.println("Экономия: " + (usn_d_r1 - usn_r1) + " рублей");
                        System.out.println("");
                    }
                    if ( usn_d_r1 < usn_r1) {
                        System.out.println("Мы советуем вам УСН доходы минус расходы: ");
                        System.out.println("Ваш налог составит: " + usn_d_r1 + " рублей");
                        System.out.println("Налог на другой системе: " + usn_r1 + " рублей");
                        System.out.println("Экономия: " + (usn_r1 - usn_d_r1) + " рублей");
                        System.out.println("");
                    }
                        break;

                default:
                    System.out.println("Такой операции нет");
            }

        }
        System.out.println("Программа завершена!");
    }

      public static int usn_r(int a) {
        return (a * 6) / 100;
      }

    public static int usn_d_r(int a, int b) {
        int tax = (a - b) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }
}
