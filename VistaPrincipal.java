
package proyecto;

import javax.swing.*;
import java.awt.*;

public class VistaPrincipal extends JFrame {
    public VistaPrincipal() {
        setTitle("Proyecto Integrado - Métodos y Listas");
        setSize(600, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnOrdenamiento = new JButton("Métodos de Ordenamiento");
        JButton btnListasDobles = new JButton("Listas Dobles");
        JButton btnListasCirculares = new JButton("Listas Circulares");

        add(btnOrdenamiento);
        add(btnListasDobles);
        add(btnListasCirculares);

        btnOrdenamiento.addActionListener(e -> new VistaOrdenamiento());
        btnListasDobles.addActionListener(e -> new ListaDoble().demo());
        btnListasCirculares.addActionListener(e -> new ListaCircular().demo());

        setVisible(true);
    }
}
