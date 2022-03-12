package com.senla.gomel.demo_test_2022.tasks3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Создайте программу, которая будет:
 * подсчитывать количество гласных в словах
 * выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
 * делать первую гласную букву в слове заглавной
 * Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).
 * **/

public class Tasks3 {
    public static void main(String[] args) {
        System.out.println("Введите текст русскими буквами");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String str = text;
        System.out.println(str);
        //метод toLowerCase() преобразует все символы в сроке в нижний регистр
        str = str.toLowerCase();
        System.out.println(str);
        // метод split() разделяет данную строку вокруг данного регулярного выражения
        String[] words = str.split(" "); //таким образом разделяем строку вокруг пробелов и вносим сразу в массив
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        //Метод charAt()
        //Метод charAt() — возвращает символ, расположенный по указанному индексу строки.

        System.out.println();
        for (int i = 0; i < words[1].length(); i++) {
            System.out.print(words[1].charAt(i) + " "); //пример использования charAt, распечатаем первое слово по буквам
        }
        System.out.println();
        // задача подсчитать количество гласных в каждлм слове

        String vowel = "ауоыиэяюёе"; // строка из гласных

        //Метод indexOf()
        //возврвщает индекс искомого символа в строке


        //поиск гласных в словах и вывод их идексов
        //если искомая буква не найдена IndexOf возвращает -1

        System.out.println("индексы каждой буквы по словам:");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowel.indexOf(words[i].charAt(j));
                System.out.print(index + " ");
            }
            System.out.println();
        }

        //чтобы подсчитать количество гласных будем подсчитывать количество index больше 0
        // для записи подсчитанных значений будем использовать вспомогательный массив

        //создание вспомогательного массиса хранящего значение количества гласных букв в слове

        int[] count = new int[words.length]; //таким образов создан одномерный массив размеров в количество наших слов, сразу заполнен нулями

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowel.indexOf(words[i].charAt(j));
                if (index > 0) {
                    count[i] = count[i] + 1;
                }
            }
        }

        System.out.println("колмчество глассных в словах:");
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }

        //Сортировка выбором (Selection sort)

        for (int i = 0; i < count.length - 1; i++) {

            for (int j = i+1; j < count.length; j++) {

                if (count[i] > count[j]) {

                    int buf = count[i];
                    count[i] = count[j];
                    count[j] = buf;

                    String sbuf = words[i]; //сортируем слова по тем же критериям что и числа в массиве count
                    words[i] = words[j];
                    words[j] = sbuf;
                }
            }
        }

        System.out.println();
        System.out.println("отсортированы числа и слова:");
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(words));

    }

}
