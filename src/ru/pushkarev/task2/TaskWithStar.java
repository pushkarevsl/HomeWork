package ru.pushkarev.task2;


/*
Создать консольное Java-приложение «Горячо-Холодно»
1. Вначале программа «загадывает» случайное число от 1 до 100.
2. Пользователь вводит с консоли число.
3. Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно»,
   И позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее
4. Для первого ввода пользователя считаем предыдущим введенным числом 0.
5. Предусмотреть возможность выхода из игры до отгадывания числа.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
План решения
1.  Через хз какой метод, рандомный выбор числа от 1 до 100
2.  Введите число
    Через Баффер ввод с консоли
3. Короче делим 100 попполам и смотрим если от 0 до 50 то...., если от50 до 100 то...., и так для каждый
   отрезок делим пополам
4. Понял что нужно делать. Берем значение наше и прибавляем и отнимаем сначало по 50, 25, 10, 3, 1. Создавая коридор.
И сравнивать наше значение с рандомным. А на выводе горячо, Горячее, очень и тд

*/
public class TaskWithStar {
    public static void main(String[] args) throws IOException {
        System.out.print("Рандомное число = ");
        int rnd = (int) (Math.random() * 100 + 1);
        System.out.println(rnd); //вывел для себя, чтоб знать и ориентироваться

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от 1 до 100");


        for (; ; ) {
            int val = Integer.parseInt(reader.readLine());

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
            if (rnd == val) {
                System.out.println("You winner!!!!");
            }
        }
    }
}


