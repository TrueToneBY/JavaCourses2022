package com.senla.gomel.demo_test_2022.tasks5;

/**
 * Есть набор предметов, задаваемый заранее, предметы могут повторяться. Предмет имеет 2 параметра (обязательных,
 * остальные добавлять на усмотрение): объем (целое значение) и ценность (целое значение). Предметы неделимы.
 * Также задаётся сейф с обязательным параметром его объёма (целое значение).
 * Нужно написать программу, которая наполняет сейф набором предметов таким образом,
 * чтобы ценность этого набора была максимальной.
 * **/

public class MainBruteforce {
    public static void main(String[] args) {
        int[] weights = {3, 4, 5, 8, 9};
        int[] prices = {1, 6, 4, 7, 10};

        int maxWeight = 100;

        long count = 2L << weights.length;

        int maxPrice = 0;
        long maxState = 0;

        for (long state = 0; state < count; state++) {
            int price = statePrice(state, prices);
            int weight = stateWeight(state, weights);
            if (weight <= maxWeight) {
                if (maxPrice < price) {
                    maxPrice = price;
                    maxState = state;
                }
            }
        }

        System.out.println("Оптимальное содержимое рюкзака:");
        long poverOfTwo = 1;
        for (int i = 0; i < weights.length; i++) {
            if ((poverOfTwo & maxState) > 0) {
                System.out.println(i + 1);
            }
            poverOfTwo <<= 1;
        }
    }

    private static int stateWeight(long state, int[] weights) {
        long poverOfTwo = 1;
        int weight = 0;
        for (int i = 0; i < weights.length; i++) {
            if ((poverOfTwo & state) != 0) {
                weight += weights[i];
            }
            poverOfTwo <<= 1;
        }

        return weight;
    }

    private static int statePrice(long state, int[] prices) {
        long poverOfTwo = 1;
        int price = 0;
        for (int i = 0; i < prices.length; i++) {
            if ((poverOfTwo & state) != 0) {
                price += prices[i];
            }
            poverOfTwo <<= 1;
        }

        return price ;
    }
}
