/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.controller;

import java.util.List;
import trabalho.libraryproject.model.DAO.IDao;
import trabalho.libraryproject.model.ValidationData.UserValidation;
import trabalho.libraryproject.model.entities.User;

/**
 *
 * @user marco
 */
public class UserController 
{
    private IDao repository;

    public UserController(IDao repository) {
        this.repository = repository;
    }
    
    public void add(String name, String cpf, String age)
    {
        UserValidation validation = new UserValidation();
        User user = validation.validation(name, age, cpf);
        
        this.repository.save(user);
    }
    
    public void remove(String cpf)
    {
        this.repository.remove(cpf);
    }
    
    public User find(String cpf)
    {
        return (User) this.repository.find(cpf);
    }
    
    public List<User> list()
    {
        return repository.findAll();
    }
    
    public void update(String oldCpf, String name,String cpf, String age)
    {
        this.remove(oldCpf);
        this.add(name, age, oldCpf);
    }
}
