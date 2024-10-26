package com.trilgar.multithreading;

public class MyTrigonometricFunction implements Calculable {

    // Визначаємо ресурсозатратну функцію
    @Override
    public double calculate(double x) {
        return Math.sin(x) * Math.cos(x) + Math.cos(x) * Math.cos(x) + Math.sin(x) * Math.sin(x);
    }
}
