package com.trilgar.convolution;

public interface Kernels {
    /*
    Це ядро називається фільтр підвищення чіткості (Sharpening Filter). Його мета —
    підвищити різкість зображення, роблячи деталі більш виразними та виділяючи межі між об'єктами
     */
    int[][] SHARPENING_FILTER = {
            {0, -1, 0},
            {-1, 5, -1},
            {0, -1, 0}
    };

    /*
    Це ядро використовується для згладжування зображення шляхом зменшення деталей і шуму.
    Воно застосовує середньозважене розмиття, причому центральні пікселі мають більшу вагу,
    а зовнішні – меншу. Фільтр часто використовується перед подальшими обробками, такими як виділення країв
     */
    int[][] GAUSSIAN_BLUR = {
            {1, 2, 1},
            {2, 4, 2},
            {1, 2, 1}
    };

    /*
    Ядро Собеля використовується для виділення горизонтальних країв на зображенні.
    Воно підсилює зміни яскравості вздовж осі X, що дозволяє виявляти горизонтальні межі.
    Застосування цього ядра підходить для алгоритмів комп'ютерного бачення, коли необхідно знайти контури об'єктів
     */
    int[][] SOBEL_X = {
            {-1, 0, 1},
            {-2, 0, 2},
            {-1, 0, 1}
    };

    /*
    Це ядро підсилює вертикальні зміни яскравості, допомагаючи виділити вертикальні контури об'єктів.
    Застосовується разом із Sobel X, щоб знайти повний набір країв на зображенні
     */
    int[][] SOBEL_Y = {
            {-1, -2, -1},
            {0, 0, 0},
            {1, 2, 1}
    };

    /*
     Це ядро використовується для виділення контурів на зображенні.
     Воно підсилює області з різкими змінами яскравості, що дозволяє знайти межі між
     об'єктами. Ядро підходить для простого виділення контурів перед застосуванням алгоритмів сегментації або аналізу
     */
    int[][] EDGE_DETECTION = {
            {0, 1, 0},
            {1, -4, 1},
            {0, 1, 0}
    };

    /*
    Ядро тиснення створює ефект тривимірності, додаючи відтінок рельєфу
    до зображення. Після застосування цього фільтру зображення виглядає так,
    ніби воно витиснене або має текстурний ефект. Тиснення часто використовується
    для декоративних цілей або при створенні естетичних ефектів
     */
    int[][] EMBOSS = {
            {-2, -1, 0},
            {-1, 1, 1},
            {0, 1, 2}
    };

}
