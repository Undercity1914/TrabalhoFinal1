/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import trabalho.libraryproject.model.entities.Author;
import trabalho.libraryproject.model.entities.Book;

/**
 *
 * @author igorxf
 */
public class BookDAODataBase implements IDao
{
    private Connection connection;

    public BookDAODataBase(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void save(Object objO) {
        Book book = (Book) objO;
        String sql = "INSERT INTO book (title, author, isbn) VALUES (?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor().getCpf());
            stmt.setString(3, book.getIsbn());
            stmt.executeUpdate();
        }catch(SQLException e)
        {
            System.out.println("""
                               ERROR!
                               Can't save the book.
                               """ + e.getMessage());
        }
    }

    @Override
    public void update(String codObjO, Object objO) {
        Book book = (Book) objO;
        String sql = "UPDATE book SET title = ?, author = ?, WHERE isbn = ?";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor().getCpf());
            stmt.setString(3, codObjO);
            stmt.executeUpdate();
        }catch(SQLException e)
        {
            System.out.println("""
                               ERROR!
                               Can't update the Book.
                               """ + e.getMessage());
        }
    }

    @Override
    public void remove(String codObjO) {
        String sql = "DELETE FROM book WHERE isbn = ?";
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, codObjO);
        }catch(SQLException e)
        {
            System.out.println("""
                               ERROR! 
                               Can't remove Book.
                               """ + e.getMessage());
        }
    }

    @Override
    public Object find(String codObjO) {
       String sql = "SELECT * FROM book WHERE isbn= ?";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, codObjO);
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next())
                {
                    String id = rs.getString("authorId");
                    
                    AuthorDAODataBase db = new AuthorDAODataBase(connection);
                    
                    Author author = (Author) db.find(id);
                    
                    Book book = new Book(rs.getString("title"),
                            author,
                            rs.getString("isbn"),
                            rs.getString("publicationYear")
                           );
                    
                    return book;
                }
            }
        }catch(SQLException e)
        {
            System.out.println("""
                               ERROR! 
                               Can't find Author.
                               """ + e.getMessage());
        }
        
        return null;
    }

    @Override
    public List findAll() {
        
        
        return null;
    }
    
}
