package com.company;
import java.util.*;


public class Elevator {

    Scanner scanner = new Scanner(System.in);
    Queue<Integer> deque = new PriorityQueue<>();

    public final int START_FLOOR = 0;
    public final int END_FLOOR = 25;
    String enterNumberMsg = "Введите номер этажа от 1 до " + END_FLOOR + " (для завершения введите 0)";


    public void floors(){
        System.out.println("Добро пожаловать в лифт");
        while (true) {
            int floor = 0;
            System.out.println(enterNumberMsg);

            try {
                floor = scanner.nextInt();
                if (floor < START_FLOOR || floor > END_FLOOR) {
                    System.out.println("Некорректно, попробуйте, снова");
                    continue;
                }
                deque.add(floor);
                if (floor == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка, таких этажей нет! ");
                scanner.nextLine();
            }
        }
            System.out.println();
            System.out.println("Лифт поехал ");

        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previousFloor = -1;
    //    int currentFloor = 0;
            while (!deque.isEmpty()) {
                //Integer floor = deque.poll();


                Integer floors = deque.poll();
                System.out.println("Этаж " + floors);
                if (previousFloor != -1) {
                    totalSeconds += Math.abs(floors - previousFloor) * waitMoveInSeconds;
                    totalSeconds += waitDoorsInSeconds;

                }
                System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
            }

    }

}
