/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.ValidationData;

import trabalho.libraryproject.model.entities.User;
import trabalho.libraryproject.model.exceptions.UserException;



/**
 *
 * @author marco
 */
public class UserValidation 
{
    public User validation(String name, String age, String cpf)
    {
       User user = new User();
       
       if(name.isEmpty())
           throw new UserException("ERROR! Name field can't be empty.");
       user.setName(name);
       
       if(age.isEmpty())
           throw new UserException("ERROR! Age field can't be empty.");
       user.setAge(age);
       
       if(cpf.isEmpty())
           throw new UserException("ERROR! CPF field can't be empty.");
       user.setCpf(cpf);
       
       return user;
    }
}
