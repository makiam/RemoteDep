package app;

import app.AppMainFrame;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppMainFrame().setVisible(true));
    }
}