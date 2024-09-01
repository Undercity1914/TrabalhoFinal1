/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.controller;

import java.util.List;
import trabalho.libraryproject.model.DAO.IDao;
import trabalho.libraryproject.model.ValidationData.AuthorValidation;
import trabalho.libraryproject.model.entities.Author;
import trabalho.libraryproject.model.entities.Book;

/**
 *
 * @author marco
 */
public class AuthorController 
{
    private IDao repository;

    public AuthorController(IDao repository) {
        this.repository = repository;
    }
    
    public void add(String name, String cpf, String age)
    {
        AuthorValidation validation = new AuthorValidation();
        Author author = validation.validation(name, age, cpf);
        
        this.repository.save(author);
    }
    
    public void remove(String cpf)
    {
        this.repository.remove(cpf);
    }
    
    public Author find(String cpf)
    {
        return (Author) this.repository.find(cpf);
    }
    
    public List<Author> list()
    {
        return repository.findAll();
    }
    
    public void update(String oldCpf, String name, String age)
    {
        this.remove(oldCpf);
        this.add(name, age, oldCpf);
    }
}
