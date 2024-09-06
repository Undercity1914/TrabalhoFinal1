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
import trabalho.libraryproject.model.entities.User;
import trabalho.libraryproject.model.file.BookJSONSerializer;

/**
 *
 * @user igorxf
 */
public class UserDAODataBase implements IDao
{
    private Connection connection;

    public UserDAODataBase(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void save(Object objO) {
        User user = (User) objO;
        BookJSONSerializer serializer = new BookJSONSerializer();
        String sql = "INSERT INTO user (cpf, name, age, bookList) VALUES (?, ?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, user.getCpf());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getAge());
            stmt.setString(4, serializer.toFile(user.getBooks()));
            stmt.executeUpdate();
        }catch (SQLException e) {
    System.out.println("ERROR!\nCan't save User.\n" + e.getMessage());
}

    }

    @Override
    public void update(String codObjO, Object objO) {
        User user = (User) objO;
        String sql = "UPDATE user SET WHERE cpf = ?, name = ?, age = ?, bookList = ?";
        BookJSONSerializer serializer = new BookJSONSerializer();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            
            stmt.setString(1, codObjO);
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getAge());
            stmt.setString(4, serializer.toFile(user.getBooks()));
            stmt.executeUpdate();
            
        }catch (SQLException e) {
    System.out.println("ERROR!\nCan't update User.\n" + e.getMessage());
}

    }

    @Override
    public void remove(String codObjO) {
        String sql = "DELETE FROM user WHERE cpf = ?";
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, codObjO);
        }catch (SQLException e) {
    System.out.println("ERROR!\nCan't remove User.\n" + e.getMessage());
}

    }

    @Override
    public Object find(String codObjO) {
        String sql = "SELECT * FROM user WHERE cpf = ?";
        BookJSONSerializer serializer = new BookJSONSerializer();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, codObjO);
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next())
                {
                    return new User(
                            serializer.fromFile(rs.getString("books")),
                            rs.getString("name"),
                            rs.getString("age"),
                            rs.getString("cpf")
                    );
                }
            }
        }catch (SQLException e) {
    System.out.println("ERROR!\nCan't find User.\n" + e.getMessage());
}

        
        return null;
    }

    @Override
    public List findAll() {
        String sql = "SELECT * FROM user";
        List<User> users = new ArrayList<>();
        BookJSONSerializer serializer = new BookJSONSerializer();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
            {
                users.add(new User(
                            serializer.fromFile(rs.getString("books")),
                            rs.getString("name"),
                            rs.getString("age"),
                            rs.getString("cpf")
                ));
            }
        }catch (SQLException e) {
    System.out.println("ERROR!\nCan't find User.\n" + e.getMessage());
}

        
        return users;
    }
}
