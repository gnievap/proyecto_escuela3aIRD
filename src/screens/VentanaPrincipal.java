package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar; // Barra de menú
    private JMenu menuAlumnos; // Menú Alumnos
    private JMenuItem menuInsertarAlumnos; // Elemento Insertar
    private JMenuItem menuVerAlumnos;
    private JMenuItem menuEliminarAlumnos;

    private JMenu menuBachilleratos; // Menú Bachilleratos
    private JMenuItem menuVerBachilleratos;

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

        // menu Insertar Alumnos
        menuInsertarAlumnos = new JMenuItem();
        menuInsertarAlumnos.setText("Insertar...");

        // menu Ver Alumnos
        menuVerAlumnos = new JMenuItem("Ver todos los alumnos...");

        // menu Eliminar Alumnos
        menuEliminarAlumnos = new JMenuItem("Dar de baja alumno...");

        // menu Bachilleratos
        menuBachilleratos = new JMenu();
        menuBachilleratos.setText("Bachilleratos");
        // menu Ver Bachilleratos
        menuVerBachilleratos = new JMenuItem("Ver todos los bachilleratos...");


        // Agregando menu Alumnos
        menuAlumnos.add(menuVerAlumnos);
        menuAlumnos.add(menuInsertarAlumnos);
        menuAlumnos.add(menuEliminarAlumnos);
        menuBar.add(menuAlumnos);

        // Agregando menu Bachilleratos
        menuBachilleratos.add(menuVerBachilleratos);
        menuBar.add(menuBachilleratos);
      
        this.setJMenuBar(menuBar); // menuBar es la única barra del JFrame

        pack(); // Empaquetar los componentes del JFrame

    }
    
}
