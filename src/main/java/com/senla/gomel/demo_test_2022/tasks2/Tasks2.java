package com.senla.gomel.demo_test_2022.tasks2;

import java.util.Scanner;

/**
 *Создайте программу, которая будет вычислять и выводить на экран простые множители, из которых состоит целое число,
 *  введенное пользователем. Если введенное число не целое, то нужно сообщать пользователю об ошибке.
 * */

public class Tasks2 {
    public static void main(String[] args) {
        boolean summa = true;

            System.out.println("Введите цело число");
            Scanner num = new Scanner(System.in);
            Integer number = num.nextInt();
            if (number % 2 == 0){
                System.out.println( number + " Целое число");

                for (int P = 2; P <= number; P++) {
                    for ( int i = 2; i < P; i++) {
                        if (P % i == 0) {
                            summa = false;
                            break;
                        }
                    }
                    if (summa) System.out.println(P + " простой множитель");
                    else summa = true;
                }

            }else {
                System.out.println(number + " Нецелое число");
            }





    }
}
