/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.controller;

import java.util.List;
import trabalho.libraryproject.model.DAO.IDao;
import trabalho.libraryproject.model.ValidationData.BookValidation;
import trabalho.libraryproject.model.entities.Author;
import trabalho.libraryproject.model.entities.Book;

/**
 *
 * @author marco
 */
public class BookController 
{
    private IDao repository;

    public BookController(IDao repository) {
        this.repository = repository;
    }
    
    public void add(String title, Author author, String isbn, String publicationYear)
    {
        BookValidation validation = new BookValidation();
        Book book = validation.validation(title, author, isbn, publicationYear);
        
        this.repository.save(book);
    }
    
    public void remove(String cpf)
    {
        this.repository.remove(cpf);
    }
    
    public Book find(String cpf)
    {
        return (Book) this.repository.find(cpf);
    }
    
    public List<Book> list()
    {
        return repository.findAll();
    }
    
    public void update(String oldIsbn, String title, Author author, String publicationYear)
    {
        this.remove(oldIsbn);
        this.add(title, author, oldIsbn, publicationYear);
    }
}
