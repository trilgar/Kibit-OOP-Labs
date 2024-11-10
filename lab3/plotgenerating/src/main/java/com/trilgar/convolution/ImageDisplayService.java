package com.trilgar.convolution;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class ImageDisplayService {
    private List<BufferedImage> originalImages;
    private List<BufferedImage> transformedImages;
    private int currentIndex = 0;

    public ImageDisplayService(List<BufferedImage> originalImages, List<BufferedImage> transformedImages) {
        this.originalImages = originalImages;
        this.transformedImages = transformedImages;
        createSlideshow();
    }

    private void createSlideshow() {
        JFrame frame = new JFrame("Convolution Example - Slideshow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setLayout(new BorderLayout());

        JLabel originalLabel = new JLabel();
        JLabel transformedLabel = new JLabel();
        updateImages(originalLabel, transformedLabel);

        JPanel imagePanel = new JPanel(new GridLayout(1, 2));
        imagePanel.add(originalLabel);
        imagePanel.add(transformedLabel);

        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");

        prevButton.addActionListener(e -> {
            if (currentIndex > 0) {
                currentIndex--;
                updateImages(originalLabel, transformedLabel);
            }
        });

        nextButton.addActionListener(e -> {
            if (currentIndex < originalImages.size() - 1) {
                currentIndex++;
                updateImages(originalLabel, transformedLabel);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        frame.add(imagePanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void updateImages(JLabel originalLabel, JLabel transformedLabel) {
        originalLabel.setIcon(new ImageIcon(originalImages.get(currentIndex)));
        transformedLabel.setIcon(new ImageIcon(transformedImages.get(currentIndex)));
    }

    public static void displayImages(List<BufferedImage> originalImages, List<BufferedImage> transformedImages) {
        new ImageDisplayService(originalImages, transformedImages);
    }
}
