/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.DAO;

import java.util.List;
import trabalho.libraryproject.model.entities.Book;
import trabalho.libraryproject.model.file.BookJSONSerializer;
import trabalho.libraryproject.model.file.FilePersistence;

/**
 *
 * @author marco
 */
public class BookDAOFile implements IDao
{
    private BookJSONSerializer serializer = new BookJSONSerializer();
    private FilePersistence filePersistence = new FilePersistence();
    private String patchFile;

    public BookDAOFile(String patchFile) {
        this.patchFile = patchFile;
    }

    @Override
    public void save(Object objO) {
        Book author = (Book) objO;
        List<Book> books = this.findAll();
        books.add(author);
        
        String jsonData = serializer.toFile(books);
        filePersistence.saveToFile(jsonData, this.patchFile);
    }

    @Override
    public void update(String codObjO, Object objO) {
        throw new UnsupportedOperationException("""
                                                ERROR! 
                                                Unauthorized Access.""");
    }

    @Override
    public void remove(String codObjO) {
        Book author = (Book) this.find(codObjO);
        
        if(author != null)
        {
            List<Book> books = this.findAll();
            books.remove(author);
            
            String jsonData = serializer.toFile(books);
            filePersistence.saveToFile(jsonData, this.patchFile);
        }
    }

    @Override
    public Object find(String codObjO) {
        List<Book> books = this.findAll();
        
        for(Book author : books)
            if(author.getIsbn().equals(codObjO))
                return author;
        
        return null;
    }

    @Override
    public List findAll() {
        String jsonData = filePersistence.loadFromFile(this.patchFile);
        return this.serializer.fromFile(jsonData);
    }
}
