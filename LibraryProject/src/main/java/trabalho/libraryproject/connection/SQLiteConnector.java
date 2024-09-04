/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author marco
 */
public class SQLiteConnector 
{
    private Connection connection;
    
    public SQLiteConnector(String dataBaseName) throws SQLException
    {
        String url = "jdbc:sqlite" + dataBaseName;
        this.connection = DriverManager.getConnection(url);
        
        createTableAuthor();
        createTableUser();
        createTableBook();
    }

    private void createTableAuthor() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS author ("
                + "ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "cpf TEXT NOT NULL,"
                + "name TEXT NOT NULL,"
                + "age TEXT NOT NULL,"
                + "bookList TEXT NOT NULL"
                + ");";
        
        try(Statement stmt = this.connection.createStatement()){
            stmt.execute(sql);
        }catch(SQLException e)
        {
            System.out.println("""
                               ERRO!
                               Cannot create the table.
                               """ + e.getMessage());
        }
    }

    private void createTableUser() {
        String sql = "CREATE TABLE IF NOT EXISTS user ("
                + "ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "cpf TEXT NOT NULL,"
                + "name TEXT NOT NULL,"
                + "age TEXT NOT NULL,"
                + "bookList TEXT NOT NULL"
                + ");";
        try(Statement stmt = this.connection.createStatement()){
            stmt.execute(sql);
        }catch(SQLException e)
        {
            System.out.println("""
                               ERRO!
                               Cannot create the table.
                               """ + e.getMessage());
        }
    }

    private void createTableBook() {
        String sql = "CREATE TABLE IF NOT EXISTS user ("
                + "ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "title TEXT NOT NULL,"
                + "authorId INTEGER,"
                + "isbn TEXT NOT NULL,"
                + "FOREIGN KEY (authorId) REFERENCES author(ID)"
                + ");";
        try(Statement stmt = this.connection.createStatement()){
            stmt.execute(sql);
        }catch(SQLException e)
        {
            System.out.println("""
                               ERRO!
                               Cannot create the table.
                               """ + e.getMessage());
        }
    }

    public String getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
