package com.trilgar.multithreading;

import java.util.concurrent.RecursiveAction;

class ApplyFunctionTask extends RecursiveAction {
    private static final int THRESHOLD = 1000; // Поріг, коли задачі розбиваються на менші
    private final double[] array;
    private final int start;
    private final int end;
    private final Calculable function;

    public ApplyFunctionTask(double[] array, int start, int end, Calculable function) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.function = function;
    }

    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            // Якщо розмір задачі малий, виконуємо послідовно
            for (int i = start; i < end; i++) {
                array[i] = function.calculate(array[i]);
            }
        } else {
            // Якщо розмір задачі великий, ділимо на дві підзадачі
            int mid = (start + end) / 2;
            ApplyFunctionTask leftTask = new ApplyFunctionTask(array, start, mid, function);
            ApplyFunctionTask rightTask = new ApplyFunctionTask(array, mid, end, function);
            invokeAll(leftTask, rightTask);
        }
    }
}
