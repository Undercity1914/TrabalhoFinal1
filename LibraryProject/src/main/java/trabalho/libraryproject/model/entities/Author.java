/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author marco
 */
public class Author extends Person
{
    private List<Book> booksWritten;

    public Author(List<Book> booksWritten, String name, String age, String cpf) {
        super(name, age, cpf);
        this.booksWritten = booksWritten;
    }

    public Author(List<Book> booksWritten) {
        this.booksWritten = booksWritten;
    }

    public Author(List<Book> booksWritten, Person other) {
        super(other);
        this.booksWritten = booksWritten;
    }
    
    public Author()
    {
        super();
        this.booksWritten = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Author{" + "booksWritten=" + booksWritten + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.booksWritten);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        return Objects.equals(this.booksWritten, other.booksWritten);
    }

    public List<Book> getBooks() {
        return booksWritten;
    }

    public void setBooks(List<Book> booksWritten) {
        this.booksWritten = booksWritten;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    @Override
    public String getAge() {
        return age;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
