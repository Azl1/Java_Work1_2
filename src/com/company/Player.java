package com.company;

import com.company.weapon.*;

import java.util.Scanner;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new Gun(),
                new Machine(),
                new RPG(),
                new Slingshot(),
                new Water_gun(),
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        if (slot < getSlotsCount() && slot > -1) {
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            // Огонь!

            weapon.shot();
        } else {
            System.out.println("Внет оружия!");
        }
    }



    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Player player = new Player();
            // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти%n",
                    player.getSlotsCount()

            );

            int slot;
            while (true) {
                slot = scanner.nextInt();
                if (slot == -1) {
                    break;
                }
                player.shotWithWeapon(slot);
            }
            // TODO главный цикл игры:
            // запрашивать номер с клавиатуры
            // с помощью scanner.nextInt(),
            // пока не будет введено -1

            System.out.println("Game over!");
        }

}

