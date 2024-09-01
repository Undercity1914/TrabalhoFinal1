/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.ValidationData;

import trabalho.libraryproject.model.entities.Author;
import trabalho.libraryproject.model.entities.Book;
import trabalho.libraryproject.model.exceptions.BookException;





/**
 *
 * @author marco
 */
public class BookValidation 
{
    
    
    public Book validation(String title, Author author, String isbn, String publicationYear)
    {
        Book book = new Book();
        
        if(title.isEmpty())
            throw new BookException("ERROR! Title field can't be empty.");
        book.setTitle(title);
        
        if(author == null)
            throw new BookException("ERROR! Author field can't be empty.");
        book.setAuthor(author);
        
        if(isbn.isEmpty())
            throw new BookException("ERROR! ISBN field can't be empty.");
        book.setIsbn(isbn);
        
        if(publicationYear.isEmpty())
            throw new BookException("ERROR! Publication year field can't be empty.");
        book.setPublicationYear(publicationYear);
        
        return book;
    }
}
