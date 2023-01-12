import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = 0;
        double d = 0;
        double f = 0;
        String input = "";
//        System.out.println("Введите первое число: ");
//        d = sc.nextDouble();
//        System.out.println("Введите второе число: ");
//        f = sc.nextFloat();
       while (true) {
           System.out.println("Введите первое число: ");
           d = sc.nextDouble();
//           System.out.println("Введите второе число: ");
//           f = sc.nextFloat();
//            System.out.println("Операции над double/float\n" +
//                    "1. Сравнить\n" +
//                    "2. Округлить\n" +
//                    "3. Отбросить дробную часть\n");
//            String input = "";
            operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите второе число: ");
                    f = sc.nextFloat();
                    System.out.println("Резульат: числа равны ");
                    input = sc.nextLine(); // Не используйте тут nextInt (!)

                 //   d = d + Integer.parseInt(input);
                    d = Double.parseDouble(input);
                    comparison(d, f);
                    break;
                case 2:
                    System.out.println("Резульат: числа округлены  ");
                    input = sc.nextLine(); // Не используйте тут nextInt (!)
                    d = Double.parseDouble(input);
                    round_up(d);
                    double x = Math.round(f);
                    break;
                case 3:
                    System.out.println("Резульат: дробную часть отрбросаны  ");
                    input = sc.nextLine(); // Не используйте тут nextInt (!)
                    d = Double.parseDouble(input);
                    discard(d,f);
            }
        }
    }

    private static boolean comparison(double a, double b) {
        return (a == b);
    }

    public static double round_up (double a) {
        double x = Math.round(a);
        return x;
    }

    public static double discard (double a, double b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}