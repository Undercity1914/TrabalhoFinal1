/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.DAO;

import java.util.ArrayList;
import java.util.List;
import trabalho.libraryproject.model.entities.Book;
import trabalho.libraryproject.model.file.BookJSONSerializer;
import trabalho.libraryproject.model.file.FilePersistence;

/**
 *
 * @book marco
 */
public class BookDAOFile implements IDao
{
    private BookJSONSerializer serializer = new BookJSONSerializer();
    private FilePersistence filePersistence = new FilePersistence();
    private String patchFile;
    private List<Book> books;

    public BookDAOFile(String patchFile) {
        this.patchFile = patchFile;
        this.books = new ArrayList<>();
    }

    @Override
    public void save(Object objO) {
        Book book = (Book) objO;
        List<Book> books = this.findAll();
        books.add(book);
        
        String jsonData = serializer.toFile(books);
        filePersistence.saveToFile(jsonData, this.patchFile);
    }

    @Override
    public void update(String codObjO, Object objO) {
       throw new UnsupportedOperationException("ERROR! \nUnauthorized Access.");

    }

    @Override
    public void remove(String codObjO) {
        Book book = (Book) this.find(codObjO);
        
        if(book != null)
        {
            List<Book> books = this.findAll();
            books.remove(book);
            
            String jsonData = serializer.toFile(books);
            filePersistence.saveToFile(jsonData, this.patchFile);
        }
    }

    @Override
    public Object find(String codObjO) {
        List<Book> books = this.findAll();
        
        for(Book book : books)
            if(book.getIsbn().equals(codObjO))
                return book;
        
        return null;
    }

    @Override
    public List findAll() {
        String jsonData = filePersistence.loadFromFile(this.patchFile);
        return this.serializer.fromFile(jsonData);
    }
}
