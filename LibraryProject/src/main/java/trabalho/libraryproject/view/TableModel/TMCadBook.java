/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.view.TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import trabalho.libraryproject.model.entities.Book;

/**
 *
 * @author Windows
 */
public class TMCadBook extends AbstractTableModel {
    private List<Book> books;  
  
    
    private final int COL_TITLE= 0;
    private final int COL_AUTHOR = 1;
    private final int COL_ISBN = 2;
    private final int COL_PUBLICATIONYEAR = 3;
    
    public TMCadBook(List<Book> books){
        this.books = books;
    }
    

    @Override
    public int getRowCount() {
        return this.books.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
        
       
    }
    
    public Book getObjetoAuthor(int row){
        return this.books.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book b = this.books.get(rowIndex);
        switch (columnIndex){
            case COL_TITLE :
                return b.getTitle();
            case COL_AUTHOR :
                return b.getAuthor();
            case COL_ISBN :
                return b.getIsbn();
            case COL_PUBLICATIONYEAR :
                return b.getPublicationYear();
            default:
                break;
            }
        return "-";
        }
    @Override
    public String getColumnName(int columnIndex){
        if(columnIndex == COL_TITLE ){
            return "TITLE";
        }else if(columnIndex == COL_AUTHOR){
            return "AUTHOR";
        }else if(columnIndex == COL_ISBN){
            return "ISBN";
        }else if (columnIndex == COL_PUBLICATIONYEAR){
            return "PUBLICATION YEAR";
        }
        return "";
    }
        
    }
    

