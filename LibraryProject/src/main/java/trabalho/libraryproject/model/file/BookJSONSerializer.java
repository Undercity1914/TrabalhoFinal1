/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.file;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import trabalho.libraryproject.model.entities.Book;

/**
 *
 * @author 15102938681
 */
public class BookJSONSerializer 
{
    public String toFile(List<Book> books) {
        try {
             
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(books);

            return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
    public List<Book> fromFile(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
             
            List<Book> books = mapper.readValue(jsonString, new TypeReference<List<Book>>() {});
           
            
            return books;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
