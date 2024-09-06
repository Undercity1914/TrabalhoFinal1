/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.file;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import trabalho.libraryproject.model.entities.Author;


/**
 *
 * @author 15102938681
 */
public class AuthorJSONSerializer 
{
    private String patchFile;
    public AuthorJSONSerializer(String patchFile)
    {
        this.patchFile = patchFile;
    }
    public String toFile(List<Author> authors) {
        try {
             
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(authors);

            return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
    public List<Author> fromFile(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
             
            List<Author> authors = mapper.readValue(jsonString, new TypeReference<List<Author>>() {});
           
            
            return authors;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
