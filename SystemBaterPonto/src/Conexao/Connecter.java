package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecter {
    
    public static void main(String[] args) throws SQLException {
        Connection connect;
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetobp?zeroDateTimeBehavior=convertToNull","root","");
        System.out.println("Conectado com sucessor ao seu servidor!");
        connect.close();
    }
}
