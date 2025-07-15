package screens;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame{
    public JDesktopPane desktop;  // Escritorio dentro del Frame
    private JMenuBar jMenuBar;
    private JMenu jMenuAlumnos;
    private JMenu jMenuCarreras;
    private JMenuItem jMenuItemInsertar;
    private JMenuItem jMenuItemVerAlumnos;
    private JMenuItem jMenuItemInsertarCarreras;
    private JMenuItem jMenuItemVerCarreras;

    public VentanaPrincipal(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        // DesktopPane - escritorio
        desktop = new JDesktopPane();
        this.add(desktop);
        this.setContentPane(desktop); 
        // Barra de Menu
        jMenuBar = new JMenuBar();
        // this.add(jMenuBar);
        // Menu Alumnos
        jMenuAlumnos = new JMenu();
        jMenuAlumnos.setText("Alumnos");
        // Elemento de menu: Insertar
        jMenuItemInsertar = new JMenuItem();
        jMenuItemInsertar.setText("Insertar...");
        jMenuItemInsertar.addActionListener(e -> jmiInsertarAlumno());
        // Elemento de menu: Ver alumnos
        jMenuItemVerAlumnos = new JMenuItem();
        jMenuItemVerAlumnos.setText("Ver todos los alumnos...");

        // Menú Carreras
        jMenuCarreras = new JMenu();
        jMenuCarreras.setText("Carreras");
        // Elemento de menu: Ver Carreras
        jMenuItemVerCarreras = new JMenuItem();
        jMenuItemVerCarreras.setText("Ver todas las carreras...");
        // Elemento de menu: Insertar carrera
        jMenuItemInsertarCarreras = new JMenuItem();
        jMenuItemInsertarCarreras.setText("Insertar...");

        jMenuItemInsertarCarreras.addActionListener(e -> jmiInsertarCarreras());
       


        // Agregar menuItem a menu 
        jMenuAlumnos.add(jMenuItemVerAlumnos);
        jMenuAlumnos.add(jMenuItemInsertar);
        jMenuBar.add(jMenuAlumnos);

        jMenuCarreras.add(jMenuItemVerCarreras);
        jMenuCarreras.add(jMenuItemInsertarCarreras);
        jMenuBar.add(jMenuCarreras);

        this.setJMenuBar(jMenuBar);
        pack();
    }

    private void jmiInsertarCarreras(){
       //Crear un objeto de tipo JInternalFrame
        JInternalFrameInsertarCarrera insertarCarrera = new JInternalFrameInsertarCarrera();
        
        //Agregar el internalFrame al escritorio
        this.desktop.add(insertarCarrera);
        
        //Le digo que se muestre el internalFrame
        insertarCarrera.setVisible(true);
    }

    private void jmiInsertarAlumno(){
        //Crear un objeto de tipo JInternalFrame
        JInternalFrameInsertarAlumnos insertarAlumnos = new JInternalFrameInsertarAlumnos();
        
        //Agregar el internalFrame al escritorio
        this.desktop.add(insertarAlumnos);
        
        //Le digo que se muestre el internalFrame
        insertarAlumnos.setVisible(true);
    }

    
}
