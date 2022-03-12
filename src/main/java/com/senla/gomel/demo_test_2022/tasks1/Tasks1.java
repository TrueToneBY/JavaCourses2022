package com.senla.gomel.demo_test_2022.tasks1;

import java.util.Scanner;
/**
 *  Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке. Если цифр нет,
 *  то возвращаемая сумма должна быть равна 0.
 * **/

public class Tasks1 {

    public static void main(String[] args) {
        int ans = 0;
        String t = "";

        System.out.println("Введите значение");
        Scanner scanner = new Scanner(System.in);
        String save = scanner.next();


        for (int i = 0; i < save.length(); i++) {
            if (save.charAt(i) >= '0' && save.charAt(i) <= '9') {
                t += save.charAt(i);
            } else {
                if (t.length() > 0) {
                    ans += Integer.parseInt(t);
                    t = "";
                }
            }
        }
        if (t.length() > 0) {
                ans += Integer.parseInt(t);

        }
        System.out.print("Вывод суммы в строке = " + ans);
    }
}
