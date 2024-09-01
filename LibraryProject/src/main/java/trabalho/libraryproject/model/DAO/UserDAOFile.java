/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.DAO;

import java.util.List;
import trabalho.libraryproject.model.entities.User;
import trabalho.libraryproject.model.file.FilePersistence;
import trabalho.libraryproject.model.file.UserJSONSelializer;

/**
 *
 * @author marco
 */
public class UserDAOFile implements IDao
{
    private UserJSONSelializer serializer = new UserJSONSelializer();
    private FilePersistence filePersistence = new FilePersistence();
    private String patchFile;

    public UserDAOFile(String patchFile) {
        this.patchFile = patchFile;
    }

    @Override
    public void save(Object objO) {
        User author = (User) objO;
        List<User> users = this.findAll();
        users.add(author);
        
        String jsonData = serializer.toFile(users);
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
        User author = (User) this.find(codObjO);
        
        if(author != null)
        {
            List<User> users = this.findAll();
            users.remove(author);
            
            String jsonData = serializer.toFile(users);
            filePersistence.saveToFile(jsonData, this.patchFile);
        }
    }

    @Override
    public Object find(String codObjO) {
        List<User> users = this.findAll();
        
        for(User author : users)
            if(author.getCpf().equals(codObjO))
                return author;
        
        return null;
    }

    @Override
    public List findAll() {
        String jsonData = filePersistence.loadFromFile(this.patchFile);
        return this.serializer.fromFile(jsonData);
    }
    
}
