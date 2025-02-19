package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Ventana con Botón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Crear el botón
        JButton button = new JButton("¡Haz clic aquí!");

        // Establecer el layout (centrado)
        frame.setLayout(new BorderLayout());
        frame.add(button, BorderLayout.CENTER);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
