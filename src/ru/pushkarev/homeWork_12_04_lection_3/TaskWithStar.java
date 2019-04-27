package ru.pushkarev.homeWork_12_04_lection_3;

/*
Создать консольное Java-приложение «Горячо-Холодно»
1. Вначале программа «загадывает» случайное число от 1 до 100.
2. Пользователь вводит с консоли число.
3. Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно»,
   И позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее
4. Для первого ввода пользователя считаем предыдущим введенным числом 0.
5. Предусмотреть возможность выхода из игры до отгадывания числа.
*/

import java.util.Scanner;

/*
План решения
1.  Через хз какой метод, рандомный выбор числа от 1 до 100
2.  Введите число
    Через Баффер ввод с консоли
*/
public class TaskWithStar {
    public static void main(String[] args) {
        System.out.print("Рандомное число = ");
        int rnd = (int) (Math.random() * 100 + 1);
        System.out.println(rnd); //вывел для себя, чтоб знать и ориентироваться
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начиная игру - ты должен ее закончить");
        System.out.println("Но если ты захочешь выйти, то набери 101 ");
        System.out.println("- - -");
        System.out.println("Введите число от 1 до 100");


        while (true) {
            int val = scanner.nextInt();

            int delta = Math.abs((rnd - val));
// ввел дополнительную переменную, дельта между рандомным числом и вводимым с клавиатуры.
// И уже по мере приближения к рандомному числу, делаю вывод Тепло, Холодно и тд
            if (val == 101) {
                System.out.println("Game over!");
                break;
            }
            if (delta >= 25) {
                System.out.println("Сильно холодно");
            } else if (delta >= 15) {
                System.out.println("Тепло");
            } else if (delta > 5) {
                System.out.println("Горячо");
            } else if (delta > 2) {
                System.out.println("Вот- вот уже обожжешься");
            } else if (delta == 0) {
                System.out.println("You are winner!!!!");
                break;
            }
        }
    }
}


        /*
        4. Понял что нужно делать. Берем значение наше и прибавляем и отнимаем сначало по 50, 25, 10, 3, 1.
        Создавая коридор. И сравнивать наше значение с рандомным. А на выводе горячо, Горячее, очень и тд
        if (rnd < (val + 50) && rnd > (val + 50)) {
        System.out.println("Тепло");
        }
        if (rnd < (val + 25) && rnd > (val + 25)) {
        System.out.println("Теплее");
        }
        if (rnd < (val + 10) && rnd > (val + 10)) {
        System.out.println("Горячо");
        }
        if (rnd < (val + 3) && rnd > (val + 3)) {
        System.out.println("Почти обжегся!!!!");
        }
        */
