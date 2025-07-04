package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar; // Barra de menú
    private JMenu menuAlumnos; // Menú Alumnos
    private JMenuItem menuInsertarAlumnos; // Elemento Insertar

    public VentanaPrincipal(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 700);
        initComponents();
    }

    private void initComponents(){
        // Barra de menú
        menuBar = new JMenuBar();

        // menu Alumnos
        menuAlumnos = new JMenu();
        menuAlumnos.setText("Alumnos");

        // menu Insertar
        menuInsertarAlumnos = new JMenuItem();
        menuInsertarAlumnos.setText("Insertar...");

    }
    
}
