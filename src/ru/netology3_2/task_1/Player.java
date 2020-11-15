package ru.netology3_2.task_1;

import ru.netology3_2.task_1.weapons.BigGun;
import ru.netology3_2.task_1.weapons.GrenadeLauncher;
import ru.netology3_2.task_1.weapons.Pistol;
import ru.netology3_2.task_1.weapons.Slingshot;
import ru.netology3_2.task_1.weapons.WaterGun;
import ru.netology3_2.task_1.weapons.Weapon;

public class Player {

    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                new BigGun(),
                new WaterGun(),
                new Slingshot(),
                //new Pistol(),
                new GrenadeLauncher()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shootWithWeapon(int slot) {
        // проверить на выход за границы
        if (slot >= weaponSlots.length) {
            throw new IllegalArgumentException(String.format("Слота с оружием № %d не существует", slot));
        }

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shoot();
    }
}
