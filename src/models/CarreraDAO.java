package screens;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Carrera;

// CarreraDAO: contiene todos los métodos para interactuar  con la tabla Carreras
// como insert, select, update y delete


public class CarreraDAO {
    private Connection conn;

    public CarreraDAO(Connection conn){
        this.conn = conn;
    }

    public int insertarCarrera(Carrera carrera){
        int rows = 0;
        String sql = "INSERT INTO carreras(idcarrera, nombre, monto) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, carrera.getId());
            stmt.setString(2, carrera.getNombre());
            stmt.setDouble(3, carrera.getMonto());
            rows = stmt.executeUpdate();
        } catch (SQLException e){
            System.out.println("Error al insertar carrera: " + e.getMessage());
        }
        return rows;
    }
    
}
