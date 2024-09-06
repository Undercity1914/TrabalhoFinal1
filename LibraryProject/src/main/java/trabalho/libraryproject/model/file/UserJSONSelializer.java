/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.file;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import trabalho.libraryproject.model.entities.User;

/**
 *
 * @author 15102938681
 */
public class UserJSONSelializer 
{
    private String listagemUsusariosjson;
    
    public UserJSONSelializer(String listagemUsusariosjson) {
        this.listagemUsusariosjson = listagemUsusariosjson;
    }
    public String toFile(List<User> users) {
        try {
             
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(users);

            return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
    public List<User> fromFile(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
             
            List<User> users = mapper.readValue(jsonString, new TypeReference<List<User>>() {});
           
            
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
