package com.senla.gomel.demo_test_2022.tasks4;

import java.util.Scanner;

/**
 * Создайте программу, которая будет получать число и печатать его в следующем формате (формы цифр можно придумать свои,
 * главное, чтобы они читались на экране):
 *(*) Дополнительно: сделайте так, чтобы наибольшая цифра состояла не из ‘*’,
 *  а из соответствующих маленьких (обычных) цифр.
 * **/

public class Tasks4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("imput number");
        int number = scanner.nextInt();
        scanner.close();

        String s = Integer.toString(number);
        int[] intArray = new int[s.length()];
        int count = 0;
        for (int i = 0;i < s.length(); i++){
            int n = 5;//ширина цифры
            int mid = n/2+1;
            for(int ind = 0;ind < intArray.length;ind++){
                if(intArray[ind] > 0){
                    System.out.print("     ");
                }
            }
            switch (intArray[i]){
                case 0:
                    for (i = 1;i <= n; i++){
                        for (int j = 1;j <= n; j++){
                            if ((j == 1 || j == n) || (i == 1 || i == n)){
                                System.out.print("*");
                            }else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();

                    }
                case 1:
                    for (i = 1; i <= n; i++){
                        for (int j = 1; j <= n; j++){
                            if (j == mid || i == n || (i + j == mid && j <= mid)){
                                System.out.print("*");
                            }else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
            }count++;
            break;
        }
    }




}
