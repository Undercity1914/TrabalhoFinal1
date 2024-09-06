/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.DAO;

import java.util.ArrayList;
import java.util.List;
import trabalho.libraryproject.model.entities.User;
import trabalho.libraryproject.model.file.FilePersistence;
import trabalho.libraryproject.model.file.UserJSONSelializer;

/**
 *
 * @user marco
 */
public class UserDAOFile implements IDao
{
    private UserJSONSelializer serializer = new UserJSONSelializer("ListagemUsusarios.json");
    private FilePersistence filePersistence = new FilePersistence();
    private String patchFile;
    private List<User> users;

    public UserDAOFile(String patchFile) {
        this.patchFile = patchFile;
        this.users = new ArrayList<>();
    }

    @Override
    public void save(Object objO) {
        User user = (User) objO;
        List<User> users = this.findAll();
        users.add(user);
        
        String jsonData = serializer.toFile(users);
        filePersistence.saveToFile(jsonData, this.patchFile);
    }

    @Override
    public void update(String codObjO, Object objO) {
       throw new UnsupportedOperationException("ERROR! \nUnuserized Access.");

    }

    @Override
    public void remove(String codObjO) {
        User user = (User) this.find(codObjO);
        
        if(user != null)
        {
            List<User> users = this.findAll();
            users.remove(user);
            
            String jsonData = serializer.toFile(users);
            filePersistence.saveToFile(jsonData, this.patchFile);
        }
    }

    @Override
    public Object find(String codObjO) {
        List<User> users = this.findAll();
        
        for(User user : users)
            if(user.getCpf().equals(codObjO))
                return user;
        
        return null;
    }

    @Override
    public List findAll() {
        String jsonData = filePersistence.loadFromFile(this.patchFile);
        return this.serializer.fromFile(jsonData);
    }
    
}
