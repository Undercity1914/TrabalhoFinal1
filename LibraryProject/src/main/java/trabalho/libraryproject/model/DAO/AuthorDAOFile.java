/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.DAO;

import java.util.ArrayList;
import java.util.List;
import trabalho.libraryproject.model.entities.Author;
import trabalho.libraryproject.model.file.AuthorJSONSerializer;
import trabalho.libraryproject.model.file.FilePersistence;

/**
 *
 * @author marco
 */
public class AuthorDAOFile implements IDao
{
    private List<Author> authors;
    private AuthorJSONSerializer serializer = new AuthorJSONSerializer("ListagemAutores.json");
    private FilePersistence filePersistence = new FilePersistence();
    private String patchFile;

    public AuthorDAOFile(String patchFile) {
        this.patchFile = patchFile;
        this.authors = new ArrayList<>();
    }

    @Override
    public void save(Object objO) {
        Author author = (Author) objO;
        List<Author> authors = this.findAll();
        authors.add(author);
        
        String jsonData = serializer.toFile(authors);
        filePersistence.saveToFile(jsonData, this.patchFile);
    }

    @Override
    public void update(String codObjO, Object objO) {
        throw new UnsupportedOperationException("ERROR! \nUnauthorized Access.");
    }

    @Override
    public void remove(String codObjO) {
        Author author = (Author) this.find(codObjO);
        
        if(author != null)
        {
            List<Author> authors = this.findAll();
            authors.remove(author);
            
            String jsonData = serializer.toFile(authors);
            filePersistence.saveToFile(jsonData, this.patchFile);
        }
    }

    @Override
    public Object find(String codObjO) {
        List<Author> authors = this.findAll();
        
        for(Author author : authors)
            if(author.getCpf().equals(codObjO))
                return author;
        
        return null;
    }

    @Override
    public List<Author> findAll() {
        String jsonData = filePersistence.loadFromFile(this.patchFile);
        return this.serializer.fromFile(jsonData);
    }
    
}
