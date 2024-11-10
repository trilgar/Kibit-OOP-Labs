package com.trilgar.convolution;

import java.awt.*;
import java.awt.image.BufferedImage;

class ImageTransformer implements Runnable {
    private final BufferedImage inputImage;
    private final BufferedImage outputImage;
    private final int width;
    private final int finalY;

    private final int[][] kernel;

    public ImageTransformer(BufferedImage inputImage,
                            BufferedImage outputImage,
                            int width,
                            int finalY,
                            int[][] kernel) {
        this.inputImage = inputImage;
        this.outputImage = outputImage;
        this.width = width;
        this.finalY = finalY;
        this.kernel = kernel;
    }

    @Override
    public void run() {
        for (int x = 1; x < width - 1; x++) {
            applyConvolution(inputImage, outputImage, x, finalY);
        }
    }

    private void applyConvolution(BufferedImage input, BufferedImage output, int x, int y) {
        int red = 0, green = 0, blue = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int rgb = input.getRGB(x + j, y + i);
                Color color = new Color(rgb);
                red += color.getRed() * kernel[i + 1][j + 1];
                green += color.getGreen() * kernel[i + 1][j + 1];
                blue += color.getBlue() * kernel[i + 1][j + 1];
            }
        }

        red = Math.min(Math.max(red, 0), 255);
        green = Math.min(Math.max(green, 0), 255);
        blue = Math.min(Math.max(blue, 0), 255);

        output.setRGB(x, y, new Color(red, green, blue).getRGB());
    }
}
