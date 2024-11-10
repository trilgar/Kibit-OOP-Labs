package com.trilgar.convolution;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConvolutionExample {
    public static void main(String[] args) throws IOException {
        String[] imagePaths = {
                "C:\\Users\\zarit\\IdeaProjects\\Kibit-OOP-Labs\\lab3\\plotgenerating\\src\\main\\resources\\city.jpg",
                "C:\\Users\\zarit\\IdeaProjects\\Kibit-OOP-Labs\\lab3\\plotgenerating\\src\\main\\resources\\cat.jpg",
                "C:\\Users\\zarit\\IdeaProjects\\Kibit-OOP-Labs\\lab3\\plotgenerating\\src\\main\\resources\\forest.jpg",
                "C:\\Users\\zarit\\IdeaProjects\\Kibit-OOP-Labs\\lab3\\plotgenerating\\src\\main\\resources\\mountain.jpg"
        };

        List<BufferedImage> originalImages = new ArrayList<>();
        List<BufferedImage> transformedImages = new ArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() - 1);
        long startTime = System.currentTimeMillis();

        for (String path: imagePaths) {
            BufferedImage inputImage = ImageIO.read(new File(path));
            BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), inputImage.getType());

            int width = inputImage.getWidth();
            int height = inputImage.getHeight();

            originalImages.add(inputImage);
            transformedImages.add(outputImage);

            for (int y = 1; y < height - 1; y++) {
                int finalY = y;
                executor.submit(new ImageTransformer(inputImage, outputImage, width, finalY, Kernels.SHARPENING_FILTER));
            }
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all tasks to finish
        }
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + " ms");

        ImageDisplayService.displayImages(originalImages, transformedImages);
    }


}

