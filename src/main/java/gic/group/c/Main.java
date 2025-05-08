package gic.group.c;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My Desktop App");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label = new JLabel("Hello from Java Desktop App!", SwingConstants.CENTER);
            frame.add(label);
            frame.setVisible(true);
        });
    }
}