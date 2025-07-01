
package proyecto;

import javax.swing.*;
import java.awt.*;

public class VistaOrdenamiento extends JFrame {
    JTextArea area;

    public VistaOrdenamiento() {
        setTitle("Métodos de Ordenamiento");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel botones = new JPanel(new GridLayout(1, 4));
        JButton burbuja = new JButton("Burbuja");
        JButton seleccion = new JButton("Selección");
        JButton insercion = new JButton("Inserción");
        JButton quicksort = new JButton("Quicksort");
        botones.add(burbuja);
        botones.add(seleccion);
        botones.add(insercion);
        botones.add(quicksort);

        area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);

        add(botones, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        burbuja.addActionListener(e -> mostrarProceso("Burbuja"));
        seleccion.addActionListener(e -> mostrarProceso("Selección"));
        insercion.addActionListener(e -> mostrarProceso("Inserción"));
        quicksort.addActionListener(e -> mostrarProceso("Quicksort"));

        setVisible(true);
    }

    private void mostrarProceso(String metodo) {
        area.setText("Ejecutando método de ordenamiento: " + metodo + "\n");
        area.append("Paso 1...\nPaso 2...\nResultado final...\n");
    }
}
