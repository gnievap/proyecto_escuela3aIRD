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

        // Agregando menu
        menuAlumnos.add(menuInsertarAlumnos);
        menuBar.add(menuAlumnos);
      
        this.setJMenuBar(menuBar); // menuBar es la única barra del JFrame

        pack(); // Empaquetar los componentes del JFrame

    }
    
}
