package com.trilgar.multithreading;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinArrayProcessing {
    public static void main(String[] args) {
        int size = 20_000_000;
        double[] array = new double[size];
        double step = 20.0 / size;

        // Ініціалізуємо масив деякими значеннями від -10 до 10 з малим кроком
        for (int i = 0; i < size; i++) {
            array[i] = -10 + i * step;
        }

        long startTime = System.currentTimeMillis();

        // Створюємо ForkJoinPool та запускаємо обробку масиву
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new ApplyFunctionTask(array, 0, array.length, new MyTrigonometricFunction()));

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

        // Відображення результатів у вигляді графіка
        PlotDisplayer.showChart(array, step);
    }
}

