/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import trabalho.libraryproject.model.entities.Author;
import trabalho.libraryproject.model.file.BookJSONSerializer;

/**
 *
 * @author marco
 */
public class AuthorDAODataBase implements IDao
{
    private Connection connection;

    public AuthorDAODataBase(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Object objO) {
        Author author = (Author) objO;
        BookJSONSerializer serializer = new BookJSONSerializer();
        String sql = "INSERT INTO author (cpf, name, age, bookList) VALUES (?, ?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, author.getCpf());
            stmt.setString(2, author.getName());
            stmt.setString(3, author.getAge());
            stmt.setString(4, serializer.toFile(author.getBooks()));
            stmt.executeUpdate();
        } catch (SQLException e) {
    System.out.println("ERROR! \nCan't save Author.\n" + e.getMessage());
}

    }

    @Override
    public void update(String codObjO, Object objO) {
        Author author = (Author) objO;
        String sql = "UPDATE author SET WHERE cpf = ?, name = ?, age = ?, bookList = ?";
        BookJSONSerializer serializer = new BookJSONSerializer();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            
            stmt.setString(1, codObjO);
            stmt.setString(2, author.getName());
            stmt.setString(3, author.getAge());
            stmt.setString(4, serializer.toFile(author.getBooks()));
            stmt.executeUpdate();
            
        }
            catch (SQLException e) {
    System.out.println("ERROR! \nCan't save Author.\n" + e.getMessage());
}

    }

    @Override
    public void remove(String codObjO) {
        String sql = "DELETE FROM author WHERE cpf = ?";
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, codObjO);
        } catch (SQLException e) {
    System.out.println("ERROR! \nCan't remove Author.\n" + e.getMessage());


        }
    }

    @Override
    public Object find(String codObjO) {
        String sql = "SELECT * FROM author WHERE cpf = ?";
        BookJSONSerializer serializer = new BookJSONSerializer();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, codObjO);
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next())
                {
                    return new Author(
                            serializer.fromFile(rs.getString("books")),
                            rs.getString("name"),
                            rs.getString("age"),
                            rs.getString("cpf")
                    );
                }
            }
        } catch (SQLException e) {
    System.out.println("ERROR! \nCan't find Author.\n" + e.getMessage());
}

        
        return null;
    }

    @Override
    public List findAll() {
        String sql = "SELECT * FROM author";
        List<Author> authors = new ArrayList<>();
        BookJSONSerializer serializer = new BookJSONSerializer();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
            {
                authors.add(new Author(
                            serializer.fromFile(rs.getString("books")),
                            rs.getString("name"),
                            rs.getString("age"),
                            rs.getString("cpf")
                ));
            }
       } catch (SQLException e) {
    System.out.println("ERROR! \nCan't find Author.\n" + e.getMessage());
}

        return authors;
    }
    
}
