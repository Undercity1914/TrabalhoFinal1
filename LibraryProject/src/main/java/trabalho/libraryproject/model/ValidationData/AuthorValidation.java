/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.ValidationData;

import trabalho.libraryproject.model.entities.Author;
import trabalho.libraryproject.model.exceptions.AuthorException;

/**
 *
 * @author marco
 */
public class AuthorValidation 
{
    public Author validation(String name, String age, String cpf)
    {
        Author author = new Author();
        
        if(name.isEmpty())
            throw new AuthorException("ERROR! Name field can't be empty.");
        author.setName(name);
        
        if(age.isEmpty())
            throw new AuthorException("ERROR! Age field can't be empty.");
        author.setAge(age);
        
        if(cpf.isEmpty())
            throw new AuthorException("ERROR! CPF field can't be empty.");
        
        return author;
    }
}
